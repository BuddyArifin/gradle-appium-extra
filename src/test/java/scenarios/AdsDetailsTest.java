package scenarios;

import listeners.ScreenshootsListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by buddyarifin on 9/2/16.
 */
@Listeners(ScreenshootsListener.class)
@Features("Ads Details")
public class AdsDetailsTest extends AndroidSetup {

    @Stories("As A User I want be able to see Overall item on detail listing page")
    @Title("Verify User able to see Overall items of details ads")
    @TestCaseId("TC_AdDetails_09_001")
    @Test(priority = 1)
    public void verifyAllContentsOfAdsDetails() {}

    @Stories("As A User I want be able to SHARE Ads")
    @Title("Verify User able to SHARE their Ads")
    @TestCaseId("TC_AdDetails_09_002")
    @Test(priority = 2)
    public void verifyUserAbleToShareAds() {}

    @Stories("As A User I want be able to Learn Tips \"Transaksi Aman\" with \"Info Lebih Lanjut\" Button")
    @Title("Verify User able to Learn Tips Transaksi Aman ")
    @TestCaseId("TC_AdDetails_09_003")
    @Test(priority = 3)
    public void verifyUserAbleToAccessTipsTransaksi() {}

    @Stories("As A User I want be able to add Ads to Favorite")
    @Title("Verify User able to add Ads to Favorite")
    @TestCaseId("TC_AdDetails_09_005")
    @Test(priority = 4)
    public void verifyUserAbleToAddAdsToFavorite() {}

    @Stories("As A User I want be able to validate Ads Status ( Dilihat & Dihubungi )")
    @Title("Verify User able to validate Ads Status ( Dilihat & Dihubungi )")
    @TestCaseId("TC_AdDetails_09_006")
    @Test(priority = 5)
    public void verifyUserAbleToValidateAdsStatus() {}

    @Stories("As A User I want be able to see related Ads & Testimoni by clicking \"Lihat Iklan Lainnya & Testimoni\"")
    @Title("Verify User able to see related Ads & Testimoni by clicking \"Lihat Iklan Lainnya & Testimoni\"")
    @TestCaseId("TC_AdDetails_09_008")
    @Test(priority = 6)
    public void verifyUserAbleGoToRelatedAdsAndTestimoni() {}

    @Stories("As A User I want be able to find Location Ads with Maps")
    @Title("Verify User able to find Location Ads with Maps")
    @TestCaseId("TC_AdDetails_09_009")
    @Test(priority = 7)
    public void verifyUserAbleToFindAdsLocations() {}

    @Stories("As A User I want be able to give feedback by \"Laporkan Iklan\" Option")
    @Title("Verify User able to give feedback by \"Laporkan Iklan\" Option")
    @TestCaseId("TC_AdDetails_09_010")
    @Test(priority = 8)
    public void verifyUserAbleToLaporkanIklan() {}

    @Stories("As A User I want be able to Hubungi Penjual below Ads Details")
    @Title("Verify User abel to Hubungi Penjual")
    @TestCaseId("TC_AdDetails_09_011")
    @Test(priority = 9)
    public void verifyUserAbleToHubungiPenjual() {}

}
