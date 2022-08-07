package step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Home;
import pageObject.Profile;
import pageObject.Sign_in;
import pageObject.Verify_account;
import utilities.Common;

public class Signin {

    /****************
     * Instances
     */
    Home homepage = new Home();
    Verify_account activepage = new Verify_account();
    Sign_in signinpage = new Sign_in();
    Profile profilepage = new Profile();

    /****************
     * Actions
     */
    //Goto sign in page
    @Given("^Go to sign in page$")
    public void SigninPage() {
        homepage.ClickSignin();
        signinpage.waitForPageLoad();
    }

    @When("^valid (.+) and (.+) entered$")
    public void SigninProcess(String email, String pass) throws InterruptedException {
        signinpage.HandleSignin(email, pass);
        signinpage.SubmitSignin();
        boolean verifybutton = activepage.verifybtnSize() > 0;
        if (verifybutton) {
            activepage.clickVerifybutton();
            Thread.sleep(15000);
            activepage.clickConfirm();
        } else {
            profilepage.waitForPageLoad();
        }
    }

    @When("^Welcome to your profile$")
    public void SigninSuccess() {
//        boolean signoutButtonsize = activepage.checkVerifybuttonsize()>0;
//        if(verifybutton) {
//        System.out.println("Login Successful");
//        }
//        else {
//
//                System.out.println("Login failed");
//
//        }
        System.out.println("Login Successful");

    }
}
