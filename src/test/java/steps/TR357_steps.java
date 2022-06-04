package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TR338Page;
import pages.TR337Page;
import utilities.Driver;

public class TR357_steps {

    TR337Page tr337 = new TR337Page();
    TR338Page tr338 = new TR338Page();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

    public void user_adds_one_product_to_cart() {
        actions.moveToElement(tr337.product).perform();
        tr337.addToCartButton.click();
    }

    @When("user clicks checkout")
    public void user_clicks_checkout() {
        tr338.proceedToCheckout1.click();
    }

    @Then("the user will be navigated to SHOPPING-CART SUMMARY page")
    public void the_user_will_be_navigated_to_shopping_cart_summary_page() {
        String expected = "SHOPPING-CART SUMMARY";
        String actual = tr338.shoppingCartSummary.getText();
        Assert.assertTrue(actual.contains(expected));
    }
    @When("the user clicks on Proceed to checkout")
    public void the_user_clicks_on_proceed_to_checkout() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(tr338.proceedToCheckout2));
        actions.moveToElement(tr338.proceedToCheckout2);
        actions.perform();
        tr338.proceedToCheckout2.click();
    }

    @Then("user should be brought to sign in page")
    public void user_should_be_brought_to_sign_in_page() {
        String expected = "Sign in";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(tr338.signIn));
        String actual = tr338.signIn.getText();
        Assert.assertTrue(actual.contains(expected));
    }

}
