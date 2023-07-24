import org.testng.Assert;
import org.testng.annotations.Test;

public class BookStoreMainPageTest extends TestInit{

    @Test
    public void clickOnBook(){
        BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
        goToBookStore();
        bookStorePageElements.firstBook().click();
    }
    @Test
    public void clickOnSecondBook(){
        BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
        goToBookStore();
        bookStorePageElements.secondBook().click();
    }

    @Test
    public void searchBarInput(){
        BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
        goToBookStore();
        bookStorePageElements.searchBar().sendKeys("Git pocket");
        bookStorePageElements.firstBook().click();

    }

    @Test
    public void clickOnLoginBtn(){
    BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
    goToBookStore();
    bookStorePageElements.loginBtn().click();
    }
}