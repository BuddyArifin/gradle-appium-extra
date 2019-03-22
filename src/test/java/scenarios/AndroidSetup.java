package scenarios;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.tools.internal.jxc.ap.Const;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.InstanceDriver;
import pages.Constants;
import tracking.NetClient;
import utils.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSetup extends InstanceDriver {

    public NetClient net;
    public JsonObject jsonObject;
    
    public void prepareAndroidForAppium(String udid) throws MalformedURLException, Exception {
        File appDir = new File(Constants.apkDir);
        File app = new File(appDir, "app-debug-1.0.0.1.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", Constants.DEVICE);

        capabilities.setCapability("appPackage", Constants.APP_PACKAGE);
        capabilities.setCapability("appActivity", Constants.APP_ACTIVITY);

        capabilities.setCapability("deviceName", Constants.DEVICE_NAME);
        capabilities.setCapability("platformName", Constants.PLATFORM_NAME);
        capabilities.setCapability("newCommandTimeout", Constants.NEW_COMMAND_TIMEOUT);
        //capabilities.setCapability("udid", udid);
        
        //No Reset Apps
        capabilities.setCapability("noReset", Constants.IS_NO_RESET);
        capabilities.setCapability("fullReset", Constants.IS_FULL_RESET);

        //No Keyboard Layout
        capabilities.setCapability("unicodeKeyboard", Constants.IS_UNIKODE_KEYBOARD_ENABLED);

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL(Constants.hubIP), capabilities);
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

    @DataProvider(name = "testDataProvider")
    public Object[][] getData(Method m) {
        String testname = m.getName() + ".json";
        File jsonFileDir = new File("src/test/resources/goldendata/");
        File jsonfile = new File(jsonFileDir, testname);
        jsonObject = convertFiletoJson(jsonfile.getAbsoluteFile());
        return new Object[][]{{jsonObject}};
    }

    public JsonObject convertFiletoJson(File file) {
        jsonObject = new JsonObject();
        try{
            JsonParser parser = new JsonParser();
            JsonElement jsonElement = parser.parse(new FileReader(file));
            jsonObject = jsonElement.getAsJsonObject();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            Log.info("Warning : File not found");
        }
        return jsonObject;
    }
}
