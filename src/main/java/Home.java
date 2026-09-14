import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class Home extends Base {
@FindBy(id= "gh-ac")
    WebElement searchBox;



    void search(){
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(12000));
    searchBox.sendKeys("laptop", Keys.ENTER);
}

}
