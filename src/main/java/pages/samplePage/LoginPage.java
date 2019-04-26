package pages.samplePage;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static final String username = "//android.widget.EditText[@content-desc='username']";
    public static final String password = "//android.widget.EditText[@content-desc='password']";
    public static final String loginButton = "//android.widget.TextView[@text='LOG IN']";

    @AndroidFindBy(xpath = username)
    AndroidElement usernameField;

    @AndroidFindBy(xpath = password)
    AndroidElement passwordField;

    @AndroidFindBy(xpath = loginButton)
    AndroidElement loginBtn;

    public void inputUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginBtn.click();
    }
}
