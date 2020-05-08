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

import java.util.List;
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

    @Test
    public void QuickVeiw_Button()throws InterruptedException{
        //Generate scroll object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get(plpDresses_Page);
        TimeUnit.MILLISECONDS.sleep(1000);

        js.executeScript("arguments[0].scrollIntoView();", PLP_Element_Objects.plp_product_image(driver));

        TimeUnit.MILLISECONDS.sleep(1000);
        Actions builder = new Actions(driver);
        WebElement next_prod = driver.findElement(By.xpath("//li[@class='grid-tile']//div[@id='2e7bad6924c3892cfa66eda93b']//img[@class='js-required ampliance-image']"));
        builder.moveToElement(next_prod).build().perform();

        TimeUnit.MILLISECONDS.sleep(1000);
        builder.moveToElement(PLP_Element_Objects.plp_next_Product(driver)).moveToElement(PLP_Element_Objects.PLP_QuichView_Button(driver)).build().perform();

        //Assert that Quick View is displaed in the picture.
        PLP_Element_Objects.PLP_QuichView_Button(driver).isDisplayed();

                //moveToElement(HomePage_Objects.megMen_Sale_skirts(driver)).build().perform();

    }

    @Test
    public void refinement_Present_AndWorks() throws InterruptedException {

        //Click SortBy
        PLP_Element_Objects.prodRef_SortBy(driver).click();
        //Click on subMenu
        PLP_Element_Objects.prodRef_sortBy_HighTOLow(driver).click();

        //Wait for page to refresh with the add filter
        TimeUnit.MILLISECONDS.sleep(1000);

        PLP_Element_Objects.prodRef_SortBy(driver).click();
        PLP_Element_Objects.prodRef_sortBy_LowToHigh(driver).click();

        TimeUnit.MILLISECONDS.sleep(3000);

        //Click on any refinement menue and choose one option from any.
        PLP_Element_Objects.prodRef_Style(driver).click();
        PLP_Element_Objects.rodRef_Stile_subAstile(driver).click();
        PLP_Element_Objects.ref_bCrumb_ALine(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();

       TimeUnit.MILLISECONDS.sleep(1000);

        PLP_Element_Objects.prodRef_UkSize(driver).click();
        PLP_Element_Objects.prodRef_UkSize_size8(driver).click();
        PLP_Element_Objects.ref_bCrumb_Size8(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();

         TimeUnit.MILLISECONDS.sleep(1000);

        PLP_Element_Objects.prodRef_Colour(driver).click();
        PLP_Element_Objects.prodRef_Coulour_Multi(driver).click();
        PLP_Element_Objects.ref_bCrumb_Multti(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();

        TimeUnit.MILLISECONDS.sleep(1000);

        PLP_Element_Objects.prodRef_Occasion(driver).click();
        PLP_Element_Objects.prodRef_ocasion_Ocassion(driver).click();
        PLP_Element_Objects.prodRef_bCrumb_Ocassion(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();

        TimeUnit.MILLISECONDS.sleep(1000);

        PLP_Element_Objects.prodRef_Price(driver).click();
        PLP_Element_Objects.prodRef_Price_Under60(driver).click();
        PLP_Element_Objects.ref_bCrumb_from60(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();

        TimeUnit.MILLISECONDS.sleep(1000);

    }

    @AfterTest
    public void finish_Test(){

       driver.close();
       driver.quit();

    }

}
