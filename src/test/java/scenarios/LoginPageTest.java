package scenarios;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import listeners.ScreenshootsListener;


/**
 * Created by buddyarifin on 8/5/16.
 */
@Listeners(ScreenshootsListener.class)
@Feature("Login Feature")
public class LoginPageTest extends AndroidSetup {

    @Story("As A User I Want to see overall Login Page Details")
    @Description("Verify All Contents of Home Page")
    @TmsLink("TC_HOME_01_001")
    @Test(priority = 1)
    public void verifyHomePageContents() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyContentsOfLoginPage();
    }

    @Story("As A User I Want to skip Login Process")
    @Description("Verify User Able to Skip Login Process and redirect to Listing Page")
    @TmsLink("TC_HOME_01_002")
    @Test(priority = 3)
    public void userAbleToSkipLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSkipButton();
    }

    @Story("As a User I Want to be able to Swipe/Scroll the Intro Image")
    @Description("Verify User Able to Swipe/Scroll the Intro Images")
    @TmsLink("TC_HOME_01_008")
    @Test(priority = 2)
    public void userAbleToSwipeSlide() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifySlidersContents();
    }
}