package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.BaseScreen;

public class HomeScreen extends BaseScreen {
    public HomeScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(className = "android.widget.ImageView")
    private AndroidElement robotImage;


    public boolean robotImageIsDisplayed(){
        return robotImage.isDisplayed();
    }
}
