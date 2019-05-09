package com.gembira.setup;

public class BaseConfig {

    public static String screenshotsDir="Screenshots/";
    public static String apkDir="Resources/";
    public static String hubIP="http://127.0.0.1:4443/wd/hub";

    // List Configuration
    public static final String DEVICE = "device";
    public static final String APP_PACKAGE = "com.gojek.life";
    public static final String APP_ACTIVITY = "com.gojek.golife.presentation.feature.LifeSplashActivity";
    public static final String DEVICE_NAME = "Galaxy S4";
    public static final String PLATFORM_NAME = "Android";
    public static final int NEW_COMMAND_TIMEOUT = 60 * 5;
    public static final Boolean IS_NO_RESET = true;
    public static final Boolean IS_FULL_RESET = false;
    public static final Boolean IS_UNIKODE_KEYBOARD_ENABLED = true;
}
