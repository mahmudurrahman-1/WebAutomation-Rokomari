package step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Home;
import pageObject.Sign_in;
import utilities.DataParser;

import java.util.Properties;

public class ForgotPass {
    /************
     * Instances
     */
    Home homepage = new Home();
    Sign_in signin = new Sign_in();

    /***********
     * Actions
     */

    @Given("^Go to reset feature$")
    public void gotoResetFeature() {
        homepage.ClickSignin();
        signin.clickResetbtn();
    }
    @When("^Inputs in the field is given$")
    public void ResetHandler() throws InterruptedException {
        String phoneoremail, newpass;
        Properties props = DataParser.loadProperties("recoveruser.properties");
        phoneoremail = props.getProperty("up");
        newpass = props.getProperty("upa");
        signin.HandleResetPass(phoneoremail);
        Thread.sleep(15000);
        signin.verifysbtbtn();
        signin.HandlenewPass(newpass);
    }

    @Then("^Successful$")
    public void ResetConfirmation() {
        System.out.println("Successfully password changed");
    }


}
