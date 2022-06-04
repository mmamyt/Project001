package steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TR345Page;
import pages.TR354Page;
import utilities.Driver;

public class TR354_steps {
    TR354Page tr354 = new TR354Page();
    @Given("I am in the home page")
    public void i_am_in_the_home_page() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
    }
    @When("I search for t-shirt")
    public void i_search_for_t_shirt() {
        tr354.search.sendKeys("t-shirt");
        tr354.searchButton.click();

    }
    @When("I should be able to see varieties of t-shirts to buy")
    public void i_should_be_able_to_see_varieties_of_t_shirts_to_buy() {
        Assert.assertTrue(tr354.tshirt.isDisplayed());

    }

}
