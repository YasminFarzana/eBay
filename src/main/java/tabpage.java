public class tabpage extends  Base{

    void switchToNewTab() {

        String parentWindow = driver.getWindowHandle();

        for (String window : driver.getWindowHandles()) {

            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }
    }
}
