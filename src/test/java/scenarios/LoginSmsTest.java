package scenarios;

import io.qameta.allure.Feature;
import listeners.ScreenshootsListener;
import org.testng.annotations.Listeners;

/**
 * Created by NugrohoSantoso on 8/26/16.
 */
@Listeners(ScreenshootsListener.class)
@Feature("Login Feature")
public class LoginSmsTest extends AndroidSetup{
    
    // login with SMS
    public void userNotAbleToLoginWithBlankPIN() {}
    public void userAbleToMintaPIN() {}
    public void userAbleToMintaUlangPIN() {}
    public void userNotAbleToLoginWithInvalidPIN() {}
    public void userNotAbleToLoginWithInvalidPhoneNumber() {}
    public void userAbleToLoginWithValidPIN() {}
}
