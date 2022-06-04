package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
import pages.TR344Page;
import utilities.Driver;


public class TR344_steps {
    String expected = "Your shopping cart is empty.";
    TR344Page tr344 = new TR344Page();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
    }

    @Given("user does not have a products selected yet")
    public void user_does_not_have_a_products_selected_yet() {
        Assert.assertTrue(tr344.emptyCart.isDisplayed());
    }

    @When("user opens the cart")
    public void user_opens_the_cart() {
        tr344.cart.click();
    }

    @Then("user sees message : “ Your shopping cart is empty.”")
    public void user_sees_message_your_shopping_cart_is_empty() {
        String actual = tr344.message.getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("message will be highlighted with orange color")
    public void message_will_be_highlighted_with_orange_color() {
      String s = tr344.message.getCssValue("background-color");
      String c = Color.fromString(s).asHex();
      String orange = "#fe9126";
      Assert.assertTrue(c.equals(orange));
    }
}
