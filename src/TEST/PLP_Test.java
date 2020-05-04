package TEST;

import POM.HomePage_Objects;
import POM.PLP_Element_Objects;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PLP_Test {

    WebDriver driver = null;
    String plpDresses_Page = "https://www.coastfashion.com/womens/new-in-dresses";

    @BeforeTest
    public void setUpTest() {

        String projectPath = System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MICROSECONDS.SECONDS);
        driver.get(plpDresses_Page);

    }

    @Test
    public void Pagination() throws InterruptedException {

        TimeUnit.SECONDS.sleep(1);

        // Welcome popUp handle
        try {
            WebElement popUpMess = driver.findElement(By.xpath("//a[@class='welcome-popup-shopping-btn']//span[@class='js-welcome-popup-close js-welcome-popup-close-no-message'][contains(text(),'x Close')]"));
            popUpMess.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            WebElement popUpMess = driver.findElement(By.xpath("//a[@class='welcome-popup-shopping-btn']//span[@class='js-welcome-popup-close js-welcome-popup-close-no-message'][contains(text(),'x Close')]"));
            popUpMess.click();
        }

        // generate scroll object
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = driver.getTitle();

        // validate that is on correct page
        Assert.assertEquals(title, "New In Dresses | Coast");

        //scroll to the bottom of the page.
        js.executeScript("arguments[0].scrollIntoView();", PLP_Element_Objects.pagination_next(driver));
        PLP_Element_Objects.pagination_next(driver).click();

        //scroll once again to the bottom of the page
        js.executeScript("arguments[0].scrollIntoView();", PLP_Element_Objects.pagination_prev(driver));

        //click Prev page button
        PLP_Element_Objects.pagination_prev(driver).click();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

//        Actions builder = new Actions(driver);

        TimeUnit.SECONDS.sleep(1);

        //Click on pagination drop Down
        Select drpPages = new Select(PLP_Element_Objects.pagination_dropDown(driver));
        drpPages.selectByVisibleText("Page 3 of 3");

        driver.get(plpDresses_Page);
    }

    @Test
    public void productTitle() throws InterruptedException {

        TimeUnit.SECONDS.sleep(1);

        PLP_Element_Objects.product_Label(driver).isDisplayed();
        PLP_Element_Objects.product_price(driver).isDisplayed();
        PLP_Element_Objects.product_discount(driver).isDisplayed();

        Assert.assertEquals(PLP_Element_Objects.product_Label(driver).getText(),"Lace Stripe Dress");

    }

    @Test
    public void correctProductLink() throws InterruptedException{
        //navigate to PLP page
        driver.get(plpDresses_Page);
        //Wait to load
        TimeUnit.MILLISECONDS.sleep(500);

        PLP_Element_Objects.product_Label(driver).click();
        TimeUnit.MILLISECONDS.sleep(500);

        Assert.assertEquals(driver.getTitle(),"Lace Stripe Dress | Coast");

        driver.get(plpDresses_Page);
    }

    @AfterTest
    public void finish_Test(){

        driver.close();
        driver.quit();

    }

}
