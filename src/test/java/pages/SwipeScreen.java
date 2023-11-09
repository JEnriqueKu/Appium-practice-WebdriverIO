package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.BaseScreen;

public class SwipeScreen extends BaseScreen {
    public SwipeScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Swipe horizontal\")")
    private AndroidElement swipeMessage;

    public boolean swipeMessageIsDisplayed() {
        return elementIsVisible(swipeMessage);
    }
}
