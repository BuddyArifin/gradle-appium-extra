package scenarios.sampleTests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.InstanceDriver;
import utils.Log;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class SetupFramework extends InstanceDriver {

    private void prepareAndroidForAppium(String udid) throws MalformedURLException, Exception {
        File appDir = new File(BaseConfig.apkDir);
        File app = new File(appDir, "VodQA.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", BaseConfig.DEVICE);

        capabilities.setCapability("appPackage", BaseConfig.APP_PACKAGE);
        capabilities.setCapability("appActivity", BaseConfig.APP_ACTIVITY);

        capabilities.setCapability("deviceName", BaseConfig.DEVICE_NAME);
        capabilities.setCapability("platformName", BaseConfig.PLATFORM_NAME);
        capabilities.setCapability("newCommandTimeout", BaseConfig.NEW_COMMAND_TIMEOUT);
        //capabilities.setCapability("udid", udid);

        //No Reset Apps
        capabilities.setCapability("noReset", BaseConfig.IS_NO_RESET);
        capabilities.setCapability("fullReset", BaseConfig.IS_FULL_RESET);

        //No Keyboard Layout
        capabilities.setCapability("unicodeKeyboard", BaseConfig.IS_UNIKODE_KEYBOARD_ENABLED);

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL(BaseConfig.hubIP), capabilities);
        Log.debug("SESSION CREATED : "+ driver.getSessionId().toString() + " " + udid + " ");
    }

    @Parameters({"udid"})
    @BeforeClass
    public void setUp(@Optional String udid, ITestContext ctx) throws Exception{
        prepareAndroidForAppium(udid);
        ctx.setAttribute("WebDriver", this.driver);
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
