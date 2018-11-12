import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MobileTestRunner;

import static org.testng.Assert.assertTrue;

public class AdditionTest extends MobileTestRunner {

    @Test
    public final void additionTest(){
        String result = mainPage
                .addOperation()
                .getResultLabel()
                .getText();
        assertTrue(result.equals("16"));
    }
}
