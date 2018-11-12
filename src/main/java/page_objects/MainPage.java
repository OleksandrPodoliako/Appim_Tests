package page_objects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePageObject {
    private By sevenButtonLocator = By.id("com.google.android.calculator:id/digit_7");
    private By nineButtonLocator = By.id("com.google.android.calculator:id/digit_9");
    private By plusButtonLocator = By.id("com.google.android.calculator:id/op_add");
    private By equalButtonLocator = By.id("com.google.android.calculator:id/eq");
    private By resultLabelLocator = By.id("com.google.android.calculator:id/result");

    public MainPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public MainPage addOperation() {
        getElement(sevenButtonLocator).click();
        getElement(plusButtonLocator).click();
        getElement(nineButtonLocator).click();
        getElement(equalButtonLocator).click();
        return this;
    }

    public WebElement getResultLabel() {
        return getElement(resultLabelLocator);
    }

}
