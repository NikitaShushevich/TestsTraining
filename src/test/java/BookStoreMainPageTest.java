import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.BookStorePageElements;

public class BookStoreMainPageTest extends TestInit{

    @Test
    public void clickOnBook(){
        BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
        openUrl("https://demoqa.com/books");
        bookStorePageElements.firstBook().click();
        Assert.assertEquals(bookStorePageElements.findTitleText().getText(), "Git Pocket Guide");
    }
    @Test
    public void clickOnSecondBook(){
        BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
        openUrl("https://demoqa.com/books");
        bookStorePageElements.secondBook().click();
        Assert.assertEquals(bookStorePageElements.findTitleText().getText(), "Learning JavaScript Design Patterns");
    }

    @Test
    public void searchBarInput(){
        BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
        openUrl("https://demoqa.com/books");
        bookStorePageElements.searchBar().sendKeys("Git pocket");
        bookStorePageElements.firstBook().click();
        Assert.assertEquals(bookStorePageElements.findTitleText().getText(), "Git Pocket Guide");
    }

    @Test
    public void clickOnLoginBtn(){
        BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
        openUrl("https://demoqa.com/books");
        bookStorePageElements.loginBtn().click();
        Assert.assertTrue(bookStorePageElements.userForm().isDisplayed());
    }

    @Test
    public void wrongInput(){
        BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
        openUrl("https://demoqa.com/books");
        bookStorePageElements.searchBox().sendKeys("1213525\n");
        Assert.assertTrue(bookStorePageElements.emptyTableText().isDisplayed());

    }
}