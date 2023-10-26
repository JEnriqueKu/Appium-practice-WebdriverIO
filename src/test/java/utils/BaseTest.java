package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;
import pages.MenuBar;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected SoftAssert softAssert = new SoftAssert();
    public AndroidDriver<AndroidElement> driver;
    Dotenv dotenv = Dotenv.load();
    public Logger log = Logger.getLogger(BaseTest.class);

    private DesiredCapabilities enviromentSetup(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,dotenv.get("AUTOMATION_NAME"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, dotenv.get("PLATFORM_NAME"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, dotenv.get("PLATFORM_VERSION"));
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, dotenv.get("DEVICE_NAME"));
        desiredCapabilities.setCapability("appPackage","com.wdiodemoapp");
        desiredCapabilities.setCapability("appActivity",".MainActivity");
        return desiredCapabilities;
    }

    @BeforeMethod
    public void beforeMethod(){
        DesiredCapabilities desiredCapabilities = this.enviromentSetup();
        try {
            this.driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/"),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

    public MenuBar loadMenuBar(){
        return new MenuBar(driver);
    }

    @AfterMethod
    public void afterMethod(){
    }

}
