import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MobileTestRunner;
import utils.Utility;

import static org.testng.Assert.assertTrue;

public class AdditionTest extends MobileTestRunner {

    @Test
    public final void additionTest(){
        int argumentOne = Utility.randomNumber();
        int argumentTwo = Utility.randomNumber();
        Integer result = argumentOne + argumentTwo;

        String resultFromApp = mainPage
                .addOperation(argumentOne,argumentTwo)
                .getResultLabel()
                .getText();

        assertTrue(resultFromApp.equals(result.toString()));
    }
}
