import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class Actions extends Base{

@FindBy(xpath = "//span[@class='fl-pic fl-us']")
    WebElement countryflag;

void setCountryflag(){
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(12000));
    countryflag.click();
}


}
