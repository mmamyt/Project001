package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TR338Page;
import pages.TR345Page;
import utilities.Driver;

public class TR357_steps {

    TR345Page tr345 = new TR345Page();
    TR338Page tr338 = new TR338Page();

    public void user_adds_one_product_to_cart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(tr345.product).perform();
        tr345.addToCartButton.click();
    }

    @When("user clicks checkout")
    public void user_clicks_checkout() {
        tr338.proceedToCheckout1.click();
    }

    @Then("the user will be navigated to SHOPPING-CART SUMMARY page")
    public void the_user_will_be_navigated_to_shopping_cart_summary_page() {
        String expected = "SHOPPING-CART SUMMARY";
        String actual = tr338.shoppingCartSummary.getText();
        Assert.assertEquals(expected, actual);
    }

}
