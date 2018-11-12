package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page_objects.MainPage;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTestRunner {

    protected AppiumDriver appiumDriver;
    protected MainPage mainPage;

    @BeforeMethod
    public final void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", "c:\\Podoliako\\projects\\Appium_Tests\\application\\Calculator.apk");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("avd", "Nexus");

        URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");

        appiumDriver = new AndroidDriver(appiumURL, capabilities);

        mainPage = new MainPage(appiumDriver);
    }

    @AfterMethod
    public final void close() {
        appiumDriver.quit();
    }
}
