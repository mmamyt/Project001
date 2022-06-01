package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TR344Page {

    public TR344Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class=\"ajax_cart_no_product\"]")
    public WebElement emptyCart;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
    public WebElement cart;

    @FindBy(xpath = "//p[@class=\"alert alert-warning\"]")
    public WebElement message;

}
