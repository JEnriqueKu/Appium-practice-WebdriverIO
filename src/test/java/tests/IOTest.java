package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.BaseTest;

public class IOTest extends BaseTest {

    @Test
    public void navigationMenuBar(){
        MenuBar menuBar = loadMenuBar();
        HomeScreen homeScreen = menuBar.clickOnHomeButton();
        softAssert.assertTrue(homeScreen.robotImageIsDisplayed());
        WebviewScreen webviewScreen = menuBar.clickOnWebview();
        softAssert.assertTrue(webviewScreen.webviewMessageIsDisplayed());
        LoginScreen loginScreen = menuBar.clickOnLogin();
        softAssert.assertTrue(loginScreen.singupMessageIsDisplayed());
        FormScreen formScreen = menuBar.clickOnForms();
        softAssert.assertTrue(formScreen.formMessageIsDisplayed());
        SwipeScreen swipeScreen = menuBar.clickOnSwipe();
        softAssert.assertTrue(swipeScreen.swipeMessageIsDisplayed());
        DragScreen dragScreen = menuBar.clickOnDrag();
        softAssert.assertTrue(dragScreen.dragMessageIsDisplayed());
        log.info("First test");
    }

    @Test
    public void successfuLogin(){
        MenuBar menuBar = loadMenuBar();
        LoginScreen loginScreen = menuBar.clickOnLogin();
        loginScreen.writeEmail("email@hotmail.com");
        loginScreen.writePassword("12345");
        loginScreen.writePasswordAgain("12345");
    }
}
