package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Log;

/**
 * Created by NugrohoSantoso on 9/6/16.
 */
public class PostAdsPage extends BasePage {
    public PostAdsPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static final String closeBtn = "";
    public static final String liveViewFrame = "";
    public static final String shutterBtn = "";
    public static final String galeriBtn = "";
    public static final String cropBtnAtas = "";
    public static final String rotateBtn = "";
    public static final String judulIklan = "";
    public static final String ulangBtn = "";
    public static final String batalBtn = "";
    public static final String simpanBtn = "";
    public static final String cropBtnBawah = "";

    @Step("Verify Content in Camera Page")
    public void verifyContentInCameraPage()
    {
        verifyCloseBtn();
        verifyLiveViewFrame();
        verifyShutterBtn();
        verifyGaleriBtn();
        Log.info("Verify Content in Camera Page");
    }

    @Step("Verify Content Additional in Camera Page")
    public void verifyContentAdditionalInCameraPage()
    {
        verifyCropBtnAtas();
        verifyRotateBtn();
        verifyLiveViewFrame();
        verifyCloseBtn();
        verifyJudulIklan();
        verifyUlangBtn();
        verifySimpanBtn();
        Log.info("Verify Content Additional in Camera Page");
    }

    @Step("Verify Content Additional When Cropping Photo")
    public void verifyContentAdditionalWhenCroppingPhoto()
    {
        verifyBatalBtn();
        verifyCropBtnBawah();
        Log.info("Verify Content Additional When Cropping Photo");
    }

    public void verifyCloseBtn()
    {
        Log.info("Verify Close Button");
    }
    public void verifyLiveViewFrame()
    {
        Log.info("Verify Live View Frame");
    }
    public void verifyShutterBtn()
    {
        Log.info("Verify Shutter Button");
    }
    public void verifyGaleriBtn()
    {
        Log.info("Verify Gallery Button");
    }
    public void verifyCropBtnAtas()
    {
        Log.info("Verify Crop Button Bagian Atas");
    }
    public void verifyRotateBtn()
    {
        Log.info("Verify Rotate Button");
    }
    public void verifyJudulIklan()
    {
        Log.info("Verify Textbox Judul Iklan");
    }
    public void verifyUlangBtn()
    {
        Log.info("Verify Ulang Button");
    }
    public void verifyBatalBtn()
    {
        Log.info("Verify Batal Button");
    }
    public void verifySimpanBtn()
    {
        Log.info("Verify Simpan Button");
    }
    public void verifyCropBtnBawah()
    {
        Log.info("Verify Crop Button Bagian Bawah");
    }

    public void clickBackBtn()
    {
        Log.info("Click Back Button");
    }

    public void clickShutterBtn()
    {
        Log.info("Click Shutter Button");
    }

    public void clickGaleriBtn()
    {
        Log.info("Click Galeri Button");
    }

    public void clickCropBtnAtas()
    {
        Log.info("Click Crop Button Bagian Atas");
    }

    public void clickCropBtnBawah()
    {
        Log.info("Click Crop Button Bagian Bawah");
    }

    public void clickRotateBtn()
    {
        Log.info("Click Rotate Button");
    }

    public void inputIsiJudulIklanDisini()
    {
        Log.info("Input Judul Iklan");
    }

    public void clickUlangBtn()
    {
        Log.info("Click Ulang Button");
    }

    public void clickBatalBtn()
    {
        Log.info("Click Batal Button");
    }

    public void clickSimpanBtn()
    {
        Log.info("Click Simpan Button");
    }
}
