package com.gemini.generic.teststeps;

import com.gemini.generic.MobileAction;
import com.gemini.generic.MobileDriverManager;
import com.gemini.generic.locators.Locators;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TestSteps {
    @Given("Login to the app")
    public void login_to_the_app() {

        MobileAction.setImplicitTimeOut(20);

        MobileAction.typeText(Locators.Employee_code, "70029169");
        MobileAction.typeText(Locators.Password, "420420");
        MobileAction.waitUntilElementClickable(Locators.Sign_in, 10);
        MobileAction.click(Locators.Sign_in);
        MobileAction.waitSec(6);
    }


    @When("Terminate the session")
    public void terminateTheSession() {

        MobileAction.click(Locators.Terminate_Session);
        System.out.println("clicked on terminate session");
        MobileAction.waitSec(6);
    }

    @When("Enter the Employee code")
    public void Enter_the_Employee_code() {

        MobileAction.waitUntilElementClickable(Locators.Submit_Btn, 10);
        MobileAction.typeText(Locators.Enter_code, "70029169");
        MobileAction.click(Locators.Submit_Btn);
        MobileAction.waitSec(6);
    }

    @When("Enter the otp")
    public void Enter_the_otp() {

        MobileAction.waitUntilElementVisible(Locators.Opt_One, 8);
        MobileAction.typeText(Locators.Opt_One, "8");
        MobileAction.typeText(Locators.Opt_Two, "9");
        MobileAction.typeText(Locators.Opt_Three, "9");
        MobileAction.typeText(Locators.Opt_Four, "0");
        MobileAction.waitUntilElementClickable(Locators.Submit_Btn, 10);
        MobileAction.click(Locators.Submit_Btn);
        MobileAction.waitSec(5);

    }


    @When("Click on the Application Form")
    public void clickOnTheApplicationForm() {
        MobileAction.waitUntilElementClickable(Locators.Application_Form, 10);
        MobileAction.click(Locators.Application_Form);
        MobileAction.waitUntilElementClickable(Locators.Authentication, 10);
        MobileAction.click(Locators.Authentication);
        MobileAction.waitUntilElementClickable(Locators.Next_Button, 10);
        MobileAction.click(Locators.Next_Button);
        MobileAction.waitSec(5);
    }

    @And("Fill the Application Form")
    public void fillTheApplicationForm() {
        MobileAction.waitUntilElementClickable(Locators.Name,10);
        MobileAction.typeText(Locators.Name,"TESTING APPLICATION");
        MobileAction.waitSec(4);
        MobileAction.click(Locators.DOB);
        MobileAction.waitUntilElementClickable(Locators.Choose_DOB,10);
        MobileAction.click(Locators.Choose_DOB);
        MobileAction.waitUntilElementClickable(Locators.Previous_DOB,10);
        MobileAction.click(Locators.Previous_DOB);
        MobileAction.waitUntilElementClickable(Locators.Select_Year,10);
        MobileAction.click(Locators.Select_Year);
        MobileAction.waitUntilElementClickable(Locators.Select_Month,10);
        MobileAction.click(Locators.Select_Month);
        MobileAction.waitUntilElementClickable(Locators.Select_Date,10);
        MobileAction.click(Locators.Select_Date);
        MobileAction.setImplicitTimeOut(10);
        MobileAction.click(Locators.Select_Option);
        MobileAction.click(Locators.Select_Army);
        MobileAction.waitUntilElementVisible(Locators.Next_Button,10);
        MobileAction.click(Locators.Next_Button);
        MobileAction.waitSec(5);
    }

    @Given("Enter the {string}")
    public void enterThe(String code) {
        MobileAction.setImplicitTimeOut(20);
        MobileAction.click(Locators.Code);
        MobileAction.waitUntilElementClickable(Locators.Sign_in,10);
        MobileAction.click(Locators.Sign_in);
    }

    @When("Click on Next Button")
    public void clickOnNextButton() {
        MobileAction.waitUntilElementClickable(Locators.Next2_Button,10);
        MobileAction.click(Locators.Next2_Button);
        MobileAction.click(Locators.Next2_Button);
        MobileAction.click(Locators.Next2_Button);
        MobileAction.click(Locators.Next2_Button);
        MobileAction.waitSec(4);

    }

    @And("Click on Finish Button")
    public void clickOnFinishButton() {
        MobileAction.waitUntilElementClickable(Locators.Finish_Button,8);
        MobileAction.click(Locators.Finish_Button);
    }

    @When("Choose from a wide range of products")
    public void chooseFromAWideRangeOfProducts() {
        MobileAction.waitUntilElementClickable(Locators.Traditional_Products,5);
        MobileAction.click(Locators.Traditional_Products);
        MobileAction.waitUntilElementClickable(Locators.Rakshak_Smart,4);
        MobileAction.click(Locators.Rakshak_Smart);
        MobileAction.waitUntilElementClickable(Locators.policy_Button,6);
        MobileAction.scrollToElement(String.valueOf(Locators.policy_Button),false);
        MobileAction.click(Locators.policy_Button);

    }
}
