package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomePageTest {

    static WebDriver driver = null;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.coastfashion.com/");
        driver.manage().window().maximize();


    }

    //Welcome PopUp Close

//        try {
//        WebElement popUpMess = driver.findElement(By.xpath("//a[@class='welcome-popup-shopping-btn']//span[@class='js-welcome-popup-close js-welcome-popup-close-no-message'][contains(text(),'x Close')]"));
//        popUpMess.click();
//    }
//        catch(org.openqa.selenium.StaleElementReferenceException ex)
//    {
//        WebElement popUpMess = driver.findElement(By.xpath("//a[@class='welcome-popup-shopping-btn']//span[@class='js-welcome-popup-close js-welcome-popup-close-no-message'][contains(text(),'x Close')]"));
//        popUpMess.click();
//    }


    //Time Sleep

    //TimeUnit.SECONDS.sleep(1);

    //Scroll
    // - Scroll to the Bottom
    // JavascriptExecutor js = (JavascriptExecutor) driver;
    //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    //Scroll to the element
    // JavascriptExecutor js = (JavascriptExecutor) driver;
    // js.executeScript("arguments[0].scrollIntoView();", Name for the element locator (driver));

    //HOVER WITH MOUSE OVER ELEMENT
    //
    public static void Hover(WebDriver driver, WebElement element){
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();

    }

    //Actions builder = new Actions(driver);
    //builder.moveToElement(HomePage_Objects.megMen_Sale(driver)).moveToElement(HomePage_Objects.megMen_Sale_skirts(driver)).build().perform();



}