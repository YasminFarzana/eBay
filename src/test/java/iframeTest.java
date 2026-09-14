import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframeTest extends Base{
iframe iframe;

    @BeforeMethod
    void setUp() {
        openBrowser("https://demoqa.com/frames");
        iframe= PageFactory.initElements(driver,iframe.class);

    }

    @Test
    void checkFrame1() {
        iframe.switchToFrame1();
        String actualText = iframe.getHeading();
        Assert.assertEquals(actualText, "This is a sample page");
        iframe.switchToMainPage();
    }

    @Test
    void checkFrame2() {
        iframe.switchToFrame2();
        String actualText = iframe.getHeading();
        Assert.assertEquals(actualText, "This is a sample page");

        iframe.switchToMainPage();
    }
}





