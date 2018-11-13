package page_objects;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Utility;

public class MainPage extends BasePageObject {
    private By buttonListLocator = By.xpath("//android.view.ViewGroup[@resource-id = 'com.google.android.calculator:id/pad_numeric']/android.widget.Button");
    private By sevenButtonLocator = By.id("com.google.android.calculator:id/digit_7");
    private By nineButtonLocator = By.id("com.google.android.calculator:id/digit_9");
    private By plusButtonLocator = By.id("com.google.android.calculator:id/op_add");
    private By equalButtonLocator = By.id("com.google.android.calculator:id/eq");
    private By resultLabelLocator = By.id("com.google.android.calculator:id/result");
    private By tanLabelLocator = By.id("com.google.android.calculator:id/fun_tan");

    public MainPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Step("Add argumentOne {0} to argument {1}")
    public MainPage addOperation(int argumentOne, int argumentTwo) {
        int buttonIndexOne = Utility.transformNumberToButtonIndex(argumentOne);
        int buttonIndexTwo = Utility.transformNumberToButtonIndex(argumentTwo);

        waitTillDisappear(tanLabelLocator);
        getElementList(buttonListLocator).get(buttonIndexOne).click();
        getElement(plusButtonLocator).click();
        getElementList(buttonListLocator).get(buttonIndexTwo).click();
        getElement(equalButtonLocator).click();
        return this;
    }

    public WebElement getResultLabel() {
        return getElement(resultLabelLocator);
    }

}
