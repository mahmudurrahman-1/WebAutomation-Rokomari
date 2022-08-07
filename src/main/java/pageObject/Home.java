package pageObject;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    public Home() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /****************
     * Identifiers
     */
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    public WebElement signinbtn;
    @FindBy(xpath = "//p[normalize-space()='Sign up']")
    public WebElement signupbtn;

    /****************
     * Actions
     */

    public void ClickSignin() {
        signinbtn.click();
    }

    public void ClickSignup() {
        signupbtn.click();
    }
}
