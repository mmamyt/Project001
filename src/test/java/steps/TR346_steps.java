package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TR345Page;
import pages.TR346Page;
import utilities.Driver;

public class TR346_steps {

    TR345Page tr345 = new TR345Page();
    TR346Page tr346 = new TR346Page();
    Actions actions = new Actions(Driver.getDriver());

    public void user_is_on_home_page() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
    }

    public void i_have_added_one_product_to_cart() {
        actions.moveToElement(tr345.product).perform();
        tr345.addToCartButton.click();
        tr345.closeTab.click();
    }

    @When("I hoverover the cart")
    public void i_hoverover_the_cart() {
        actions.moveToElement(tr346.hoverOverCart).perform();
    }

    @Then("I see information about the product inside of the cart")
    public void i_see_information_about_the_product_inside_of_the_cart() {
        Assert.assertTrue(tr346.cartBlock.isDisplayed());
    }
}
