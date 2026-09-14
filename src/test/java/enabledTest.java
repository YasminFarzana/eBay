import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class enabledTest extends Base{
enabledPage enabled;

    @BeforeMethod
    void SetUp() {
        openBrowser("https://www.ebay.com");
        enabled= PageFactory.initElements(driver,enabledPage.class);
    }
    @Test
    void setEnabled(){
        enabled.setsaerch1();
        Assert.assertTrue(true);
    }


    @AfterMethod
    void tearClosed(){
        closeBrowser();
    }
}
