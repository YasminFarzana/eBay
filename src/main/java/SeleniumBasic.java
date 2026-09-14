import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class SeleniumBasic extends Base{
    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement search1;
    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement search2;
    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement search3;
    @FindBy(css = "span[class='gh-cart__icon']")
    WebElement search4;

    void setSearch1(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(12000));
        search1.sendKeys("doll", Keys.ENTER);
    }
    void setSearch2(){
        WaitOnVisibility(search2);
        search2.sendKeys("mat",Keys.ENTER);
    }
    void setSearch3(){
        WaitOnVisibility(search3);
        search3.sendKeys("ringball",Keys.ENTER);
    }
    void setSearch4(){
        WaitOnVisibility(search4);
        search4.isDisplayed();
    }

}
