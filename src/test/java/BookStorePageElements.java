import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStorePageElements {

    WebDriver driver;

    public BookStorePageElements(WebDriver driver){
        this.driver = driver;
    }

    public WebElement clickOnFirstBook(){
        return driver.findElement(By.xpath("//span[@id='see-book-Git Pocket Guide']"));
    }

}
