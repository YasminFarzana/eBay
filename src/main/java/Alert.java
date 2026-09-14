import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class Alert extends Base{

    @FindBy(id = "alertButton")
    WebElement alert1;

    public void setAlert1() {

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(12000));

        alert1.click();
    }

}

