package scenarios;

import listeners.ScreenshootsListener;
import module.LoginWithGplusModule;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ListingPage;
import pages.LoginPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by NugrohoSantoso on 8/26/16.
 */
@Listeners(ScreenshootsListener.class)
@Features("Login Feature")
public class LoginGplusTest extends AndroidSetup {
    private LoginWithGplusModule loginWithGplusModule;

    // login with Gplus
    @Test(enabled = false)
    public void userAbleToRedirectToGmailLogin() {
        LoginPage loginPage = new LoginPage(driver);
        LoginWithGplusModule gplus = loginPage.clickLoginWithGPlus();
        gplus.verifyAccountExist();
    }

    @Stories("As A User I Will not be Able to Login with Google+")
    @Title("Verify User Not Able to Login with Invalid Google+ Credentials")
    @TestCaseId("TC_LBG_03_001")
    @Test(priority = 6, enabled = false)
    public void userNotAbleToLoginWithInvalidGplusCredentials() {}

    @Stories("As A User I want able to Login Using Google+")
    @Title("Verify Google+ ask permissions from users to give the granted access")
    @TestCaseId("TC_LBG_03_003")
    @Test(priority = 7)
    public void userAbleToGiveGrantedAccessToGplus() {
        LoginPage loginPage = new LoginPage(driver);
        loginWithGplusModule = loginPage.clickLoginWithGPlus();
        loginWithGplusModule.verifyAccountExist();
        loginWithGplusModule.clickSelectedAccounts();
        loginWithGplusModule.verifyPermissionDetailsInfo();
        loginWithGplusModule.verifyDenyBtn();
        loginWithGplusModule.verifyAllowBtn();
        loginWithGplusModule.clickAllowBtn();
    }

    @Stories("As A User I want able to Login with Google+")
    @Title("Verify User Able to Login with Google+ Credentials")
    @TestCaseId("TC_LBG_03_002")
    @Test(priority = 7, enabled = false)
    public void userAbleToLoginWithValidGplusCredentials() {}

    @Stories("As A User I want Set Preferences Category After Success Login")
    @Title("Verify User Able to Set Preferences Category After Success Login")
    @TestCaseId("TC_LBG_03_005, TC_LBG_03_004")
    @Test(priority = 8)
    public void userAbleGoToListingAfterSuccessGplusLogin() {
        LoginPage loginPage = new LoginPage(driver);
        LoginWithGplusModule gplus = loginPage.clickLoginWithGPlus();
        ListingPage listingPage = gplus.verifyListingPage();
        listingPage.verifyContentsOfListingPage();
    }

    @Stories("As A User I want able to Logout after Success Login")
    @Title("Verify User Able to Logout after Success Google+ Login")
    @TestCaseId("TC_LBG_03_006")
    @Test(priority = 99)
    public void userAbleToLogoutAfterSuccessGplusLogin() {}
}
