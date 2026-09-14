import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class containsTest extends Base{
    contains contain;


    @BeforeMethod
    void SetUp() {
        openBrowser("https://www.ebay.com");
        contain= PageFactory.initElements(driver,contains.class);
    }
    @Test
void setContain(){
        contain.setContains();
        Assert.assertEquals(driver.getTitle(),"Selling on eBay | Electronics, Fashion, Home & Garden | eBay");
    }
}
