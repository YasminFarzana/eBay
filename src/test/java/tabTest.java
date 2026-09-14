import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tabTest extends Base{
    tabTest tabPage;

    @BeforeMethod
     void setUp() {
        openBrowser("https://demoqa.com/browser-windows");
        tabPage = PageFactory.initElements(driver, tabTest.class);
    }

    @Test
     void checkNewTab() {
        String mainTab = driver.getWindowHandle();

        switchToNewTab();

        System.out.println("New Tab Title: " + driver.getTitle());

        System.out.println("Main Tab Title: " + driver.getTitle());
    }

    @AfterMethod
     void tearDown() {
        driver.quit();
    }

}


