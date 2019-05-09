package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoAutoPage extends BasePage {

    public GoAutoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // CUCI MOBIL
    public static final String CUCI_MOBIL = "//android.widget.TextView[@text='Cuci Mobil']";
    public static final String CUCI_EKSTERIOR = "//android.widget.TextView[@text='android.widget.TextView]";
    public static final String LANJUT_BUTTON = "com.gojek.life:id/submit";
    public static final String HARGA_TXT = "com.gojek.life:id/price";
    public static final String NO_FAV_BUTTON = "com.gojek.life:id/buttonOrder";
    public static final String SERVICE_PRICE = "com.gojek.life:id/servicePrice";


    // CUCI MOTOR
    public static final String CUCI_MOTOR = "//android.widget.TextView[@text='Cuci Motor']";
    public static final String TOTAL_HARGA = "com.gojek.life:id/textSecond";


    @AndroidFindBy(xpath = CUCI_MOBIL)
    private AndroidElement cuciMobilTxt;

    @AndroidFindBy(xpath = CUCI_EKSTERIOR)
    private AndroidElement cuciEksterior;

    @AndroidFindBy(id = LANJUT_BUTTON)
    private AndroidElement lanjutButton;

    @AndroidFindBy(id = HARGA_TXT)
    private AndroidElement hargaTxt;

    @AndroidFindBy(id = NO_FAV_BUTTON)
    private AndroidElement noFavBtn;

    @AndroidFindBy(id = SERVICE_PRICE)
    private AndroidElement servicePrice;

    @AndroidFindBy(xpath = CUCI_MOTOR)
    private AndroidElement cuciMotorBtn;

    @AndroidFindBy(id = TOTAL_HARGA)
    private AndroidElement totalHarga;

    public void clickCuciMobil() {
        cuciMobilTxt.click();
    }

    public void clickCuciEksterior() {
        cuciMobilTxt.click();
    }

    public void clickLanjutButton() {
        lanjutButton.click();
    }

    public String getHargaTxt() {
        return hargaTxt.getText();
    }

    public void clickNoFavButton() {
        noFavBtn.click();
    }

    public String getServicePrice() {
        return servicePrice.getText();
    }

    public void clickCuciMotor() {
        cuciMotorBtn.click();
    }

    public String getTotalHarga() {
        return totalHarga.getText();
    }
}
