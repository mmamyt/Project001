package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TR361Page {
    public TR361Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
   public   WebElement contactUsBtn;

    @FindBy(xpath = "//*[@id=\"id_contact\"]/option[@value='2']")
    public WebElement customerServiceOption;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='id_order']")
    public WebElement referenceOrder;

    @FindBy(css = "[class='action']")
    public WebElement chooseFile;

    @FindBy(xpath = "//*[@id='message']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@id=\"submitMessage\"]/span/text()")
    public WebElement sendBtn;

    @FindBy(css = "[class='alert alert-success']")
   public WebElement successMessage;



}
