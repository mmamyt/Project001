package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TR361Page;
import utilities.Driver;

public class TR361_steps {

    TR361Page tr361 = new TR361Page();

    @Given("I am at the home page")
    public void i_am_at_the_home_page() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
    }
    @Then("I click on contact us")
    public void i_click_on_contact_us() {
        tr361.contactUsBtn.click();
    }
    @Then("I should be directed to customer service page")
    public void i_should_be_directed_to_customer_service_page() {
       tr361.customerServiceOption.click();
      tr361.email.sendKeys("example@gmail.com");
      tr361.referenceOrder.sendKeys("12123212");
      tr361.chooseFile.sendKeys("/Users/anisakalonova/Desktop/Screen Shot 2022-06-03 at 11.02.46 PM.png");
      tr361.chooseFile.click();
      tr361.messageBox.sendKeys("Hello, Please see my attachment for my order");
      tr361.sendBtn.click();
    }
    @Then("I should be able to send a message to customer service team")
    public void i_should_be_able_to_send_a_message_to_customer_service_team() {
      Assert.assertTrue( tr361.successMessage.isDisplayed());
    }

}
