package scenarios.sampleTests;

import listeners.ScreenshootsListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.samplePage.LoginPage;
import scenarios.AndroidSetup;

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
