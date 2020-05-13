package TEST;

import POM.HomePage_Objects;
import POM.Main_Objects;
import POM.PLP_Element_Objects;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PLP_Test {

    WebDriver driver = null;
    String plpDresses_Page = "https://www.coastfashion.com/womens/new-in-dresses";

    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;

    @BeforeTest
    public void setUpTest() {
        //Creating report
        htmlReporter = new ExtentHtmlReporter("D:\\STUDING\\JAVA\\Automation\\Projects\\Coastfashion\\CoastCps\\Reports\\extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        //Path to my chromeDriver
        String projectPath = System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Page we can test in all tests under
        driver.get("https://www.coastfashion.com/womens/new-in-dresses");

//        if (HomePage_Objects.logo(driver).isDisplayed()) {
//
//            HomePage_Objects.logo(driver).click();
//
//        }else{
//
//         try {
//                Main_Objects.welcomeMess(driver).click();
//            } catch (org.openqa.selenium.StaleElementReferenceException ex) {
//                Main_Objects.welcomeMess(driver).click();
//            }
//        }
//
  }

    @Test
    public void Pagination() throws InterruptedException, IOException {

        ExtentTest Pagination_report = extent.createTest("PLP_Pagination_Page", "This cover Pagination Functionality and validating filters present on the page ");
        Pagination_report.log(Status.INFO, "Starting Test Case");

        TimeUnit.SECONDS.sleep(1);

        // generate scroll object
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = driver.getTitle();

        // validate that is on correct page
        Assert.assertEquals(title, "New In Dresses | Coast");
        Pagination_report.pass("We are on the correct page");

        //scroll to the bottom of the page.
        js.executeScript("arguments[0].scrollIntoView();", PLP_Element_Objects.pagination_next(driver));
        PLP_Element_Objects.pagination_next(driver).click();
        Pagination_report.pass("We press Next button");
        //scroll once again to the bottom of the page
        js.executeScript("arguments[0].scrollIntoView();", PLP_Element_Objects.pagination_prev(driver));

        //click Prev page button
        PLP_Element_Objects.pagination_prev(driver).click();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Pagination_report.pass("Click on Prev button");

        //Click on pagination drop Down
        Select drpPages = new Select(PLP_Element_Objects.pagination_dropDown(driver));
        drpPages.selectByVisibleText("Page 3 of 4");
        Pagination_report.pass("Drop down pagination present on the page. ");

        driver.get(plpDresses_Page);

        Pagination_report.addScreenCaptureFromPath("screenshot.png");

    }

    @Test
    public void productTitle() throws InterruptedException {

        PLP_Element_Objects.product_Label(driver).isDisplayed();
        PLP_Element_Objects.product_price(driver).isDisplayed();
        PLP_Element_Objects.product_discount(driver).isDisplayed();

        Assert.assertEquals(PLP_Element_Objects.product_Label(driver).getText(),"Lace Stripe Dress");

    }

    @Test
    public void correctProductLink() throws InterruptedException{
        //navigate to PLP page
        driver.get(plpDresses_Page);

        PLP_Element_Objects.product_Label(driver).click();
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

        Actions builder = new Actions(driver);
        builder.moveToElement(PLP_Element_Objects.plp_next_Product(driver)).build().perform();

        builder.moveToElement(PLP_Element_Objects.plp_next_Product(driver)).moveToElement(PLP_Element_Objects.PLP_QuichView_Button(driver)).build().perform();

        //Assert that Quick View is displaed in the picture.
        PLP_Element_Objects.PLP_QuichView_Button(driver).isDisplayed();


    }

    @Test
    public void refinement_Present_AndWorks() throws InterruptedException  {

        //Click SortBy
        PLP_Element_Objects.prodRef_SortBy(driver).click();
        //Click on subMenu
        PLP_Element_Objects.prodRef_sortBy_HighTOLow(driver).click();

        PLP_Element_Objects.prodRef_SortBy(driver).click();

        //Click on any refinement menue and choose one option from any.
        PLP_Element_Objects.prodRef_Style(driver).click();
        PLP_Element_Objects.rodRef_Stile_subAstile(driver).click();
        PLP_Element_Objects.ref_bCrumb_ALine(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();

        PLP_Element_Objects.prodRef_UkSize(driver).click();
        PLP_Element_Objects.prodRef_UkSize_size8(driver).click();
        PLP_Element_Objects.ref_bCrumb_Size8(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();

        PLP_Element_Objects.prodRef_Colour(driver).click();
        PLP_Element_Objects.prodRef_Coulour_Multi(driver).click();
        PLP_Element_Objects.ref_bCrumb_Multti(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();

        PLP_Element_Objects.prodRef_Occasion(driver).click();
        PLP_Element_Objects.prodRef_ocasion_Ocassion(driver).click();
        PLP_Element_Objects.prodRef_bCrumb_Ocassion(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();

        PLP_Element_Objects.prodRef_Price(driver).click();
        PLP_Element_Objects.prodRef_Price_Under60(driver).click();
        PLP_Element_Objects.ref_bCrumb_from60(driver).isDisplayed();
        PLP_Element_Objects.prodRef_bc_ClearAll(driver).click();


    }

    @AfterTest
    public void finish_Test(){
        extent.flush();
        driver.close();
        driver.quit();

    }

}
