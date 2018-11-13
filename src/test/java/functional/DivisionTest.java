package functional;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;
import utils.MobileTestRunner;
import utils.Utility;

import static org.testng.Assert.assertTrue;

public class DivisionTest extends MobileTestRunner {

    @Test(alwaysRun = true)
    @Issue("Calculator_Main_04")
    @Feature("Main functionality")
    @Description("Test verifies that application show right result after division")
    public final void divisionTest() {
        int argumentOne = Utility.randomNumber();
        int argumentTwo = Utility.randomNumber();
        Double result = (double) argumentOne / argumentTwo;

        String resultFromApp = mainPage
                .divisionOperation(argumentOne, argumentTwo)
                .getResultLabel()
                .getText();

        Double subtraction = Math.abs(Double.parseDouble(resultFromApp) - result);

        String errorMessage = String.format("Division result is wrong. Actual:%1$s Expected: %2$s", resultFromApp, result.toString());

        assertTrue(subtraction <= 0.01, errorMessage);
    }
}
