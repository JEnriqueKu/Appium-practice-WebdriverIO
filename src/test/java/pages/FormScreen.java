package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.BaseScreen;

public class FormScreen extends BaseScreen {
    public FormScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Form components\")")
    private AndroidElement formMessage;

    public boolean formMessageIsDisplayed() {
        return elementIsVisible(formMessage);
    }
}
