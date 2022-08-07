package pageObject;

import drivers.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Sign_up extends Common {
    public Sign_up(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    /***************
     * Idetifiers
     */
    @FindBy(id="nm")
    public WebElement username;
    @FindBy(id="js-email")
    public WebElement useremail;
    @FindBy(id="js-phone")
    public WebElement userphone;
    @FindBy(id="pwd")
    public WebElement userpass;
    @FindBy(xpath="//button[normalize-space()='Create Account']")
    public WebElement submitsignupbtn;

    /***************
     * Actions
     */
    public void HandleSignup(String name,String email,String phone,String pass){
     sendText(username,name);
     sendText(useremail,email);
     sendText(userphone,phone);
     sendText(userpass,pass);
    }
    public void SubmitSignup(){
        submitsignupbtn.click();
    }
}
