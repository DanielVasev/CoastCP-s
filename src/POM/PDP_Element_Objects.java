package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PDP_Element_Objects {

    static WebDriver driver = null;
    private static WebElement element;

    public static WebElement ProductTitle(WebDriver driver){
        element = driver.findElement(By.xpath(""));
        return element;

    }


}
