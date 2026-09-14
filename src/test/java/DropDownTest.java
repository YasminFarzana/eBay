import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class DropDownTest extends Base{
    DropDown dropDown;


    @BeforeMethod
    void SetUp() {
        openBrowser("https://www.ebay.com");
        dropDown= PageFactory.initElements(driver,DropDown.class);
    }
    @Test
     void checkDropDown() {

        dropDown.selectCategory();
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}






