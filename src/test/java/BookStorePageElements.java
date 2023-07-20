import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStorePageElements {

    WebDriver driver;

    public BookStorePageElements(WebDriver driver){
        this.driver = driver;
    }

    public WebElement firstBook(){
        return driver.findElement(By.xpath("//span[@id='see-book-Git Pocket Guide']"));
    }
    public WebElement secondBook(){
        return driver.findElement(By.xpath("//span[@id='see-book-Learning JavaScript Design Patterns']"));
    }
    public WebElement searchBar(){
        return driver.findElement(By.xpath("//input[@id='searchBox']"));
    }

}
