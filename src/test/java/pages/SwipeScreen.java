package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;
import utils.BaseScreen;

public class SwipeScreen extends BaseScreen {
    public SwipeScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Swipe horizontal\")")
    private AndroidElement swipeMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Carousel\")")
    private RemoteWebElement areaHorizontalScrollView;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"FULLY OPEN SOURCE\")")
    private AndroidElement gitCard;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"GREAT COMMUNITY\")")
    private AndroidElement communityCard;

    public boolean swipeMessageIsDisplayed() {
        return elementIsVisible(swipeMessage);
    }

    public void swipeLeftCarousel() {
        swipe(500,800,1400);
    }

    public void swipeRightCarousel() {
        elementIsVisible(gitCard);
        swipe(800,300,1400);
    }

    public boolean gitCardIsVisible(){
        return gitCard.isDisplayed();
    }

    public boolean communityCardIsVisible(){
        return communityCard.isDisplayed();
    }
}
