package functional;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.testng.annotations.Test;
import utils.MobileTestRunner;
import utils.Utility;

import static org.testng.Assert.assertTrue;

public class MultiplicationTest extends MobileTestRunner{

    @Test(alwaysRun = true)
    @Issue("Calculator_Main_02")
    @Feature("Main functionality")
    @Description("Test verifies that application show right result after multiplication")
    public final void multiplicationTest() {
        int argumentOne = Utility.randomNumber();
        int argumentTwo = Utility.randomNumber();
        Integer result = argumentOne * argumentTwo;

        String resultFromApp = mainPage
                .multiplyOperation(argumentOne, argumentTwo)
                .getResultLabel()
                .getText();

        String errorMessage = String.format("Multiply result is wrong. Actual:%1$s Expected: %2$s", resultFromApp, result.toString());

        assertTrue(resultFromApp.equals(result.toString()), errorMessage);
    }
}