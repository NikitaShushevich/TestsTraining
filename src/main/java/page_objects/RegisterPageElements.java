package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageElements {
    WebDriver driver;

    public RegisterPageElements(WebDriver driver){
        this.driver = driver;

    }

    private WebElement registerPageText(){
        return driver.findElement(By.xpath("//div//h4[contains(text(), 'Register to Book Store')]"));
    }

    private WebElement userFirstNameBox(){
        return driver.findElement(By.xpath("//input[@id='firstname']"));
    }

    private WebElement userLastNameBox(){
        return driver.findElement(By.xpath("//input[@id='lastname']"));
    }

    private WebElement userNameBox(){
        return driver.findElement(By.xpath("//input[@id='userName']"));
    }

    private WebElement userPasswordBox(){
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    private WebElement captchaCheckBox(){
        return driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
    }

    private WebElement registerBtn(){
        return driver.findElement(By.xpath("//button[@id='register']"));
    }

    public RegisterPageElements urlForRegisterPage(WebDriver driver) {
        driver.get("https://demoqa.com/register");
        return this;
    }

    public RegisterPageElements insertUserFirstName(String userName) {
        userFirstNameBox().sendKeys(userName);
        return this;
    }

    public RegisterPageElements insertUserLastName(String userLastName) {
        userLastNameBox().sendKeys(userLastName);
        return this;
    }

    public RegisterPageElements insertUserName(String userName) {
        userNameBox().sendKeys(userName);
        return this;
    }

    public RegisterPageElements insertUserPassword(String userPassword) {
        userPasswordBox().sendKeys(userPassword);
        return this;
    }

    public RegisterPageElements clickRegisterBtn(){
        registerBtn().click();
        return this;
    }
}
