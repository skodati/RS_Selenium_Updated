package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class BuyingAProductPage {

    // test comment

    public BuyingAProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "li.allProducts > a")
    public WebElement all_Products1;

    @FindBy(how = How.CSS, using = "li.allProducts > ul > li:nth-child(2) > a")
    public WebElement Batteries;

   // /html//div[@id='container']//ul[@class='primaryNavigation']//a[@title='All Products']

    @FindBy(how = How.CSS, using = "div#campaignBody div:nth-child(1) > div > div > div > div > div > a > div:nth-child(1) > div > img")
    public WebElement cosel;

    @FindBy(how = How.CSS, using = "ul#galleryPopularCategory li:nth-child(4) > a > div > img")
    public WebElement powerLines;

    @FindBy(how = How.CSS, using = "table#results-table tr:nth-child(1) > td.descriptionCol.compareContainer > div:nth-child(2) > a")
    public WebElement rsStockNumber;

   // @FindBy(how = How.CSS, using = "div.add-to-basket-container > div > button")
   @FindBy(how = How.CSS, using = "div#price-break-container div.add-to-basket-container > div > button[type=\"button\"]")
    public WebElement backOrder;

   // btn btn-primary-red btn-large btn-add-to-basket


    }
