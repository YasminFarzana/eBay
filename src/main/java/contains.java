import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class contains extends Base{
    @FindBy(xpath="//a[contains(text(),'Start selling')]")
            WebElement contains;

void setContains(){
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(12000));
    contains.click();
}

}
