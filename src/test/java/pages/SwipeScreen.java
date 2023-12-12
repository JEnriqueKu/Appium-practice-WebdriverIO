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

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"FULLY OPEN SOURCE\")")
    private AndroidElement cart1;

    public boolean swipeMessageIsDisplayed() {
        return elementIsVisible(swipeMessage);
    }

    public void swipeToTheRightCart1(){
        swipeToTheRight(cart1);
    }
}
