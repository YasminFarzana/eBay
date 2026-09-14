import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumBasicTest extends Base{
    SeleniumBasic Home;

    @BeforeMethod
    void setup(){
        openBrowser("https://www.ebay.com");
        Home= PageFactory.initElements(driver,SeleniumBasic.class);
    }
    @AfterMethod
    void setup1(){
        closeBrowser();
    }

    @Test
    void checkSearch1() throws InterruptedException {
        Thread.sleep(3000);
        Home.setSearch1();
        Assert.assertEquals(driver.getTitle(),"Doll for sale | eBay");
    }
    @Test
    void checkSearch2(){
        Home.setSearch2();
        Assert.assertEquals(driver.getTitle(),"Mat for sale | eBay");
    }
    @Test
    void checkSearch3(){
        Home.setSearch3();
        Assert.assertEquals(driver.getTitle(),"Ringball for sale | eBay");
    }
    @Test
    void checkSearch4(){
        Home.setSearch4();
        Assert.assertEquals(driver.getTitle(),"Electronics, Cars, Fashion, Collectibles & More | eBay");
    }


}
