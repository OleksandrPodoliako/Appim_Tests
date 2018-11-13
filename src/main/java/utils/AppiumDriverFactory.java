package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverFactory {

    public static AppiumDriver getAppiumDriver(String platformVersion, String deviceName) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        String applicationPath = System.getProperty("user.dir") + "\\application\\Calculator.apk";

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", applicationPath);
        capabilities.setCapability("automationName", "UiAutomator2");

        switch (platformVersion) {
            case "9.0":
                capabilities.setCapability("platformVersion", "9.0");
                break;
            case "8.0":
                capabilities.setCapability("platformVersion", "8.0");
                break;
            default:
                capabilities.setCapability("platformVersion", "9.0");
                break;

        }

        switch (deviceName) {
            case "Nexus":
                capabilities.setCapability("avd", "Nexus");
                break;
            default:
                capabilities.setCapability("avd", "Nexus");
                break;

        }

        URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");

        return new AndroidDriver(appiumURL, capabilities);
    }
}
