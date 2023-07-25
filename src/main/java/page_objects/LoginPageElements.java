package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements {

    WebDriver driver;

    public LoginPageElements(WebDriver driver){
        this.driver = driver;
    }
    public WebElement welcomeText(){
        return driver.findElement(By.xpath("//form[@id='userForm']//h2"));
    }
    public WebElement usernameBox(){
        return driver.findElement(By.xpath("//input[@id='userName']"));
    }

    public WebElement passwordBox(){
        return driver.findElement(By.xpath("//input[@id='password']"));
    }
    public WebElement loginBtn(){
        return driver.findElement(By.xpath("//button[@id='login']"));
    }
    public WebElement newUserBtn(){
        return driver.findElement(By.xpath("//button[@id='newUser']"));
    }

    public WebElement profileText(){
        return driver.findElement(By.xpath("//div[contains(text(), 'Profile')]"));
    }

    public WebElement invalidUserMessege(){
        return driver.findElement(By.xpath("//p[@id='name']"));
    }

    public WebElement newUserPageWelcomeText(){
        return driver.findElement(By.xpath("//div//h4[contains(text(), 'Register to Book Store')]"));
    }
}
