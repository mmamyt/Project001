package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage (){
        PageFactory.initElements(utilities.Driver.getDriver(), this);

    }

@FindBy (xpath = "//input[@name=\"search_query\"]")
public WebElement searchField;

    @FindBy(xpath = "//button[@name=\"submit_search\"]")
    public WebElement searchButton;

    @FindBy (xpath = "//span[@class=\"heading-counter\"]")
    public WebElement resultCounter;

    @FindBy (xpath = "//p[@class=\"alert alert-warning\"]")
    public WebElement alertWarning;

    @FindBy (xpath = "//div[@class=\"ac_results\"]")
    public WebElement filteredResults;





}
