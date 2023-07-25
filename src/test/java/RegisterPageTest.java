import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page_objects.RegisterPageElements;

import java.time.Duration;

public class RegisterPageTest extends TestInit {

    @Test
    public void validDataRegister() {
        RegisterPageElements registerPageElements = new RegisterPageElements(driver);
        registerPageElements
                .urlForRegisterPage(driver)
                .insertUserFirstName("TestUserFirstName")
                .insertUserLastName("TestUserLastName")
                .insertUserName("TestUserName")
                .insertUserPassword("Test1234@")
                .clickRegisterBtn();


    }





    public void waitForElementToBeActive(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }


}
