import org.testng.annotations.Test;

public class BookStoreMainPageTest extends TestInit{

    @Test
    public void clickOnBook(){
        BookStorePageElements bookStorePageElements = new BookStorePageElements(driver);
        goToBookStore();
        bookStorePageElements.clickOnFirstBook().click();


    }
}
