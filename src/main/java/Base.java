import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {
    static WebDriver driver;

    void openBrowser(String url){
      driver=new ChromeDriver();
      driver.get(url);
    }
    void closeBrowser(){
        driver.quit();

    }
    void WaitOnVisibility(WebElement element){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(12000));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    void ScrollToElement(WebElement e){
        Actions actions= new Actions(driver);
        actions.moveToElement(e).perform();
    }

void SelectOption(WebElement element, String text) {

    Select select = new Select(element);

    select.selectByVisibleText(text);
}

boolean isEnabled(WebElement element) {
    return element.isEnabled();
}

    void switchToNewTab() {
        String parentWindow = driver.getWindowHandle();

        for (String window : driver.getWindowHandles()) {

            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }
    }
//        void switchToParentTab(String parentWindow) {
//        driver.switchTo().window(parentWindow);
//    }
//    void switchToFrame(String frameId) {
//        WebElement iframe = driver.findElement(By.id(frameId));
//        driver.switchTo().frame(iframe);
//    }
    void switchToMainPage() {
        driver.switchTo().defaultContent();
    }
    void alert(){
        driver.switchTo().alert().accept();
   }
}


