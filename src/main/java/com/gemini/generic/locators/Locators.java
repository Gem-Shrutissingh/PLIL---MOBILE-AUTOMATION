package com.gemini.generic.locators;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {
    public static By Employee_code = AppiumBy.xpath("(//android.widget.EditText)[1]");
    public static By Password = AppiumBy.xpath("(//android.widget.EditText)[2]");
    public static By Code=AppiumBy.xpath("(//android.widget.EditText)");
    //    public static By Click_Screen=AppiumBy.xpath("Click_Screen");
    //    public static By Sign_in = AppiumBy.className("android.widget.Button");
    public static By Sign_in = AppiumBy.xpath("(//android.widget.Button[@text='Sign In'])");
    public static By Terminate_Session = AppiumBy.xpath("(//android.widget.Button[@text='Terminate Session!'])");
    //    public static By Screen_Swipe = AppiumBy.xpath("//android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View");
    public static By Enter_code = AppiumBy.className("android.widget.EditText");
    public static By Submit_Btn = AppiumBy.xpath("(//android.widget.Button[@text='SUBMIT'])");

    public static By Opt_One = AppiumBy.xpath("(//android.widget.EditText)[1]");
    public static By Opt_Two = AppiumBy.xpath("(//android.widget.EditText)[2]");
    public static By Opt_Three = AppiumBy.xpath("(//android.widget.EditText)[3]");
    public static By Opt_Four = AppiumBy.xpath("(//android.widget.EditText)[4]");


    //    public static By Application_Form = AppiumBy.xpath("(//android.view.View[@text='Application Form'])");
    public static By Application_Form = AppiumBy.xpath("(//android.view.View)[25]");
    public static By Authentication = AppiumBy.className("android.widget.CheckBox");
    public static By Next_Button = AppiumBy.xpath("(//android.widget.Button[@text='NEXT'])");

//    public static By Adhar_No = AppiumBy.xpath("(//android.widget.EditText[@text='Aadhar No'])");
    public static By Name= AppiumBy.xpath("(//android.widget.EditText)[1]");
    public static By DOB= AppiumBy.xpath("(//android.widget.EditText)[3]");
    public static By Choose_DOB=AppiumBy.xpath("(//android.widget.Button)[@text='Choose month and year']");
    public static By Previous_DOB=AppiumBy.xpath("(//android.widget.Button)[@text='Previous 21 years']");
    public static By Select_Year=AppiumBy.xpath("(//android.view.View)[@text='1995']");
    public static By Select_Month=AppiumBy.xpath("(//android.view.View)[@text='April 1995']");
    public static By Select_Date=AppiumBy.xpath("(//android.view.View)[@text='April 12, 1995']");
    public static By Select_Option= AppiumBy.xpath("((//android.view.View)[@text='Select'])[2]");
    public static By Select_Army=AppiumBy.xpath("((//android.widget.RadioButton)[@text='ARMY'])[2]");
    public static By Policy_Information = AppiumBy.xpath("(//android.view.View)[28]");
    public static By Next2_Button=AppiumBy.xpath("(//android.widget.TextView)[@text='Next']");
    public static By Finish_Button=AppiumBy.xpath("(//android.view.View)[@text='Finish']");
    public static By Traditional_Products=AppiumBy.xpath("(//android.widget.Button)[@text='TRADITIONAL PRODUCTS']");
    public static By Rakshak_Smart=AppiumBy.xpath("((//android.widget.Image)[@text='pic'])[1]");
    public static By Back=AppiumBy.xpath("(//android.widget.TextView)[@text='Back']");
    public static By policy_Button=AppiumBy.xpath("(//android.widget.Button)[6]");
}
