package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PLP_Element_Objects {
    static WebDriver driver = null;
    private static WebElement element;

    public static WebElement pagination_next(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='search-result-options hidden-on-tablet-portrait hidden-on-mobile']//span[contains(text(),'Next')]"));
        return element;

    }

    public static WebElement pagination_prev(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='search-result-options hidden-on-tablet-portrait hidden-on-mobile']//span[contains(text(),'Prev')]"));
        return element;

       }
    public static WebElement pagination_dropDown(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='search-result-options hidden-on-tablet-portrait hidden-on-mobile']//select[@class='pagination-select paginate-select js-pagination-select']"));
        return element;
    }
    public static WebElement pagination_dropDown_Page3_element(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='search-result-options hidden-on-tablet-portrait hidden-on-mobile']//div[@class='pagination-info hidden-on-desktop hidden-on-desktop-small'][contains(text(),'Page 3 of 3')]"));
        return element;
    }

    public static WebElement product_Label(WebDriver driver){
        element = driver.findElement(By.xpath("//a[contains(text(),'Lace Stripe Dress')]"));
        return element;
    }

    public static WebElement product_price(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@id='2e7bad6924c3892cfa66eda93b']//span[@class='product-sales-price'][contains(text(),'£34.50')]"));
        return element;
    }

    public static WebElement product_discount(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@id='2e7bad6924c3892cfa66eda93b']//span[@class='product-standard-price'][contains(text(),'£69.00')]"));
        return element;
    }

    public static WebElement popUp_Banner(WebDriver driver){
        element = driver.findElement(By.cssSelector("#dialog-container > div > div.welcome-popup-content-col > div.welcome-popup-btn-inner.hidden-on-mobile > a:nth-child(1) > span"));
        return element;
    }
    public static WebElement validationPDP_LaseStripeDress(WebDriver driver){
        element = driver.findElement(By.xpath("//h1[@class='product-name hidden-on-mobile js-product-name']"));
        return element;

    }

}



