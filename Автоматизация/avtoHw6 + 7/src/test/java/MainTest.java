import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Story("Моя пользовательская история")
public class MainTest extends AbstractTest {

    @Test
    @DisplayName("Авторизация на сайте + скриншот")
    @Severity(value = SeverityLevel.MINOR)
    void signInTest() throws InterruptedException {

        SignIn signIn = new SignIn(getWebDriver());
        signIn.authorization();
       Assertions.assertEquals("КомТек - интернет-магазин компьютеров и комплектующих",
               getWebDriver().getTitle());
    }

    void testFalse() throws InterruptedException, IOException {
        Thread.sleep(1000);
        File file = ForAllure.makeScreenshot(getWebDriver(),"failure- testFalse" + System.currentTimeMillis() + ".png");
        saveScreenshot(Files.readAllBytes(file.toPath()));
        Assertions.assertTrue(true);
    }

    @Step("Шаг 1")
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

    @Test
    @DisplayName("Поиск товара на сайте")
    @Severity(SeverityLevel.MINOR)
    void searchTest(){
        SearchPage searchPage = new SearchPage(getWebDriver());
        searchPage.toSearch("Процессор");
        Assertions.assertEquals("Каталог :: Результаты поиска для \"Процессор\"",
                getWebDriver().getTitle());
    }

    @Test
    @DisplayName("Добавить товар в Избранное и проверить")
    @Severity(SeverityLevel.MINOR)
     void wishlistTest() throws InterruptedException {
        AnotherTests wishlist = new AnotherTests(getWebDriver());
        wishlist.AddAndCheckWishlist();
        Assertions.assertEquals("Отложенные товары", getWebDriver().getTitle());
    }

    @Test
    @DisplayName("Добавить товар в корзину")
    @Severity(SeverityLevel.BLOCKER)
    void addInCartTest() throws InterruptedException {
        AnotherTests cart = new AnotherTests(getWebDriver());
        cart.addInCart();
        Assertions.assertEquals("Накопитель SSD 120Gb ADATA Ultimate SU650 (ASU650SS-120GT-R)",
                getWebDriver().getTitle());
    }
    }

