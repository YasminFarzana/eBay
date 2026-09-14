import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest extends Base{

    Alert alert1;

    @BeforeMethod
    public void SetUp() {

        openBrowser("https://demoqa.com/alerts");

        alert1 = PageFactory.initElements(driver, Alert.class);
    }

    @Test
    public void checkAlert() {

        // Click the button
        alert1.setAlert1();

        // Accept the alert
        alert1.alert();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}




