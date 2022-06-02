package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TR345Page {
    public TR345Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")
    public WebElement viewProduct;

    @FindBy(xpath = "iframe[id*=\"fancybox\"]")
    public WebElement iframe;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
    public WebElement closeTab;

    @FindBy(xpath = "//span[@class=\"ajax_cart_quantity unvisible\"]")
    public WebElement itemQuantity;

    @FindBy(xpath = "//a[@title=\"View my shopping cart\"]")
    public WebElement viewCart;

    @FindBy(xpath = "(//div[@class=\"product-image-container\"])[1]")
    public WebElement product;

}
