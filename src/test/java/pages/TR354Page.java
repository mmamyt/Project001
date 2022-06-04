package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TR354Page {
    public TR354Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[@id='search_query_top']")
    public WebElement search;

    @FindBy(xpath="//*[@id='searchbox']/button")
    public WebElement searchButton;

    @FindBy(xpath="//*[@id='center_column']")
    public WebElement tshirt;



}
