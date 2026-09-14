import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementTest extends Base {
    WebElementPage web1;

    @BeforeMethod
    void SetUp() {
        openBrowser("https://www.Amazon.com");
        web1= PageFactory.initElements(driver,WebElementPage.class);
    }
    @Test
    void setWeb1(){
        web1.setFooterSibling();

    }


}