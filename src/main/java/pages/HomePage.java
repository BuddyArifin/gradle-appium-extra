package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static final String GO_AUTO_LOGO = "//android.widget.TextView[@text='GO-AUTO']";
    public static final String GO_CLEAN_LOGO = "//android.widget.TextView[@text='GO_CLEAN']";

    @AndroidFindBy(xpath = GO_AUTO_LOGO)
    AndroidElement goAuto;

    @AndroidFindBy(xpath = GO_CLEAN_LOGO)
    AndroidElement goClean;

    public void clickGoAutoLogo() {
        goAuto.click();
    }

    public void clickGoCleanLogo() {
        goClean.click();
    }
}
