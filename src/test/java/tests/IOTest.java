package tests;

import org.testng.annotations.Test;
import pages.*;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

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
    public void successfulSingup(){
        MenuBar menuBar = loadMenuBar();
        LoginScreen loginScreen = menuBar.clickOnLogin();

        loginScreen.clickOnSingUpWidgetButton();
        loginScreen.writeEmail();
        loginScreen.writePassword();
        loginScreen.writePasswordAgain();
        loginScreen.clickOnSingUpButton();

        softAssert.assertEquals(loginScreen.successfulMessageText(),"You successfully signed up!");

        loginScreen.clickOnOkButton();
    }

    @Test
    public void successfulLogin(){
        MenuBar menuBar = loadMenuBar();
        LoginScreen loginScreen = menuBar.clickOnLogin();
        successfulSingup();
        loginScreen.clickOnLoginWidgetButton();
        loginScreen.writeEmail();
        loginScreen.writePassword();
        loginScreen.clickOnLoginButton();
        softAssert.assertEquals(loginScreen.loginMessageText(),"You are logged in!");
    }

    @Test
    public void swipeCards(){
        MenuBar menuBar = loadMenuBar();
        SwipeScreen swipeScreen = menuBar.clickOnSwipe();

        swipeScreen.swipeToTheRightCart1();

    }
}
