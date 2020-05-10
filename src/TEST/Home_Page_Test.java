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

        String projectPath = System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MICROSECONDS.SECONDS);
        driver.get("https://www.coastfashion.com/");
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
        String title = "Search";


            HomePage_Objects.search(driver).click();
            HomePage_Objects.search_Field(driver).sendKeys("Dress");
            HomePage_Objects.search_Field(driver).sendKeys(Keys.RETURN);

           // TimeUnit.MILLISECONDS.sleep(1000);

        }





    @Test
    public void countrySelector() {

        HomePage_Objects.countrySelector(driver).isDisplayed();

    }

    @Test
    public void userAccount() {

        HomePage_Objects.user_Profile(driver).isDisplayed();
        HomePage_Objects.user_Profile(driver).click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        HomePage_Objects.logInIcon(driver).click();
        driver.get("https://www.coastfashion.com/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        HomePage_Objects.user_Profile(driver).click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        HomePage_Objects.registerIcon(driver).click();

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
    public void mega_Menu_Sale() {

        Actions builder = new Actions(driver);
        driver.get("https://www.coastfashion.com/");

        //Navigate to skirt in Sale
        builder.moveToElement(HomePage_Objects.megMen_Sale(driver)).moveToElement(HomePage_Objects.megMen_Sale_skirts(driver)).build().perform();
        //try {TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        HomePage_Objects.megMen_Sale_skirts(driver).click();
        //try {TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); };
        String title_skirt = driver.getTitle();
        if (title_skirt.equals("Sale Skirts | Coast")) {
            System.out.println("Pass");
        }

        //Navigate to curve in Sale
        builder.moveToElement(HomePage_Objects.megMen_Sale(driver)).moveToElement(HomePage_Objects.megMen_Sale_curve(driver)).build().perform();
        //try {TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        HomePage_Objects.megMen_Sale_curve(driver).click();
        //try {TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); };
        String title_curve = driver.getTitle();
        if (title_curve.equals("Sale Curve | Coast")) {
            System.out.println("Pass");
        }

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
    public void Footer_Links() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HomePage_Objects.footHelp_elem(driver).isDisplayed();
        HomePage_Objects.footHelp_elem(driver).click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


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
    public void afterTest() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();

    }

}
