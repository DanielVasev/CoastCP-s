package TEST;

import POM.HomePage_Objects;
import POM.Main_Objects;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Home_Page_Test {
    public WebDriver driver = null;



    @BeforeTest
    public void setUpTest() {

        //Path to my chromeDriver
        String projectPath = System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
        //Page we can test in all tests under
        driver.get("https://www.coastfashion.com/");
        // Close welcome message if is there
        if (Main_Objects.welcomeMess(driver).isDisplayed()) {
            try {
                Main_Objects.welcomeMess(driver).click();
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {
                Main_Objects.welcomeMess(driver).click();
            }
        }

    }

    @Test
    public void navigate_To_HomePage() {

        String title = driver.getTitle();
        Assert.assertEquals(title,"Women’s Occasionwear | Women’s Clothing & Fashion | Coast");

    }

    @Test
    public void check_For_SearchIcon() throws InterruptedException {

            HomePage_Objects.search(driver).click();
            HomePage_Objects.search_Field(driver).sendKeys("Dress");
            HomePage_Objects.search_Field(driver).sendKeys(Keys.RETURN);

             String title = driver.getTitle();
            Assert.assertEquals(title,"Search");
        }

    @Test
    public void countrySelector() {

        HomePage_Objects.countrySelector(driver).isDisplayed();

    }

    @Test
    public void userAccount() throws InterruptedException {

        HomePage_Objects.user_Profile(driver).isDisplayed();
        HomePage_Objects.user_Profile(driver).click();

       TimeUnit.MILLISECONDS.sleep(500);

        HomePage_Objects.logInIcon(driver).click();
        String title_LogIn = driver.getTitle();
        Assert.assertEquals(title_LogIn,"Log in to Your Account");

        driver.get("https://www.coastfashion.com/");

        TimeUnit.MILLISECONDS.sleep(500);

        HomePage_Objects.user_Profile(driver).click();

        TimeUnit.MILLISECONDS.sleep(500);

        HomePage_Objects.registerIcon(driver).click();
        String title_registerIcon = driver.getTitle();
        Assert.assertEquals(title_registerIcon,"Account Registration Page");

        TimeUnit.MILLISECONDS.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        HomePage_Objects.footHelp_elem(driver).isDisplayed();
        HomePage_Objects.footHelp_elem(driver).click();
    }

    @Test
    public void wish_List() {

        HomePage_Objects.wishList(driver).isDisplayed();
        HomePage_Objects.wishList(driver).click();

    }

    @Test
    public void basketIcon() {

        HomePage_Objects.shopingBasket(driver).isDisplayed();
        HomePage_Objects.shopingBasket(driver).click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        HomePage_Objects.footHelp_elem(driver).isDisplayed();
        HomePage_Objects.footHelp_elem(driver).click();

    }

    @Test
    public void mega_Menu_Sale() throws InterruptedException {

        Actions builder = new Actions(driver);
        //driver.get("https://www.coastfashion.com/");


        TimeUnit.MILLISECONDS.sleep(500);

        //Navigate to skirt in Sale
        builder.moveToElement(HomePage_Objects.megMen_Sale(driver)).moveToElement(HomePage_Objects.megMen_Sale_skirts(driver)).build().perform();

        HomePage_Objects.megMen_Sale_skirts(driver).click();

        TimeUnit.MILLISECONDS.sleep(500);

        String title_skirt = driver.getTitle();
        Assert.assertEquals(title_skirt,"Sale Skirts | Coast");

        //Navigate to curve in Sale
        builder.moveToElement(HomePage_Objects.megMen_Sale(driver)).moveToElement(HomePage_Objects.megMen_Sale_curve(driver)).build().perform();

        HomePage_Objects.megMen_Sale_curve(driver).click();

        String title_curve = driver.getTitle();
        Assert.assertEquals(title_curve,"Sale Curve | Coast");

    }

    @Test
    public void mega_Menu_NewIn() {

        Actions builder = new Actions(driver);

        //Navigate to skirt in Sale
        builder.moveToElement(HomePage_Objects.megMen_NewIN(driver)).moveToElement(HomePage_Objects.megMen_NewIn_dresses(driver)).build().perform();
        //try {TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        HomePage_Objects.megMen_NewIn_dresses(driver).click();
        //try {TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); };
        String title_NewIn_dres = driver.getTitle();
        if (title_NewIn_dres.equals("New In Dresses | Coast")) {
            System.out.println("Pass");
        }

        //Navigate to curve in Sale
        builder.moveToElement(HomePage_Objects.megMen_NewIN(driver)).moveToElement(HomePage_Objects.megMen_NewIn_Tops(driver)).build().perform();
        //try {TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        HomePage_Objects.megMen_NewIn_Tops(driver).click();
        //try {TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); };
        String title_newIn_topsss = driver.getTitle();
        if (title_newIn_topsss.equals("Coast UK")) {
            System.out.println("Pass");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        HomePage_Objects.footHelp_elem(driver).isDisplayed();
        HomePage_Objects.footHelp_elem(driver).click();
    }

    @Test
    public void Footer_Links() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        TimeUnit.MILLISECONDS.sleep(500);

        HomePage_Objects.footHelp_elem(driver).isDisplayed();
        HomePage_Objects.footHelp_elem(driver).click();

        String help_title = driver.getTitle();
        Assert.assertEquals(help_title,"Customer Service | Track my Order | Contact Us at Coastfashion.com");

        TimeUnit.MILLISECONDS.sleep(500);



    }

    @Test
    public void Splash_Boxes() {

        HomePage_Objects.big_splash_Advert(driver).click();
        String title = driver.getTitle();
        Assert.assertEquals(title,"All Clothing | Coast");

        HomePage_Objects.logo(driver).click();
        HomePage_Objects.small_splash_Advert_centre(driver).click();
        title = driver.getTitle();
        Assert.assertEquals(title, "Tops | Tops For Women | Coast");

        HomePage_Objects.logo(driver).click();
        HomePage_Objects.small_splash_Advert_left(driver).click();
        title = driver.getTitle();
        Assert.assertEquals(title, "Occasion Wear | Coast");

        HomePage_Objects.logo(driver).click();
        HomePage_Objects.small_splash_Advert_right(driver).click();
        title = driver.getTitle();
        Assert.assertEquals(title, "Bridesmaid Dresses and Outfits | Coast");

    }



    @AfterTest
    public void afterTest() throws InterruptedException {
        //Wait before close the session
        TimeUnit.MILLISECONDS.sleep(2000);

        driver.close();
        driver.quit();

    }

}
