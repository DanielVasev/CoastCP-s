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
        element = driver.findElement(By.xpath("//div[@id='2e7bad6924c3892cfa66eda93b']//span[@class='product-sales-price'][contains(text(),'£41.40')]"));
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

    public static WebElement PLP_QuichView_Button(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@id='quickviewbutton']"));
        return element;
    }

    public static WebElement plp_product_image(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@id='12029f79dab6393c4c292d43ca']//img[@class='js-required ampliance-image']"));
        return element;
    }
    public static WebElement plp_next_Product(WebDriver driver){
        element = driver.findElement(By.xpath("//li[@class='grid-tile']//div[@id='2e7bad6924c3892cfa66eda93b']//img[@class='js-required ampliance-image']"));
        return element;
    }
    //Refinment Elements
    public static WebElement prodRef_Style(WebDriver driver){
        element = driver.findElement(By.xpath("//span[contains(text(),'Style')]"));
        return element;
    }

    public static WebElement prodRef_UkSize(WebDriver driver){
        element = driver.findElement(By.xpath("//span[contains(text(),'UK Size')]"));
        return element;
    }

    public static WebElement prodRef_Colour(WebDriver driver){
        element = driver.findElement(By.xpath("//span[contains(text(),'Colour')]"));
        return element;
    }

    public static WebElement prodRef_Occasion(WebDriver driver){
        element = driver.findElement(By.xpath("//span[@class='refinement-head-text'][contains(text(),'Occasion')]"));
        return element;
    }

    public static WebElement prodRef_Price(WebDriver driver){
        element = driver.findElement(By.xpath("//span[@class='refinement-head-text'][contains(text(),'Price')]"));
        return element;
    }

    public static WebElement prodRef_SortBy(WebDriver driver){
        element = driver.findElement(By.xpath("//span[@class='refinement-head-text'][contains(text(),'Sort by')]"));
        return element;
    }
    //Refinment breadcrumb
    public static WebElement ref_bCrumb_from60(WebDriver driver){
        element = driver.findElement(By.xpath("//span[@class='breadcrumb-refinement-value']"));
        return element;
    }
    public static WebElement ref_bCrumb_ALine(WebDriver driver){
        element = driver.findElement(By.xpath("//span[@class='breadcrumb-refinement-value'][contains(text(),'A-Line')]"));
        return element;
    }
    public static WebElement ref_bCrumb_Size8(WebDriver driver){
        element = driver.findElement(By.xpath("//span[@class='breadcrumb-refinement js-refinement-element']"));
        return element;
    }
    public static WebElement ref_bCrumb_Multti(WebDriver driver){
        element = driver.findElement(By.xpath("//span[@class='breadcrumb-refinement-value'][contains(text(),'Multi')]"));
        return element;
    }
    public static WebElement prodRef_bCrumb_Ocassion(WebDriver driver){
            element = driver.findElement(By.xpath("//span[@class='breadcrumb-refinement-value'][contains(text(),'Occasion')]"));
            return element;
    }
    public static WebElement prodRef_sortBy_HighTOLow(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[contains(text(),'Price (High to Low)')]"));
        return element;
    }
    public static WebElement prodRef_sortBy_LowToHigh(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[contains(text(),'Price (Low to High)')]"));
        return element;
    }

    //SubMenue choice
    public static WebElement rodRef_Stile_subAstile(WebDriver driver){
        element = driver.findElement(By.xpath("//span[contains(text(),'A-Line')]"));
        return element;
    }
    public static WebElement prodRef_UkSize_size8(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='refinement js-refinement size']//li[2]//span[1]"));
        return element;
    }
    public static WebElement prodRef_Coulour_Multi(WebDriver driver){
        element = driver.findElement(By.xpath("//span[contains(text(),'Multi')]"));
        return element;
    }
    public static WebElement prodRef_ocasion_Ocassion(WebDriver driver){
        element = driver.findElement(By.xpath("//span[contains(@class,'refinement-link js-refinement-element')][contains(text(),'Occasion')]"));
        return element;
    }
    public static WebElement prodRef_Price_Under60(WebDriver driver){
        element = driver.findElement(By.xpath("//span[contains(text(),'under £60')]"));
        return element;
    }

    public static WebElement prodRef_bc_ClearAll(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@class='breadcrumb-refinement-clearall-link']"));
        return element;
    }




}



