import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebElementPage extends Base{

    @FindBy(xpath="//div[@class='navFooterMoreOnAmazon navFooterMoreOnAmazonWrapper']/ul[1]/li[7]/following-sibling::li[2]")
            WebElement footerSibling;

    void setFooterSibling(){
        WaitOnVisibility(footerSibling);
        footerSibling.click();
    }
}
