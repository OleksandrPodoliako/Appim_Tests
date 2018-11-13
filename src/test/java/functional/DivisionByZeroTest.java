package functional;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;
import utils.MobileTestRunner;
import utils.Utility;

import static org.testng.Assert.assertTrue;

public class DivisionByZeroTest extends MobileTestRunner {

    @Test(alwaysRun = true)
    @Issue("Calculator_Main_05")
    @Feature("Main functionality")
    @Description("Test verifies that application show right result after division by zero")
    public final void divisionByZeroTest() {
        int argumentOne = Utility.randomNumber();
        int argumentTwo = Utility.randomNumber();

        String resultFromApp = mainPage
                .divisionByZeroOperation(argumentOne)
                .getResultLabel()
                .getText();

        String errorMessage = String.format("Division by zero result is wrong. Actual:%1$s Expected: Can't divide by 0", resultFromApp);

        assertTrue(resultFromApp.equals("Can't divide by 0"), errorMessage);
    }
}
