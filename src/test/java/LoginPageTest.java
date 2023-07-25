import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LoginPageElements;

import java.time.Duration;

public class LoginPageTest extends TestInit{



    @Test
    public void checkWelcomeText(){
        LoginPageElements loginPageElements = new LoginPageElements(driver);
        urlForLoginPage();
        String[] welcomeText = loginPageElements.welcomeText().getText().split(",");
        Assert.assertEquals("Welcome", welcomeText[0]);
    }

    @Test
    public void validUserLogin(){
        LoginPageElements loginPageElements = new LoginPageElements(driver);
        urlForLoginPage();
        userLogin();
        userPassword();
        loginPageElements.loginBtn().click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(), 'Profile')]")));

        Assert.assertEquals(loginPageElements.profileText().getText(), "Profile");

    }

    public void urlForLoginPage(){
        openUrl("https://demoqa.com/login");
    }

    public void userLogin(){
        LoginPageElements loginPageElements = new LoginPageElements(driver);
        loginPageElements.usernameBox().sendKeys("test_user1");
    }

    public void userPassword(){
        LoginPageElements loginPageElements = new LoginPageElements(driver);
        loginPageElements.passwordBox().sendKeys("Test1234@");
    }
}
