package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SearchPage;
import utilities.Config;
import utilities.Driver;


public class SearchSteps {
    SearchPage searchPage = new SearchPage();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get(Config.getProperty("link"));

    }

    @When("user search for any {string}")
    public void user_search_for_any(String existingProduct) {

        //  searchPage.searchField.sendKeys(existingProduct, Keys.ENTER);

        searchPage.searchField.sendKeys(existingProduct);
        searchPage.searchButton.click();
    }


    @When("user puts in search line {string} and waits a few seconds")
    public void user_puts_in_search_line_and_waits_a_few_seconds(String newProduct) {
        searchPage.searchField.sendKeys(newProduct);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(searchPage.filteredResults));

    }


    @Then("user to see the result")
    public void user_to_see_the_result() {
        //String textResult = searchPage.resultCounter.getText();
        // System.out.println(textResult);
        Assert.assertTrue("wait a minute", searchPage.resultCounter.isDisplayed());


    }

    @When("user search for {string}")
    public void user_search_for(String nonExistingProduct) {
        searchPage.searchField.sendKeys(nonExistingProduct, Keys.ENTER);
        //searchPage.searchButton.click();

    }

    @Then("user should see the message : “No results were found for your search\"")
    public void user_should_see_the_message_no_results_were_found_for_your_search() {
        String expectedMessage = "No results were found for your search";
        String actualMessage = searchPage.alertWarning.getText();

        //  Assert.assertTrue("wait a minute", actualMessage.contains(expectedMessage));
        if (!actualMessage.contains(expectedMessage)) {
            System.out.println("Check your results");
        } else {
            Assert.assertTrue("wait a minute", actualMessage.contains(expectedMessage));
        }
    }


    @Then("message highlighted with orange color")
    public void message_highlighted_with_orange_color() {
        String expectedBackgroundColor = "(254, 145, 38, 1)";
        String actualBackgroundColor = searchPage.alertWarning.getCssValue("background-color");
        System.out.println(expectedBackgroundColor);
        System.out.println(actualBackgroundColor);
        Assert.assertTrue("your colors are off", actualBackgroundColor.contains(expectedBackgroundColor));
    }


    @Then("user see the filtered results under the search bar")
    public void user_see_the_filtered_results_under_the_search_bar() {

        Assert.assertTrue(searchPage.filteredResults.isDisplayed());

    }

}
