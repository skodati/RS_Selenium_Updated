package RS_Online;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BuyingAProductPage;


public class BuyingABatterySteps {

     WebDriver driver;
     BuyingAProductPage testPage = new BuyingAProductPage(driver);


    @Before
    public void initializeBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\mk_sel/chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Given("^user is on the Home Page$")
    public void user_is_on_the_Home_Page() {
        driver.get("http://uk.rs-online.com/web");
    }

    @When("^User Clicked on ALl Products > Batteries$")
    public void user_Clicked_on_ALl_Products_Batteries() throws InterruptedException {
       Thread.sleep(2000);
       testPage = new BuyingAProductPage(driver);
       testPage.all_Products1.click();
        Thread.sleep(1000);
       testPage.Batteries.click();
     //  driver.findElement(By.cssSelector("li.allProducts > a")).click();
      //  BuyingAProductPage page = PageFactory.initElements(driver);
                //InitElements<BuyingAProductPage>(driver);
       // BuyingAProductPage.


    }
    @Then("^Navigated to Batteries Section$")
    public void navigated_to_Batteries_Section() {


    }

    @Then("^user Clicked on Cosel$")
    public void user_Clicked_on_Cosel() {
        testPage.cosel.click();

    }

    @And("^selected Powerline Filters$")
    public void selected_Powerline_Filters() {
        testPage.powerLines.click();
    }

    @Then("^Added a battery to the basket$")
    public void added_a_battery_to_the_basket() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().window().maximize();
        testPage.rsStockNumber.click();
       //driver.manage().window().maximize();
        Thread.sleep(1000);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",testPage.backOrder);
        testPage.backOrder.click();
         }

    @Then("^the basket should contain the selected product$")
    public void the_basket_should_contain_the_selected_product() {
        }

}
