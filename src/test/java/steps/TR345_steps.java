package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TR344Page;
import pages.TR345Page;
import utilities.Driver;


import java.util.Iterator;
import java.util.Set;

public class TR345_steps {
    TR345Page tr345 = new TR345Page();

    public void i_am_at_home_page() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
    }

    @Given("I have added one product to cart")
    public void i_have_added_one_product_to_cart() {
        tr345.viewProduct.click();
        tr345.addToCartButton.click();


        //tr345.closeTab.click();

    }

    @Then("the cart will show {int} Product")
    public void the_cart_will_show_product(Integer int1) {

    }

    @When("I open the cart after adding")
    public void i_open_the_cart_after_adding() {

    }

    @Then("I wan to see the that specific product inside of the card")
    public void i_wan_to_see_the_that_specific_product_inside_of_the_card() {

    }

}
