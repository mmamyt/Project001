package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TR338Page;
import pages.TR345Page;
import utilities.Driver;

public class TR358_steps {
    TR345Page tr345 = new TR345Page();
    TR338Page tr338 = new TR338Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user is on summary page")
    public void user_is_on_summary_page() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
        actions.moveToElement(tr345.product).perform();
        tr345.addToCartButton.click();
        tr338.proceedToCheckout1.click();
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
