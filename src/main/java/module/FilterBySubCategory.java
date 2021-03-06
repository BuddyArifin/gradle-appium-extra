package module;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Log;

/**
 * Created by NugrohoSantoso on 9/6/16.
 */
public class FilterBySubCategory extends BasePage {
    public FilterBySubCategory(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static final String subCategoryElement1 = "";
    public static final String subCategoryElement2 = "";
    public static final String subCategoryElement3 = "";
    public static final String luasTanahBtn = "";
    public static final String luasBangunanBtn = "";
    public static final String sertifikatBtn = "";
    public static final String lantaiBtn = "";
    public static final String kamarTidurBtn = "";
    public static final String kamarMandiBtn = "";

    @Step("Verify Content in Additional Filter")
    public void verifyContentInAdditionalFilter()
    {
        Log.info("Verify Content in Additional Filter");
    }

    public void verifySubCategoryElementOne()
    {
        Log.info("Verify Sub Category Element One Appear");
    }
    public void verifySubCategoryElementTwo()
    {
        Log.info("Verify Sub Category Element Two Appear");
    }
    public void verifySubCategoryElementThird()
    {
        Log.info("Verify Sub Category Element Third Appear");
    }

    public void clickSubCatergoryElementOne()
    {
        Log.info("Click One of Sub-Category First Element");
    }
    public void clickSubCatergoryElementTwo()
    {
        Log.info("Click One of Sub-Category Second Element");
    }
    public void clickSubCatergoryElementThird()
    {
        Log.info("Click One of Sub-Category Third Element");
    }
}
