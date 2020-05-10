package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main_Objects {
    WebDriver driver = null;
    private static WebElement element;

public static WebElement welcomeMess(WebDriver driver){

    element = driver.findElement(By.xpath("//a[@class='welcome-popup-shopping-btn']//span[@class='js-welcome-popup-close js-welcome-popup-close-no-message'][contains(text(),'x Close')]"));
    return element;

    }
}
