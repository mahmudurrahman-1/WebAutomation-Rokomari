package pageObject;

import drivers.PageDriver;
import io.cucumber.java.StepDefinitionAnnotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Sign_in extends Common {
    public Sign_in(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }

    /***************
     * Identifiers
     */
    @FindBy(id="j_username")
    public WebElement username;
    @FindBy(id="j_password")
    public WebElement password;
    @FindBy(xpath="//button[normalize-space()='Sign In']")
    public WebElement submitsigninbtn;

    /***************
     * Actions
     */

    public void HandleSignin(String name,String pass){
    sendText(username,name);
    sendText(password,pass);
    }
    public void SubmitSignin(){
        submitsigninbtn.click();
    }
}
