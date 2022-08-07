package pageObject;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

import java.util.List;

public class Verify_account extends Common {
    public Verify_account(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    /*************
     * Identifiers
     */
    @FindBy(xpath = "//a[contains(text(),'Verify account?')]")
    public WebElement verifyButton;
    @FindBy(xpath = "//a[normalize-space()='Verify account?']")
    List<WebElement> verifyButtonSize;
    @FindBy(xpath = "//button[text()=' Submit ']")
    public WebElement confirmButton;

    /***************
     * All actions
     */

    public void clickVerifybutton() {
        verifyButton.click();
    }
public int verifybtnSize(){
     return   verifyButtonSize.size();
}

    public void clickConfirm() {
        confirmButton.click();
    }

}
