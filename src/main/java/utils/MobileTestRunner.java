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

    private AppiumDriver appiumDriver;
    protected MainPage mainPage;

    @BeforeMethod
    public final void setUp() throws MalformedURLException {
        appiumDriver = AppiumDriverFactory.getAppiumDriver("9.0", "Nexus");
        mainPage = new MainPage(appiumDriver);
    }

    @AfterMethod
    public final void close() {
        appiumDriver.quit();
    }
}
