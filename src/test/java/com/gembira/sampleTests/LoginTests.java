package com.gembira.sampleTests;

import listeners.ScreenshootsListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.samplePage.LoginPage;

@Listeners(ScreenshootsListener.class)
public class LoginTests extends SetupFramework {

    @Test
    public void userAbleToLogin() {
        LoginPage loginPage = new LoginPage(driver);

        // Start Test
        loginPage.inputUsername("Gembus");
        loginPage.inputPassword("GembusPss");
        loginPage.clickLoginButton();
    }
}
