package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import module.FilterBySubCategory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Log;

import java.util.List;

/**
 * Created by NugrohoSantoso on 9/2/16.
 */
public class FilterPage extends BasePage {
    public static final String backBtn = "";
    public static final String searchField = "com.app.tokobagus.betterb:id/edtSearch";
    public static final String cancelBtn = "com.app.tokobagus.betterb:id/btnClearSearch";
    public static final String locationBtn = "com.app.tokobagus.betterb:id/btnOpenMap";
    public static final String myLocationBtn = "";
    public static final String minHarga = "com.app.tokobagus.betterb:id/edtMinPrice";
    public static final String maksHarga = "com.app.tokobagus.betterb:id/edtMaxPrice";
    public static final String terdekatRBtn = "com.app.tokobagus.betterb:id/rbNearest";
    public static final String terbaruRBtn = "com.app.tokobagus.betterb:id/rbNewest";
    public static final String termurahRBtn = "com.app.tokobagus.betterb:id/rbCheapest";
    public static final String termahalRBtn = "com.app.tokobagus.betterb:id/rbMostExpensive";
    public static final String ubahBtn = "com.app.tokobagus.betterb:id/btnChooseCategory";
    public static final String resetBtn = "com.app.tokobagus.betterb:id/btnReset";
    public static final String simpanBtn = "com.app.tokobagus.betterb:id/btnSearch";
    private FilterBySubCategory filterBySubCategory;

    public FilterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    };

    @Step("Verify System Display Content in Filter Page")
    public void verifyAllContentOfFilterPage()
    {
        verifyBackButton();
        verifySearchField();
        verifyLocationButton();
        verifyMyLocationButton();
        verifyMinHargaButton();
        verifyMaksHargaButton();
        verifyTerdekatRadioButton();
        verifyTerbaruRadioButton();
        verifyTermurahRadioButton();
        verifyTermahalRadioButton();
        verifyUbahButton();
        verifyResetButton();
        verifySimpanButton();
        Log.info("Verify All Content in Filter Page");
    }
    public void verifyBackButton()
    {
//        Assert.assertTrue(isElementPresent(getIdLocator(backBtn)));
        Log.info("Verify Back Button");
    }
    public void verifySearchField()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(searchField)));
        Log.info("Verify Search Field");
    }
    public void verifyCancelButton()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(cancelBtn)));
        Log.info("Verify Cancel Button");
    }
    public void verifyLocationButton()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(locationBtn)));
        Log.info("Verify Location Button");
    }
    public void verifyMyLocationButton()
    {
        Log.info("Verify MyLocation Button");
    }
    public void verifyMinHargaButton()
    {
        Log.info("Verify MinHarga Button");
    }
    public void verifyMaksHargaButton()
    {
        Log.info("Verify MaksHarga Button");
    }
    public void verifyTerdekatRadioButton()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(terdekatRBtn)));
        Log.info("Verify Terdekat Radio Button");
    }
    public void verifyTerbaruRadioButton()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(terbaruRBtn)));
        Log.info("Verify Terbaru Radio Button");
    }
    public void verifyTermurahRadioButton()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(termurahRBtn)));
        Log.info("Verify Termurah Radio Button");
    }
    public void verifyTermahalRadioButton()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(termahalRBtn)));
        Log.info("Verify Termahal Radio Button");
    }

    public void verifyUbahButton()
    {
        hideKeyboardPopUp();
        Assert.assertTrue(isElementPresent(getIdLocator(ubahBtn)));
        Log.info("Verify Ubah Button");
    }
    public void verifyResetButton()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(resetBtn)));
        Log.info("Verify Reset Button");
    }
    public void verifySimpanButton()
    {
        Assert.assertTrue(isElementPresent(getIdLocator(simpanBtn)));
        Log.info("Verify Simpan Button");
    }

    @Step("Click Search Field")
    public void clickSearchField()
    {
        Log.info("Click Search Field");
        clickElement(getIdLocator(searchField));
    }

    @Step("Input Keyword in Search Field")
    public void inputKeywordSearchField(String keyword)
    {
        Log.info("Input Keyword in Search Field : "+keyword);
        sendKeysById(getIdLocator(searchField), keyword);
    }

    @Step("Click Cancel Button in Search Field")
    public void clickCancelButtonSearchField()
    {
        clickElement(getIdLocator(cancelBtn));
    }

    @Step("Click MyLocation Button")
    public void clickMyLocationButton()
    {
        Log.info("Click MyLocation Button");
    }

    @Step("Click Location Button")
    public void clickLocationButton()
    {
        Log.info("Click Location Button");
    }

    @Step("Input MinPrice Range")
    public void inputMinPriceRange()
    {
        Log.info("Input MinPrice Range");
    }

    @Step("Input MaxPrice Range")
    public void inputMaxPriceRange()
    {
        Log.info("Input MaxPrice Range");
    }

    @Step("Click Terdekat Radio Button in Urutkan Column")
    public void clickRadioButtonTerdekatInUrutkanColumn()
    {
        clickElement(getIdLocator(terdekatRBtn));
        Log.info("Click Terdekat Radio Button in Urutkan Column");
    }

    @Step("Click One of Kondisi Column")
    public void clickRadioButtonInKondisiColumn()
    {
        Log.info("Click One of Kondisi Column");
    }

    @Step("Click Ubah Button")
    public void clickUbahButton()
    {
        filterBySubCategory.verifySubCategoryElementOne();
        filterBySubCategory.clickSubCatergoryElementOne();
        filterBySubCategory.verifySubCategoryElementTwo();
        filterBySubCategory.clickSubCatergoryElementTwo();
        filterBySubCategory.verifySubCategoryElementThird();
        filterBySubCategory.clickSubCatergoryElementThird();
        Log.info("Click Ubah Button");
    }

    @Step("Click Sub-Kategori")
    public void clickSubKategori()
    {
        Log.info("Click Sub-Kategory");
    }

    @Step("Click Reset Button")
    public void clickResetButton()
    {
        clickElement(getIdLocator(resetBtn));
        Log.info("Click Reset Button");
    }

    @Step("Click Simpan Button")
    public void clickSimpanButton()
    {
        Log.info("Click Simpan Button");
    }
}
