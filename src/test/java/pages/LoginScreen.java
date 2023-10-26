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

    public boolean singupMessageIsDisplayed() {
        return elementIsVisible(singupMessage);
    }
}
