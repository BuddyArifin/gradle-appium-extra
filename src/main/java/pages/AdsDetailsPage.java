package pages;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Log;

/**
 * Created by buddyarifin on 9/2/16.
 */
public class AdsDetailsPage extends BasePage {
    protected static final String titleAds = "";
    protected static final String shareBtn = "";
    protected static final String closeBtn = "";
    protected static final String tipsAds = "";
    protected static final String photoAds = "";
    protected static final String priceAds = "";
    protected static final String favoriteBtn = "";
    protected static final String statusAds = "";
    protected static final String postDateAds = "";
    protected static final String conditionsAds = "";
    protected static final String postYearsAds = "";
    protected static final String transactionOptionAds = "";
    protected static final String descriptionsAds = "";
    protected static final String moreInfoBtn = "";
    protected static final String avatarSeller = "";
    protected static final String memberJoinDate = "";
    protected static final String memberRating = "";
    protected static final String adsLocation = "";
    protected static final String idIklan = "";
    protected static final String lihatIklanAndTestimoni = "";
    protected static final String laporkanIklan = "";

    public AdsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyTitleAds(){
        Log.info("Verify Detail Iklan Text");
    }
    public void verifyShareBtn(){
        Log.info("Verify Share Button display");
    }
    public void verifyCloseBtn(){
        Log.info("Verify Close Button display");
    }
    public void verifyTipsAds(){
        Log.info("Verify Tips Transaksi Aman");
    }
    public void verifyPhotoAds(){
        Log.info("Verify Ads Photo display");
    }
    public void verifyPriceAds(){
        Log.info("Verify Price Ads display");
    }
    public void verifyFavoriteBtn(){
        Log.info("Verify Favorite Button display");
    }
    public void verifyStatusAds(){
        Log.info("Verify Status Ads display");
    }
    public void verifyPostDateAds(){
        Log.info("Verify Tanggal Pemasangan Iklan display");
    }
    public void verifyConditionsAds(){
        Log.info("Verify Kondisi Barang pada Iklan display");
    }
    public void verifyPostYearsAds(){
        Log.info("Verify Tahun dari Iklan display");
    }
    public void verifyTransactionAds(){
        Log.info("Verify Available Transaksi eg. Ketemuan");
    }
    public void verifyDescriptionAds(){
        Log.info("Verify Deskripsi Iklan display");
    }
    public void verifyMoreInfoAds(){
        Log.info("Verify Lihat Selengkapnya pada deskripsi display");
    }
    public void verifyAvatarSeller(){
        Log.info("Verify Avatar Profile Picture display");
    }
    public void verifyMemberJoinDate(){
        Log.info("Verify Member Join Date display");
    }
    public void verifyMemberRating(){
        Log.info("Verify Member Rating display");
    }
    public void verifyAdsLocations(){
        Log.info("Verify Lokasi Iklan dengan Maps");
    }
    public void verifyidIklanNumber(){
        Log.info("Verify Iklan ID number");
    }
    public void verifyLihatIklanAndTestimoni(){
        Log.info("Verify Lihat Iklan dan Testimoni");
    }
    public void verifyLaporkanIklan(){
        Log.info("Verify Laporkan Iklan");
    }

    @Step("Verify All Contents of Details Page")
    public void verifyAllContensAdsDetails(){
        verifyTitleAds();
        verifyShareBtn();
        verifyCloseBtn();
        verifyTipsAds();
        verifyPhotoAds();
        verifyPriceAds();
        verifyFavoriteBtn();
        verifyStatusAds();
        verifyPostDateAds();
        verifyConditionsAds();
        verifyPostYearsAds();
        verifyTransactionAds();
        verifyDescriptionAds();
        verifyMoreInfoAds();
        verifyAvatarSeller();
        verifyMemberJoinDate();
        verifyMemberRating();
        verifyAdsLocations();
        verifyidIklanNumber();
        verifyLihatIklanAndTestimoni();
        verifyLaporkanIklan();
    }

    public void clickShareBtn() {
        Log.info("Click SHARE Button");
    }
    public void clickCloseBtn() {
        Log.info("Click Close Button, on Tips Transaksi Aman");
    }
    public void clickInfoLebihLanjut() {
        Log.info("Click Info Lebih Lanjut link Button");
    }
    public void clickFavoriteBtn() {
        Log.info("Click to Favorite Button, Add Ads to Favorite");
    }
    public void clickLihatIklanAndTestimoni() {
        Log.info("Click Lihat Iklan dan Testimoni");
    }
    public void clickLaporkanIklan() {
        Log.info("Click Laporkan Iklan");
    }
    public void clickAdsLocations() {
        Log.info("Click Ads Location Button");
    }
    public void clickMoreInfo() {
        Log.info("Click More Info Button, full description");
    }


}
