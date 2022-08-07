package step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Home;
import pageObject.Sign_up;

public class Registration {
    /***************
     * Instances
     */
    Home homepage =new Home();
    Sign_up registrationpage = new Sign_up();

    /***************
     * Actions
     */
    //"^$"
    @Given("^Go to sign up page$")
    public void gotosignup(){
        homepage.ClickSignup();
    }
    @When("^\"1st\" user filled every inputs$")
}
