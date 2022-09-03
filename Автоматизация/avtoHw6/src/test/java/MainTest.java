import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest extends AbstractTest {

    @Test
    void signInTest() throws InterruptedException {

        SignIn signIn = new SignIn(getWebDriver());
        signIn.authorization();
       Assertions.assertEquals("КомТек - интернет-магазин компьютеров и комплектующих",
               getWebDriver().getTitle());
    }

    @Test
    void searchTest(){
        SearchPage searchPage = new SearchPage(getWebDriver());
        searchPage.toSearch("Процессор");
        Assertions.assertEquals("Каталог :: Результаты поиска для \"Процессор\"",
                getWebDriver().getTitle());
    }

    @Test
    void wishlistTest() throws InterruptedException {
        AnotherTests wishlist = new AnotherTests(getWebDriver());
        wishlist.AddAndCheckWishlist();
        Assertions.assertEquals("Отложенные товары", getWebDriver().getTitle());
    }

    @Test
    void addInCartTest() throws InterruptedException {
        AnotherTests cart = new AnotherTests(getWebDriver());
        cart.addInCart();
        Assertions.assertEquals("Накопитель SSD 120Gb ADATA Ultimate SU650 (ASU650SS-120GT-R)",
                getWebDriver().getTitle());
    }
    }

