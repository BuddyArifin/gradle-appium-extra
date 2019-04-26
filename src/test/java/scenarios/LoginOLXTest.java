package scenarios;

import io.qameta.allure.*;
import io.qameta.allure.Story;
import listeners.ScreenshootsListener;
import module.LoginWithOlxModule;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CategoryPreferencesPage;
import pages.ListingPage;
import pages.LoginPage;

/**
 * Created by buddyarifin on 8/26/16.
 */

@Listeners(ScreenshootsListener.class)
@Feature("Login Feature")
public class LoginOLXTest extends AndroidSetup {
    private CategoryPreferencesPage categoryPreferencesPage;
    private ListingPage listingPage;

    // login With OLX Login Page

    @Story("A User I Want to See Content in Login Page")
    @Description("Verify System Conten in Login Page Displayed")
    @TmsLink("TC_LOGIN_04_001")
    @Test(priority = 1)
    public void userAbleToContentOLXLogin() {
        LoginPage loginPage = new LoginPage(driver);
        LoginWithOlxModule loginOlx = loginPage.clickLoginWithOlx();
        loginOlx.verifyLoginOlxContents();
    }

    @Story("As A User I Will not be Able to Login")
    @Description("Verify User Not Able to Login with OLX Account and with unregistered Email")
    @TmsLink("TC_LOGIN_04_002")
    @Test(priority = 6, enabled = false)
    public void userNotAbleToLoginWithUnregisteredEmail() {
        LoginWithOlxModule loginOlx = new LoginWithOlxModule(driver);
        loginOlx.inputEmail("remote@gmail.com");
        loginOlx.inputPassword("Welcome123");
        loginOlx.clickLoginWithOlxBtn();
        loginOlx.verifyErrorInvalidEmail();
    }

    @Story("As A User I Will not be Able to Login")
    @Description("Verify User Not Able to Login with OLX Account and with Incorrect Email Format")
    @TmsLink("TC_LOGIN_04_003")
    @Test(priority = 3)
    public void userNotAbleToLoginWithIncorrectEmailFormat() {
        LoginWithOlxModule loginOlx = new LoginWithOlxModule(driver);
        loginOlx.inputEmail("remote");
        loginOlx.inputPassword("hoho");
        loginOlx.clickLoginWithOlxBtn();
        loginOlx.verifyErrorInvalidEmail();
    }

    @Story("As A User I Will not be Able to Login")
    @Description("Verify User Not Able to Login with OLX Account and with Invalid Credentials (Email or Password)")
    @TmsLink("TC_LOGIN_04_004")
    @Test(priority = 4, enabled = false)
    public void userNotAbleToLoginWithInvalidCredentials() {
        LoginWithOlxModule loginOlx = new LoginWithOlxModule(driver);
        loginOlx.inputEmail("remote@gmail.com");
        loginOlx.inputPassword("Welcome123");
        loginOlx.clickLoginWithOlxBtn();
        loginOlx.verifyErrorWrongCredentials();
    }

    @Story("As A User I want not able to Login")
    @Description("Verify User not Able to Login with Empty Credentials")
    @TmsLink("TC_LOGIN_04_006")
    @Test(priority = 2)
    public void userNotAbleToLoginWithBlankCredentials() {
        LoginWithOlxModule loginOlx = new LoginWithOlxModule(driver);
        loginOlx.clickLoginWithOlxBtn();
        loginOlx.verifyErrorBlankEmail();
    }

    @Story("As A User I want able to Login")
    @Description("Verify User Able to Login with OLX Account")
    @TmsLink("TC_LOGIN_04_005")
    @Test(priority = 5)
    public void userAbleToLoginWithValidCredentials() {
        LoginWithOlxModule loginOlx = new LoginWithOlxModule(driver);
        loginOlx.inputEmail("krisna.parahita@olx.co.id");
        loginOlx.inputPassword("testing");
        loginOlx.clickLoginWithOlxBtn();
        listingPage = loginOlx.verifyListingPage();
        listingPage.verifyContentsOfListingPage();
    }

    @Story("As A User I Want be Able to Logout After Success Login by OLX Account")
    @Description("Verify User Able to Logout after Success OLX Account Login")
    @TmsLink("TC_LOGIN_04_006")
    @Test(priority = 7)
    public void userAbleToLogoutAfterSuccessOlxLogin() {}
}
