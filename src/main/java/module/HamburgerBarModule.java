package module;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.BasePage;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Log;

/**
 * Created by NugrohoSantoso on 9/9/16.
 */
public class HamburgerBarModule extends BasePage {

    public static final String avatarSaya = "";
    public static final String profilSayaBtn = "Profil Saya";
    public static final String iklanSayaBtn = "Iklan Saya";
    public static final String saldoOLXBtn = "Saldo OLX";
    public static final String pusatBantuanBtn = "Pusat Bantuan";
    public static final String tentangOLXBtn = "Tentang OLX";

    public HamburgerBarModule(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step("Verify All Contents In HamburgerBar")
    public void verifyAllContentsInHamburgerBar()
    {
        verifyAvatarSaya();
        verifyProfilSayaBtn();
        verifyIklanSayaBtn();
        verifySaldoOLXBtn();
        verifyPusatBantuanBtn();
        verifyTentangOLXBtn();
    }

    public void verifyAvatarSaya()
    {
        WaitForClickabilityOf(getTextLocator(avatarSaya), 100);
        Assert.assertTrue(isElementPresent(getIdLocator(avatarSaya)));
        Log.info("Verify Avatar Profil");
    }
    public void verifyProfilSayaBtn()
    {
        Assert.assertTrue(isElementPresent(getTextLocator(profilSayaBtn)));
        Log.info("Verify Profil Saya Button");
    }
    public void verifyIklanSayaBtn()
    {
        Assert.assertTrue(isElementPresent(getTextLocator(iklanSayaBtn)));
        Log.info("Verify Iklan Saya Button");
    }
    public void verifySaldoOLXBtn()
    {
        Assert.assertTrue(isElementPresent(getTextLocator(saldoOLXBtn)));
        Log.info("Verify Saldo OLX Button");
    }
    public void verifyPusatBantuanBtn()
    {
        Assert.assertTrue(isElementPresent(getTextLocator(pusatBantuanBtn)));
        Log.info("Verify Pusat Bantuan Button");
    }
    public void verifyTentangOLXBtn()
    {
        Assert.assertTrue(isElementPresent(getTextLocator(tentangOLXBtn)));
        Log.info("Verify Tentang OLX Button");
    }

    @Step("Click Profil Saya Button")
    public void clickProfilSayaBtn()
    {
        clickElement(getTextLocator(profilSayaBtn));
        Log.info("Click Profil Saya Button");
    }

    @Step("Click Iklan Saya Button")
    public void clickIklanSayaBtn()
    {
        clickElement(getTextLocator(iklanSayaBtn));
        Log.info("Click Iklan Saya Button");
    }

    @Step("Click Saldo OLX Button")
    public void clickSaldoOLXBtn()
    {
        clickElement(getTextLocator(saldoOLXBtn));
        Log.info("Click Saldo OLX Button");
    }

    @Step("Click Pusat Bantuan Button")
    public void clickPusatBantuanBtn()
    {
        clickElement(getTextLocator(pusatBantuanBtn));
        Log.info("Click Pusat Bantuan Button");
    }

    @Step("Click Tentang OLX Button")
    public void clickTentangOLXBtn()
    {
        clickElement(getTextLocator(tentangOLXBtn));
        Log.info("Click Tentang OLX Button");
    }
}
