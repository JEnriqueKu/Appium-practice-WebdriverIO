package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.BaseScreen;

public class MenuBar extends BaseScreen {
    public MenuBar(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "Defaul")
    private AndroidElement default1;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Home\")")
    private AndroidElement homeButton;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Webview\")")
    private AndroidElement webviewButton;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Login\")")
    private AndroidElement loginButton;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Forms\")")
    private AndroidElement formsButton;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Swipe\")")
    private AndroidElement swipeButton;

    @AndroidFindBy(uiAutomator = ".className(\"android.widget.TextView\").text(\"Drag\")")
    private AndroidElement dragButton;

    public HomeScreen clickOnHomeButton(){
        clickOnElement(homeButton);
        return new HomeScreen(getDriver());
    }

    public WebviewScreen clickOnWebview(){
        clickOnElement(webviewButton);
        return new WebviewScreen(getDriver());
    }

    public LoginScreen clickOnLogin(){
        clickOnElement(loginButton);
        return new LoginScreen(getDriver());
    }

    public FormScreen clickOnForms(){
        clickOnElement(formsButton);
        return new FormScreen(getDriver());
    }
    public SwipeScreen clickOnSwipe(){
        clickOnElement(swipeButton);
        return new SwipeScreen(getDriver());
    }
    public DragScreen clickOnDrag(){
        clickOnElement(dragButton);
        return new DragScreen(getDriver());
    }


}
