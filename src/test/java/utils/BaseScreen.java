package utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BaseScreen {

    AndroidDriver<AndroidElement> driver;
    FluentWait<AndroidDriver<AndroidElement>> wait;

    protected String password = "password";
    protected String email;

    protected BaseScreen(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        this.wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    protected AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

    protected FluentWait<AndroidDriver<AndroidElement>> getWait() {
        return this.wait;
    }

    protected void clickOnElement(AndroidElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected boolean elementIsVisible(AndroidElement element){
        getWait().until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    protected void sendKeysToElement(AndroidElement element, String keys){
        getWait().until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(keys);
    }

    protected void swipeToTheRight(AndroidElement element){
        int height = driver.manage().window().getSize().height;
        int width = driver.manage().window().getSize().width;

        int startPoint = (int) (width * .8);
        int endPoint = (int) (width * .2);
        int anchor = element.getLocation().getY() + element.getSize().getHeight() / 2;

        TouchAction touchAction = new TouchAction(driver);

        touchAction.press(PointOption.point(startPoint, anchor))
                .waitAction()
                .moveTo(PointOption.point(endPoint, anchor))
                .release()
                .perform();

    }

}
