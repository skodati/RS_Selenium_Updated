package RS_Online;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
public class CategoriesSteps {

    private static WebDriver driver;

    @Before
    public void initializeBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\mk_sel/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^user is on the Categories Page$")
    public void user_is_on_the_Categories_Page()  {
        driver.get("https://uk.rs-online.com/web/generalDisplay.html?id=new");
    }

    @When("^Viewing on the Categories section$")
    public void viewing_on_the_Categories_section() {

      WebElement CategoryHeader = driver.findElement(By.cssSelector("div#campaign-page-wrap h3"));
        Assert.assertEquals(CategoryHeader.getText(),"Categories");
    }

    @Then("^Batteries should be displayed$")
    public void batteries_should_be_displayed() {
        Assert.assertTrue(driver.findElement(By.cssSelector("div#campaign-page-wrap a:nth-child(5)")).isDisplayed());
    }

    @Then("^Connectors should be displayed$")
    public void connectors_should_be_displayed()  {
        Assert.assertTrue(driver.findElement(By.cssSelector("div#campaign-page-wrap a:nth-child(8)")).isDisplayed());
    }

    @Given("^user is on the Home Page$")
    public void user_is_on_the_Home_Page() {
        driver.get("https://uk.rs-online.com/web/generalDisplay.html?id=new");

    }

    @When("^User Clicked on Batteries Under Categories section$")
    public void user_Clicked_on_Batteries_Under_Categories_section() {
        driver.findElement(By.cssSelector("div#campaign-page-wrap a:nth-child(5)")).click();
    }

    @Then("^Navigated to Batteries Page$")
    public void navigated_to_Batteries_Page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://uk.rs-online.com/web/c/batteries/?searchTerm=new_uk&searchType=Offers&n=y#products");
        driver.navigate().back();
    }

    @When("^User Clicked on Cables & Wires Under Categories$")
    public void user_Clicked_on_Cables_Wires_Under_Categories() {
        driver.findElement(By.cssSelector("div#campaign-page-wrap a:nth-child(6)")).click();
    }

    @Then("^Page displayed with no ofproducts on Cables & Wires$")
    public void page_displayed_with_no_ofproducts_on_Cables_Wires() {
        WebElement TxtValue = driver.findElement(By.cssSelector("span#SRTNResultHeaderWidgetAction_srtnHeaderDiv div.viewProdDiv"));
    Assert.assertTrue(TxtValue.getText().contains("products"));
    }

    @When("^User Viewing Categories Header$")
    public void user_Viewing_Categories_Header() {
        driver.get("https://uk.rs-online.com/web/generalDisplay.html?id=new");
        WebElement Categories = driver.findElement(By.cssSelector("div#campaign-page-wrap h3"));
         Assert.assertTrue(Categories.isDisplayed());
    }

    @Then("^Then Header Title should be displayed correctly$")
    public void background_colour_should_be_c_d(int arg1, int arg2) {
        WebElement Categories = driver.findElement(By.cssSelector("div#campaign-page-wrap h3"));
        Assert.assertEquals("Categories",Categories.getText());

    }

    @Then("^Font should be in Valid Format$")
    public void font_should_be_in_Valid_Format() {
        WebElement Categories = driver.findElement(By.cssSelector("div#campaign-page-wrap h3"));
        String fontsize = Categories.getCssValue("font-size");
        Assert.assertEquals("20px",fontsize);
    }

    @Then("^Page displayed with Results per Page on Cables & Wires$")
    public void page_displayed_with_Results_per_Page_on_Cables_Wires() {
        WebElement resultsText = driver.findElement(By.cssSelector(" ul.srtnResultsFilter > li.srtnFilterLbl > span"));
        Assert.assertEquals("Results per page",resultsText.getText());
    }

     @After
    public static void tearDown()  {
        driver.quit();
    }
}
*/

