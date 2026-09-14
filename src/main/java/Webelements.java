import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Webelements extends Base{

        List<WebElement> getWebElements() {

            return driver.findElements(
                    By.cssSelector("a")
            );
        }
    }


