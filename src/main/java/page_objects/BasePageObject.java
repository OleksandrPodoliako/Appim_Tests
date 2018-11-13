package page_objects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumFluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

public abstract class BasePageObject {

    protected AppiumDriver appiumDriver;
    private WebDriverWait explicitWait;

// TODO To investigate why test are failed with less timeout
    BasePageObject(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        this.explicitWait = new WebDriverWait(appiumDriver,10);
    }

     WebElement getElement(By locator) {
        return explicitWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    void waitTillDisappear(By locator){
        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    List<WebElement> getElementList(By locator){
        return  explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
}
