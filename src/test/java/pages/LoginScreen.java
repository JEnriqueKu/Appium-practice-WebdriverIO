package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.BaseScreen;

public class LoginScreen extends BaseScreen {
    public LoginScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Login / Sign up Form\")")
    private AndroidElement singupMessage;
    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").textContains(\"Sign up\")")
    private AndroidElement singUpButton;
    @AndroidFindBy(accessibility = "input-email")
    private AndroidElement emailBox;
    @AndroidFindBy(accessibility = "input-password")
    private AndroidElement passwordBox;
    @AndroidFindBy(accessibility = "input-repeat-password")
    private AndroidElement repeatPasswordBox;

    public boolean singupMessageIsDisplayed() {
        return elementIsVisible(singupMessage);
    }

    public void clickOnSingUpButton(){
        singUpButton.click();
    }

    public void writeEmail(String email){
        emailBox.sendKeys(email);
    }

    public void writePassword(String password){
        passwordBox.sendKeys(password);
    }

    public void writePasswordAgain(String password){
        repeatPasswordBox.sendKeys(password);
    }


}
