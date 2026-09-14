import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class webelementsTest extends Base {
Webelements web1;

    @BeforeMethod
    void SetUp() {
        openBrowser("https://www.ebay.com");
        web1= PageFactory.initElements(driver,Webelements.class);
    }

    @Test
    void webElementTest() {

        List<WebElement> elements = web1.getWebElements();

        System.out.println("Total WebElements: " + elements.size());

        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
    }

    @AfterMethod
    void tearDown() {
        closeBrowser();

}

}
