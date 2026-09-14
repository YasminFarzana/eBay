import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDown extends Base{
    @FindBy(id = "gh-cat")
    WebElement categories;

     void selectCategory() {

        SelectOption(categories, "Crafts");
    }

}




