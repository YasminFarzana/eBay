import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class iframe extends Base{

    @FindBy(id = "frame1")
    WebElement frame1;

    @FindBy(id = "frame2")
    WebElement frame2;

    @FindBy(id = "sampleHeading")
    WebElement heading;

    void switchToFrame1() {
        driver.switchTo().frame(frame1);
    }


    void switchToFrame2() {
        driver.switchTo().frame(frame2);
    }


    String getHeading() {
        return heading.getText();
    }


    void switchToMainPage() {
        driver.switchTo().defaultContent();
    }

}



