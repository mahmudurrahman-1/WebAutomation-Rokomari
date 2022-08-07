package pageObject;

import drivers.PageDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Profile extends Common {
    public Profile() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }
}
