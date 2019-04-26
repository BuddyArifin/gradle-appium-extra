package scenarios;

import io.qameta.allure.*;
import listeners.ScreenshootsListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by buddyarifin on 9/2/16.
 */
@Listeners(ScreenshootsListener.class)
@Feature("Ads Details")
public class AdsDetailsTest extends AndroidSetup {

    @Story("As A User I want be able to see Overall item on detail listing page")
    @Description("Verify User able to see Overall items of details ads")
    @TmsLink("TC_AdDetails_09_001")
    @Test(priority = 1)
    public void verifyAllContentsOfAdsDetails() {}

    @Story("As A User I want be able to SHARE Ads")
    @Description("Verify User able to SHARE their Ads")
    @TmsLink("TC_AdDetails_09_002")
    @Test(priority = 2)
    public void verifyUserAbleToShareAds() {}

    @Story("As A User I want be able to Learn Tips \"Transaksi Aman\" with \"Info Lebih Lanjut\" Button")
    @Description("Verify User able to Learn Tips Transaksi Aman ")
    @TmsLink("TC_AdDetails_09_003")
    @Test(priority = 3)
    public void verifyUserAbleToAccessTipsTransaksi() {}

    @Story("As A User I want be able to add Ads to Favorite")
    @Description("Verify User able to add Ads to Favorite")
    @TmsLink("TC_AdDetails_09_005")
    @Test(priority = 4)
    public void verifyUserAbleToAddAdsToFavorite() {}

    @Story("As A User I want be able to validate Ads Status ( Dilihat & Dihubungi )")
    @Description("Verify User able to validate Ads Status ( Dilihat & Dihubungi )")
    @TmsLink("TC_AdDetails_09_006")
    @Test(priority = 5)
    public void verifyUserAbleToValidateAdsStatus() {}

    @Story("As A User I want be able to see related Ads & Testimoni by clicking \"Lihat Iklan Lainnya & Testimoni\"")
    @Description("Verify User able to see related Ads & Testimoni by clicking \"Lihat Iklan Lainnya & Testimoni\"")
    @TmsLink("TC_AdDetails_09_008")
    @Test(priority = 6)
    public void verifyUserAbleGoToRelatedAdsAndTestimoni() {}

    @Story("As A User I want be able to find Location Ads with Maps")
    @Description("Verify User able to find Location Ads with Maps")
    @TmsLink("TC_AdDetails_09_009")
    @Test(priority = 7)
    public void verifyUserAbleToFindAdsLocations() {}

    @Story("As A User I want be able to give feedback by \"Laporkan Iklan\" Option")
    @Description("Verify User able to give feedback by \"Laporkan Iklan\" Option")
    @TmsLink("TC_AdDetails_09_010")
    @Test(priority = 8)
    public void verifyUserAbleToLaporkanIklan() {}

    @Story("As A User I want be able to Hubungi Penjual below Ads Details")
    @Description("Verify User abel to Hubungi Penjual")
    @TmsLink("TC_AdDetails_09_011")
    @Test(priority = 9)
    public void verifyUserAbleToHubungiPenjual() {}

}
