import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class enabledPage extends Base{
    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement search1;

    boolean setsaerch1(){
        WaitOnVisibility(search1);
        return search1.isEnabled();
    }
}
