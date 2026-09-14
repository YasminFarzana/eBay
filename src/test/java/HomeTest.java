import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest extends Base {
    Home home;

    @BeforeMethod
    void SetUp() {
        openBrowser("https://www.ebay.com");
        home= PageFactory.initElements(driver,Home.class);
    }

    @AfterMethod
    void setup(){
        closeBrowser();
    }
    @Test
    void checkSearch(){
        home.search();
        Assert.assertEquals(driver.getTitle(),"Laptop for sale | eBay");
    }
}