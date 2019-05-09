package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoLifePage extends BasePage {

    public GoLifePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static final String ApproveDisclamer = "com.gojek.life:id/buttonErrorState";
    public static final String REGULER = "//android.widget.TextView[@text='Reguler']";
    public static final String SPESIAL = "//android.widget.TextView[@text='Special']";
    public static final String PERALATAN_GOLIFE = "//android.widget.TextView[@text='Peralatan GO-CLEAN']";
    public static final String PAKAI_KOST = "//android.widget.TextView[@text='Paket Kost']";

    // KOST
    public static final String HARGA_KOST = "com.gojek.life:id/textSecond";
    public static final String PREF_GENDER = "//android.widget.CheckBox[@text='Wanita']";
    public static final String LANJUT_BUTTON = "//android.widget.Button[@text='Lanjut']";
    public static final String PENYEDIA_FAV = "com.gojek.life:id/buttonOrder";
    public static final String estimatedPrice = "com.gojek.life:id/servicePrice";

    // REGULER
    public static final String satuJamService = "//android.widget.TextView[@text='1 Jam']";


    @AndroidFindBy(id = ApproveDisclamer)
    private AndroidElement approveBtn;

    @AndroidFindBy(xpath = REGULER)
    private AndroidElement regulerBtn;

    @AndroidFindBy(xpath = SPESIAL)
    private AndroidElement spesialBtn;

    @AndroidFindBy(xpath = PERALATAN_GOLIFE)
    private AndroidElement peralatanBtn;

    @AndroidFindBy(xpath = PAKAI_KOST)
    private AndroidElement pakaiKostButton;

    @AndroidFindBy(id = HARGA_KOST)
    private AndroidElement hargaKostTxt;

    @AndroidFindBy(xpath = PREF_GENDER)
    private AndroidElement prefGenderBtn;

    @AndroidFindBy(xpath = LANJUT_BUTTON)
    private AndroidElement lanjutBtn;

    @AndroidFindBy(id = PENYEDIA_FAV)
    private AndroidElement penyediaElementBtn;

    @AndroidFindBy(id = estimatedPrice)
    private AndroidElement estimatePriceTxt;

    @AndroidFindBy(xpath = satuJamService)
    private AndroidElement satuJamServiceBtn;

    public void clickApproveButton() {
        approveBtn.click();
    }

    public void clickRegulerButton() {
        regulerBtn.click();
    }

    public void clickSpesialButton() {
        spesialBtn.click();
    }

    public void clickPeralatanButton() { peralatanBtn.click(); }

    public void clickPakaiKostButton() { pakaiKostButton.click(); }

    public void clickHargakostTxt() { hargaKostTxt.click(); }

    public String getEstimatedPrice() { return hargaKostTxt.getText(); }

    public void clickPrefGenderButton() { prefGenderBtn.click(); }

    public void clickLanjutButton() { lanjutBtn.click(); }

    public void penyediaElementButton() { penyediaElementBtn.click(); }

    public void clickEstimatePrice() { estimatePriceTxt.click(); }

    public String getEstimatePrice() { return estimatePriceTxt.getText(); }

    public void clickSatuJamServiceButton() { satuJamServiceBtn.click(); }
}
