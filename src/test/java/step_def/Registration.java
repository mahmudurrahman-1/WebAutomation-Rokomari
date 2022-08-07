package step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Home;
import pageObject.Sign_in;
import pageObject.Sign_up;
import utilities.DataParser;

import javax.xml.crypto.Data;
import java.util.Properties;

public class Registration {
    /***************
     * Instances
     */
    Home homepage = new Home();
    Sign_up registrationpage = new Sign_up();
    Sign_in signinpage = new Sign_in();

    /***************
     * Actions
     */
    //"^$"
    @Given("^Go to sign up page$")
    public void gotosignup() {
        //in home page top right corner sign in button situated
        homepage.ClickSignin();
        //wait for sign in page
        signinpage.waitForPageLoad();
        //after successful loading
        homepage.ClickSignup();
    }

    @When("^\"([^\"]*)\" user filled every inputs$")
    public void signupprocess(String user) throws InterruptedException {
        // Undefined name, email, phone, password
        String name, email, phone, password;
        //fetching data from user properties
        Properties prop = DataParser.loadProperties("user.properties");
        // let's go with if else statement for different user activity
        //For the first user information
        if (user.equals("1st")) {
            name = prop.getProperty("un1");
            email = prop.getProperty("ue1");
            phone = prop.getProperty("up1");
            password = prop.getProperty("upa1");

        }
        //For the second user information
        else if (user.equals("2nd")) {
            name = prop.getProperty("un2");
            email = prop.getProperty("ue2");
            phone = prop.getProperty("up2");
            password = prop.getProperty("upa2");

        }
        //For the third user information
        else if (user.equals("3rd")) {
            name = prop.getProperty("un3");
            email = prop.getProperty("ue3");
            phone = prop.getProperty("up3");
            password = prop.getProperty("upa3");

        }
        //For the fourth user information
        else if (user.equals("4th")) {
            name = prop.getProperty("un4");
            email = prop.getProperty("ue4");
            phone = prop.getProperty("up4");
            password = prop.getProperty("upa4");

        } else {
            name = email = phone = password = "";
        }
        registrationpage.HandleSignup(name, email, phone, password);
        Thread.sleep(10000);
        registrationpage.SubmitSignup();

    }

    @Then("^Registration is successful$")
    public void submitSuccess() {
        System.out.println("Registration is successfull");
    }
}
