package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TR337Page;

import utilities.Driver;

public class TR346_steps {
    TR337Page tr337 = new TR337Page();
    Actions actions = new Actions(Driver.getDriver());

    public void user_is_on_home_page() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
    }

    public void i_have_added_one_product_to_cart() {
        actions.moveToElement(tr337.product).perform();
        tr337.addToCartButton.click();
        tr337.closeTab.click();
    }

    @When("user hovers over the cart")
    public void user_hovers_over_the_cart() {
        actions.moveToElement(tr337.hoverOverCart).perform();
    }

    @Then("user sees information about the product inside of the cart")
    public void user_sees_information_about_the_product_inside_of_the_cart() {
        Assert.assertTrue(tr337.cartBlock.isDisplayed());
    }
}
