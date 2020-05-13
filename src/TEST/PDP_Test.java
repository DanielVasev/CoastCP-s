package TEST;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PDP_Test {

    WebDriver driver = null;
    String plpDresses_Page = "https://www.coastfashion.com/womens/new-in-dresses";

    @BeforeTest
    public void setUpTest(){

    }

    @Test
    public void Product_Elements(){




    }

    @AfterTest
    public void tear_down(){

        driver.close();
        driver.quit();

    }
}
