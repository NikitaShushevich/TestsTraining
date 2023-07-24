import org.junit.Assert;
import org.junit.Test;

public class LoginPageTest extends TestInit{

    @Test
    public void checkWelcomeText(){
        LoginPageElements loginPageElements = new LoginPageElements(driver);
        goToLoginPage();
        String welcomeText = loginPageElements.welcomeText().getText();
        Assert.assertEquals(welcomeText, "Welcome");
    }


}
