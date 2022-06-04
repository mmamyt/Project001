package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TR338Page;
import utilities.Driver;

public class TR359_steps{
    TR358_steps tr358 = new TR358_steps();
    TR338Page tr338 = new TR338Page();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String address = faker.address().fullAddress();
    String city = faker.address().city();
    String zipCode = faker.address().zipCode();
    String mobilePhone = faker.phoneNumber().cellPhone();

    @Given("user is on sign in page")
    public void user_is_on_sign_in_page() {
        tr358.user_is_on_summary_page();
        tr358.the_user_clicks_on_proceed_to_checkout();
        tr358.user_should_be_brought_to_sign_in_page();
    }

    @When("user inputs a valid email in the create an account block")
    public void user_inputs_a_valid_email_in_the_create_an_account_block() {
        tr338.enterEmailAddress.sendKeys(email);
        tr338.createAccountButton.click();
    }

    @Then("user will be navigated to a page that asks to enter personal information")
    public void user_will_be_navigated_to_a_page_that_asks_to_enter_personal_information() {
        String expected = "YOUR PERSONAL INFORMATION";
        String actual = tr338.personalInformation.getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("user completes the page")
    public void user_completes_the_page() {
        tr338.firstName.sendKeys(firstName);
        tr338.lastName.sendKeys(lastName);
        tr338.password.sendKeys(password);

        System.out.println("email: " + email + " password: " + password);

        Select selectDay = new Select(tr338.dayOfBirth);
        selectDay.selectByIndex(faker.number().numberBetween(1,29));

        Select selectMonth = new Select(tr338.monthOfBirth);
        selectMonth.selectByIndex(faker.number().numberBetween(1,12));

        Select selectYear = new Select(tr338.yearOfBirth);
        selectYear.selectByIndex(faker.number().numberBetween(19,40));

        tr338.fullAddress.sendKeys(address);
        tr338.city.sendKeys(city);

        Select selectState = new Select(tr338.state);
        selectState.selectByIndex(faker.number().numberBetween(1,50));

        tr338.zipCode.sendKeys(zipCode.substring(0,5));
        tr338.mobilePhone.sendKeys(mobilePhone);
    }

    @When("user clicks on Register button")
    public void user_clicks_on_register_button() {
        tr338.registerButton.click();
    }

    @Then("user will be navigated to Address page")
    public void user_will_be_navigated_to_address_page() {
        wait.until(ExpectedConditions.visibilityOf(tr338.addressesPage));

        String expected = "ADDRESSES";
        String actual = tr338.addressesPage.getText();

        Assert.assertTrue(actual.contains(expected));
    }

    @Then("by default checkmark for: Use the delivery address as the billing address will be selected")
    public void by_default_checkmark_for_use_the_delivery_address_as_the_billing_address_will_be_selected() {
        Assert.assertTrue(tr338.addressCheckbox.isSelected());
    }

    @When("user click next")
    public void user_click_next() {
        wait.until(ExpectedConditions.visibilityOf(tr338.proceedToCheckout3));
        actions.moveToElement(tr338.proceedToCheckout3);
        actions.perform();
        tr338.proceedToCheckout3.click();
    }

    @Then("user will see Shipping page")
    public void user_will_see_shipping_page() {
        wait.until(ExpectedConditions.visibilityOf(tr338.shippingPage));
        String expected = "SHIPPING";
        String actual = tr338.shippingPage.getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("user need to agree with terms \\(by default agreement checkmark should not be selected)")
    public void user_need_to_agree_with_terms_by_default_agreement_checkmark_should_not_be_selected() {
        Assert.assertFalse(tr338.termsAgreement.isSelected());
        tr338.termsAgreement.click();
    }

    @Then("user navigates to next page")
    public void user_navigates_to_next_page() {
        tr338.proceedToCheckout4.click();
    }

    @Then("user will be on payment page")
    public void user_will_be_on_payment_page() {
        wait.until(ExpectedConditions.visibilityOf(tr338.paymentPage));
        String expected = "PLEASE CHOOSE YOUR PAYMENT METHOD";
        String actual = tr338.paymentPage.getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("shipment cost of 2$ will be included")
    public void shipment_cost_of_2$_will_be_included() {
        String expected = "$2.00";
        String actual = tr338.shippingCost.getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("user should see two payment options: Pay by bank wire or Pay by check")
    public void user_should_see_two_payment_options_pay_by_bank_wire_or_pay_by_check() {
        wait.until(ExpectedConditions.visibilityOf(tr338.bankWire));
        actions.moveToElement(tr338.bankWire);
        actions.perform();
        Assert.assertTrue(tr338.bankWire.isDisplayed());
        Assert.assertTrue(tr338.cheque.isDisplayed());
    }

    @When("user selects by bank wire")
    public void user_selects_by_bank_wire() {
        tr338.bankWire.click();
    }

    @Then("user will see the confirmation button")
    public void user_will_see_the_confirmation_button() {
        Assert.assertTrue(tr338.confirmationButton.isDisplayed());
    }

    @When("user clicks on confirm order")
    public void user_clicks_on_confirm_order() {
        tr338.confirmationButton.click();
    }

    @Then("the text “Your order on My Store is complete.” will be displayed")
    public void the_text_your_order_on_my_store_is_complete_will_be_displayed() {
        String expected = "Your order on My Store is complete.";
        String actual = tr338.orderConfirmationMessage.getText();
        Assert.assertTrue(actual.contains(expected));
    }

}
