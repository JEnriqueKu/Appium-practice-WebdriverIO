package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.BaseScreen;

public class DragScreen extends BaseScreen {
    public DragScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Drag and Drop\")")
    AndroidElement dragMessage;

    public boolean dragMessageIsDisplayed() {
        return elementIsVisible(dragMessage);
    }
}
