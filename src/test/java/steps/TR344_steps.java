package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
import pages.TR337Page;


public class TR344_steps {
    String expected = "Your shopping cart is empty.";
    TR337Page tr337 = new TR337Page();
    SearchSteps homePage = new SearchSteps();

    @Given("user does not have a products selected yet")
    public void user_does_not_have_a_products_selected_yet() {
        Assert.assertTrue(tr337.emptyCart.isDisplayed());
    }

    @When("user opens the cart")
    public void user_opens_the_cart() {
        tr337.cart.click();
    }

    @Then("user sees message : “ Your shopping cart is empty.”")
    public void user_sees_message_your_shopping_cart_is_empty() {
        String actual = tr337.message.getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("message will be highlighted with orange color")
    public void message_will_be_highlighted_with_orange_color() {
      String s = tr337.message.getCssValue("background-color");
      String c = Color.fromString(s).asHex();
      String orange = "#fe9126";
      Assert.assertEquals("Failed", c, orange);
    }
}
