package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TR345Page;
import utilities.Driver;

public class TR345_steps {
    TR345Page tr345 = new TR345Page();

    public void user_is_on_home_page() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
    }

    @Given("user adds one product to cart")
    public void user_adds_one_product_to_cart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(tr345.product).perform();
        tr345.addToCartButton.click();
        tr345.closeTab.click();
    }

    @Then("the cart will show 1 Product")
    public void the_cart_will_show_product() {
        String one = "1";
        String actualQuantity = tr345.itemQuantity.getText();
        Assert.assertTrue(actualQuantity.contains(one));
    }

    @When("user opens the cart after adding")
    public void user_opens_the_cart_after_adding() {
        tr345.viewCart.click();
    }

    @Then("user sees that specific product inside of the cart")
    public void user_sees_that_specific_product_inside_of_the_cart() {

    }

}
