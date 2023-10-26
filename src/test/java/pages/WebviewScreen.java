package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.BaseScreen;

public class WebviewScreen extends BaseScreen {
    public WebviewScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    @AndroidFindBy(uiAutomator = ".className(\"android.view.View\").text(\"Next-gen browser and mobile automation test framework for Node.js\")")
    private AndroidElement webviewMessage;

    public boolean webviewMessageIsDisplayed() {
        return elementIsVisible(webviewMessage);
    }
}
