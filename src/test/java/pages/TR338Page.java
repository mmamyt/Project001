package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TR338Page {
    public TR338Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement proceedToCheckout1;

    @FindBy(xpath = "//*[@id=\"cart_title\"]")
    public WebElement shoppingCartSummary;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public WebElement proceedToCheckout2;

    @FindBy(xpath = "//*[@id=\"order_step\"]/li[2]/span")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name=\"email_create\"]")
    public WebElement enterEmailAddress;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[@id=\"account-creation_form\"]/div[1]/h3")
    public WebElement personalInformation;

    @FindBy(xpath = "//input[@onkeyup=\"$('#firstname').val(this.value);\"]")
    public WebElement firstName;

    @FindBy(xpath = "//input[@onkeyup=\"$('#lastname').val(this.value);\"]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//select[@id=\"days\"]")
    public WebElement dayOfBirth;

    @FindBy(xpath = "//select[@id=\"months\"]")
    public WebElement monthOfBirth;

    @FindBy(xpath = "//select[@id=\"years\"]")
    public WebElement yearOfBirth;

    @FindBy(xpath = "//*[@name=\"address1\"]")
    public WebElement fullAddress;

    @FindBy(xpath = "//*[@id=\"city\"]")
    public WebElement city;

    @FindBy(xpath = "//*[@id=\"id_state\"]")
    public WebElement state;

    @FindBy(xpath = "//input[@ id=\"postcode\"]")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    public WebElement mobilePhone;

    @FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    public WebElement addressesPage;

    @FindBy(xpath = "//*[@id=\"addressesAreEquals\"]")
    public WebElement addressCheckbox;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    public WebElement proceedToCheckout3;

    @FindBy(xpath = "//*[@id=\"carrier_area\"]/h1")
    public WebElement shippingPage;

    @FindBy(xpath = "//input[@name=\"cgv\"]")
    public WebElement termsAgreement;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    public WebElement proceedToCheckout4;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    public WebElement paymentPage;

    @FindBy(xpath = "//td[@id=\"total_shipping\"]")
    public WebElement shippingCost;

    @FindBy(xpath = "//a[@class=\"bankwire\"]")
    public WebElement bankWire;

    @FindBy(xpath = "//a[@class=\"cheque\"]")
    public WebElement cheque;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    public WebElement confirmationButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div")
    public WebElement orderConfirmationMessage;
}
