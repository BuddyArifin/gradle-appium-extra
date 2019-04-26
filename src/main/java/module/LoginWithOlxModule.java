package module;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.CategoryPreferencesPage;
import pages.ListingPage;
import utils.Log;

/**
 * Created by buddyarifin on 8/5/16.
 */
public class LoginWithOlxModule extends BasePage {
    public static String titlePage = "Masuk dengan akun OLX";
    public static String emailField = "com.app.tokobagus.betterb:id/entranceLogin_txtEmail";
    public static String passField = "com.app.tokobagus.betterb:id/entranceLogin_txtPass";
    public static String showPass = "";
    public static String loginOlxBtn = "com.app.tokobagus.betterb:id/entranceLogin_btnLogin";
    public static String errorMessageId = "com.app.tokobagus.betterb:id/snackbar_text";
    public static String emailBlankErrorText = "Kolom email tidak boleh kosong";
    public static String passBlankErrorText = "Kolom password tidak boleh kosong";
    public static String emailNotValidText = "Email tidak valid";
    public static String passErrorMsg = "";

    public LoginWithOlxModule(WebDriver driver) {
        super(driver);
    }

    @Step("Verify Login With OLX Contents")
    public void verifyLoginOlxContents() {
        Log.info("verify Login With OLX Contents");
        verifyEmailField();
        verifyPassField();
        verifyShowPass();
        verifyLoginWithOlxBtn();
    }

    @Step("Verify Email Field")
    public void verifyEmailField() {
        Log.info("verify Email Field");
        WaitForClickabilityOf(getIdLocator(emailField), 100);
        Assert.assertTrue(isWaitElementPresent(getIdLocator(emailField)));
    }

    @Step("Verify Pass Field")
    public void verifyPassField() {
        Log.info("verify Pass Field");
        Assert.assertTrue(isWaitElementPresent(getIdLocator(passField)));
    }

    @Step("Verify Login With OLX Button")
    public void verifyLoginWithOlxBtn() {
        Log.info("verify Login With OLXButton");
        Assert.assertTrue(isWaitElementPresent(getIdLocator(loginOlxBtn)));
    }

    @Step("Verify Error Invalid Email")
    public void verifyErrorInvalidEmail() {
        Log.info("verify Error Invalid Email");
        Assert.assertTrue(getStringText(getIdLocator(errorMessageId)).equalsIgnoreCase(emailNotValidText),
                "Result are not same expected : "+emailNotValidText+" But, get error message : "+errorMessageId);
    }

    public void verifyErrorBlankEmail() {
        Log.info("Verify Blank email error message");
        isWaitElementPresent(getIdLocator(errorMessageId));
        Assert.assertTrue(getStringText(getIdLocator(errorMessageId)).equalsIgnoreCase(emailBlankErrorText));
    }

    public void verifyErrorBlankPassword() {
        Log.info("Verify Blank password error message");
        isWaitElementPresent(getIdLocator(errorMessageId));
        Assert.assertTrue(getStringText(getIdLocator(errorMessageId)).equalsIgnoreCase(passBlankErrorText));
    }

    @Step("Verify Error Wrong Credentials")
    public void verifyErrorWrongCredentials() {
        Log.info("verify Error Wrong Credentials");
        Assert.assertTrue(isElementPresent(getIdLocator(errorMessageId)));
    }

    @Step("Verify Show Password")
    public void verifyShowPass() {
        Log.info("verify Show Password");
    }

    public void inputEmail(String emailText) {
        Log.info("Input email "+emailText);
        sendKeysById(getIdLocator(emailField), emailText);
    }

    public void inputPassword(String passwordText) {
        Log.info("Input pass "+passwordText);
        sendKeysById(getIdLocator(passField), passwordText);
    }

    @Step("Verify Click Login With OLX Button")
    public void clickLoginWithOlxBtn() {
        Log.info("verify Click Login With OLXButton");
        clickElement(getIdLocator(loginOlxBtn));
    }

    @Step("Verify Set Category Preferences")
    public CategoryPreferencesPage verifySetCategoryPreferences() {
        Log.info("verify Set Catefory Preferences");
        return new CategoryPreferencesPage(driver);
    }

    @Step("Verify Listing Page")
    public ListingPage verifyListingPage() {
        Log.info("verify Listing Page");
        return new ListingPage(driver);
    }

}
