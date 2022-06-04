package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TR346Page {
    public TR346Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title=\"View my shopping cart\"]")
    public WebElement hoverOverCart;

    @FindBy(xpath = "//div[@class=\"cart_block_list\"]")
    public WebElement cartBlock;
}
