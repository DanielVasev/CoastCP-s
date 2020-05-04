package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_Objects {

    WebDriver driver = null;

    private static WebElement element;

    public static WebElement logo(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='primary-logo']//a//*[local-name()='svg']"));
        return element;
    }
    public static WebElement search(WebDriver driver){
        element = driver.findElement(By.cssSelector("#wrapper > div.sticky-spacer.js-sticky-spacer > div > div.sticky-spacer.js-sticky-spacer > div > div > div > div.header-search.js-header-search > form > fieldset > button"));
        return element;
    }
    public static WebElement search_Field(WebDriver driver){
        element = driver.findElement(By.cssSelector("#wrapper > div.sticky-spacer.js-sticky-spacer > div > div.sticky-spacer.js-sticky-spacer > div > div > div > div.header-search.js-header-search > form > fieldset > input"));
        return element;
    }
    public static WebElement countrySelector(WebDriver driver){
        element = driver.findElement(By.cssSelector("#wrapper > div.sticky-spacer.js-sticky-spacer > div > div.sticky-spacer.js-sticky-spacer > div > div > div > div.js-header-right-box.header-right-box > div.header-countryselector.hidden-on-mobile.js-country-selector.flag-icon-circle > div > div > i"));
        return element;
    }
    public static WebElement user_Profile(WebDriver driver){
        element = driver.findElement(By.cssSelector("#wrapper > div.sticky-spacer.js-sticky-spacer > div > div.sticky-spacer.js-sticky-spacer > div > div > div > div.js-header-right-box.header-right-box > div.header-customerinfo.hidden-on-mobile > li > div > span"));
        return element;
    }
    public static WebElement logInIcon(WebDriver driver){
        element = driver.findElement(By.cssSelector("#wrapper > div.sticky-spacer.js-sticky-spacer > div > div.sticky-spacer.js-sticky-spacer > div > div > div > div.js-header-right-box.header-right-box > div.header-customerinfo.hidden-on-mobile > li > div > div > div > a:nth-child(1)"));
        return element;
    }
    public static WebElement registerIcon(WebDriver driver){
        element = driver.findElement(By.cssSelector("#wrapper > div.sticky-spacer.js-sticky-spacer > div > div.sticky-spacer.js-sticky-spacer > div > div > div > div.js-header-right-box.header-right-box > div.header-customerinfo.hidden-on-mobile > li > div > div > div > a:nth-child(2)"));
        return element;
    }
    public static WebElement wishList(WebDriver driver){
        element = driver.findElement(By.cssSelector("#wrapper > div.sticky-spacer.js-sticky-spacer > div > div.sticky-spacer.js-sticky-spacer > div > div > div > div.js-header-right-box.header-right-box > div.header-wishlist > a > i"));
        return element;
    }
    public static WebElement shopingBasket(WebDriver driver){
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"));
        return element;
    }
    public static WebElement megMen_Sale(WebDriver driver){
        element = driver.findElement(By.cssSelector("#navigation > ul > li.has-submenu.js-has-submenu.sale-menu.cat-red-color.sale-menu.js-menu-tab > a:nth-child(2)"));
        return element;
    }
    public static WebElement megMen_Sale_skirts(WebDriver driver){
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"));
        return element;
    }
    public static WebElement megMen_Sale_curve(WebDriver driver){
        element = driver.findElement(By.cssSelector("#navigation > ul > li.has-submenu.js-has-submenu.sale-menu.cat-red-color.sale-menu.js-menu-tab > div > div > div:nth-child(4) > ol > li:nth-child(12) > a"));
        return element;
    }
    public static WebElement megMen_NewIn_dresses(WebDriver driver){
        element = driver.findElement(By.cssSelector("#navigation > ul > li.has-submenu.js-has-submenu.newin-menu.new-in-menu.js-menu-tab > div > div > div > ol > li:nth-child(5) > a"));
        return element;
    }
    public static WebElement megMen_NewIn_Tops(WebDriver driver){
        element = driver.findElement(By.cssSelector("#navigation > ul > li.has-submenu.js-has-submenu.newin-menu.new-in-menu.js-menu-tab > div > div > div > ol > li:nth-child(6) > a"));
        return element;
    }
    public static WebElement megMen_NewIN(WebDriver driver){
        element = driver.findElement(By.cssSelector("#navigation > ul > li.has-submenu.js-has-submenu.newin-menu.new-in-menu.js-menu-tab > a"));
        return element;
    }
    public static WebElement footHelp_elem(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
        return element;
    }
    public static WebElement big_splash_Advert(WebDriver driver) {
        element = driver.findElement(By.xpath("//picture[@class='homepage-splash size-full']//img"));
        return element;
    }
    public static WebElement small_splash_Advert_left(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='home-slot-5 grid-row']//div[1]//div[1]//a[1]//picture[1]//img[1]"));
        return element;
    }
    public static WebElement small_splash_Advert_right(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='home-slot-5 grid-row']//div[3]//div[1]//a[1]//picture[1]//img[1]"));
        return element;
    }
    public static WebElement small_splash_Advert_centre(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@id='wrapper']//div[2]//div[1]//a[1]//picture[1]//img[1]"));
        return element;
    }



}
