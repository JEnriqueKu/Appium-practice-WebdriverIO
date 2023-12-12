package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.BaseScreen;

import java.util.Random;

public class LoginScreen extends BaseScreen {
    public LoginScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Login / Sign up Form\")")
    private AndroidElement singupMessage;
    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Sign up\")")
    private AndroidElement singUpWidgetButton;
    @AndroidFindBy(accessibility = "input-email")
    private AndroidElement emailBox;
    @AndroidFindBy(accessibility = "input-password")
    private AndroidElement passwordBox;
    @AndroidFindBy(accessibility = "input-repeat-password")
    private AndroidElement repeatPasswordBox;
    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement okButton;
    @AndroidFindBy(id = "android:id/contentPanel")
    private AndroidElement successfulMessage;
    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"SIGN UP\")")
    private AndroidElement singUpButton;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Login\")")
    private AndroidElement loginWidgetButton;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"LOGIN\")")
    private AndroidElement loginButton;

    @AndroidFindBy(id = "android:id/message")
    private AndroidElement loginMessage;


    //////////////////////////////


    public boolean singupMessageIsDisplayed() {
        return elementIsVisible(singupMessage);
    }

    public void clickOnSingUpWidgetButton(){
        clickOnElement(singUpWidgetButton);
    }

    public void writeEmail(){
        Random random = new Random();
        int var = random.nextInt(10000)+1000;
        email = "brother"+var+"_enrique"+var+"@hotmail.com";
        emailBox.sendKeys(email);
    }

    public void writePassword(){
        sendKeysToElement(passwordBox,password);
    }

    public void writePasswordAgain(){
        sendKeysToElement(repeatPasswordBox,password);
    }

    public void clickOnSingUpButton(){
        clickOnElement(singUpButton);
    }

    public String successfulMessageText(){
        elementIsVisible(successfulMessage);
        return successfulMessage.getText();
    }

    public void clickOnOkButton(){
        okButton.click();
    }

    public void clickOnLoginWidgetButton(){
        clickOnElement(loginWidgetButton);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String loginMessageText(){
        elementIsVisible(loginMessage);
        return loginMessage.getText();
    }


}
