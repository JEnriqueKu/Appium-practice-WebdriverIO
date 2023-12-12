package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.BaseScreen;

public class WebviewScreen extends BaseScreen {
    public WebviewScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    @AndroidFindBy(uiAutomator = ".className(\"android.view.View\").textContains(\"Next-gen browser\")")
    private AndroidElement webviewMessage;

    public boolean webviewMessageIsDisplayed() {
        return elementIsVisible(webviewMessage);
    }
}
