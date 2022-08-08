package pageObject;

import drivers.PageDriver;
import io.cucumber.java.StepDefinitionAnnotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Sign_in extends Common {
    public Sign_in() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /***************
     * Identifiers
     */
    /****************
     * login in
     */
    @FindBy(id = "j_username")
    public WebElement username;
    @FindBy(id = "j_password")
    public WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement submitsigninbtn;

    /************
     * Reset password
     */

    @FindBy(css="a[class='forget-password-link']")
    WebElement forgotPassbtn;
    @FindBy(css="input[name='email_phone']")
    WebElement inputphoneoremail;
    @FindBy(css="input[name='password']")
    WebElement enternewpass;
    @FindBy(xpath="//button[normalize-space()='Send Recovery Code']")
    WebElement srcbtn;
    @FindBy(xpath="//button[normalize-space()='Submit']")
    WebElement verifysubmitbtn;
    @FindBy(xpath="//button[normalize-space()='Reset Password']")
    WebElement rpsubmitbtn;
    /***************
     * Actions
     */
    /************
     * Sign in
     */
    // Sign in handler
    public void HandleSignin(String name, String pass) {
        sendText(username, name);
        sendText(password, pass);
    }
    //submit sign in button

    public void SubmitSignin() {
        submitsigninbtn.click();
    }

    /************
     * Forget pass
     */
    public void clickResetbtn(){
        forgotPassbtn.click();
    }
    public void verifysbtbtn(){
        verifysubmitbtn.click();
    }
    public void HandleResetPass(String phoneoremail){
        sendText(inputphoneoremail,phoneoremail);
        srcbtn.click();
    }
    public void HandlenewPass(String newpass){
        sendText(enternewpass,newpass);
        rpsubmitbtn.click();
    }
}
