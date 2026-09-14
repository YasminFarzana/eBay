import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionTest extends Base{
    Actions action1;



    @BeforeMethod
    void SetUp() {
        openBrowser("https://www.ebay.com");
        action1= PageFactory.initElements(driver,Actions.class);
    }

 @Test
    void scroll(){
     action1.ScrollToElement(action1.countryflag);

 }

}
