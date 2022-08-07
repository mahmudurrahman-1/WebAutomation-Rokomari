package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Verify_account {
    /*************
     * Identifiers
     */
    @FindBy(xpath = "//a[normalize-space()='Verify account?']")
    public WebElement verifyButton;
    @FindBy(xpath = "//a[normalize-space()='Verify account?']")
    public List<WebElement> verifyButtonSize;
    @FindBy(xpath = "//button[text()=' Submit ']")
    public WebElement confirmButton;

    /***************
     * All actions
     */

    public void clickVerifybutton(){
        verifyButton.click();
    }
    public void checkVerifybutton(){
        verifyButtonSize.size();
    }
    public  void clickConfirm(){
        confirmButton.click();
    }

}
