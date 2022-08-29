import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;




public class hw5 {
    static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @BeforeEach
    void getPage() {
        driver.get("https://komtek.net.ru/");
    }

    @Test
    void testSignIn() throws InterruptedException {

        driver.get("https://komtek.net.ru/login/");
        Thread.sleep(1000);

        WebElement signInLogin = driver.findElement(By.id("login_main_login"));
        signInLogin.sendKeys("qwerty@mail.ru");

        WebElement signInPassword = driver.findElement(By.id("psw_main_login"));
        signInPassword.sendKeys("qwerty123");

        List<WebElement> signInButton = driver.findElements(By.name("dispatch[auth.login]"));
        Thread.sleep(3000);
        signInButton.get(1).click();
        Assertions.assertEquals(
                "КомТек - интерент-магазин компьютеров и комплектующих",
                driver.getTitle(), "Пользователь не авторизован!");

        Thread.sleep(3000);
    }

    @Test
    void testSearch() throws InterruptedException {
        WebElement search = driver.findElement(By.xpath(".//input[@name='hint_q']"));
        search.sendKeys("Ryzen", Keys.ENTER);
        Assertions.assertEquals("Каталог :: Результаты поиска для \"Ryzen\"",
                driver.getTitle(), "Не найдено!");

        Thread.sleep(3000);
    }

    @Test
    void testAddToWishlistAndCheck() throws InterruptedException {
        WebElement search = driver.findElement(By.xpath(".//input[@name='hint_q']"));
        search.sendKeys("SM-A022GZKBSER", Keys.ENTER);

        WebElement addToWishlist = driver.findElement(By.id("button_wishlist_51868"));
        addToWishlist.click();

        Thread.sleep(3000);
        driver.get("https://komtek.net.ru/");
        Thread.sleep(2000);

        WebElement wishlist = driver.findElement(By.id("abt__ut2_wishlist_count"));
        wishlist.click();

        Assertions.assertEquals("Отложенные товары", driver.getTitle());

        Thread.sleep(3000);
    }

    @Test
    void addProductInBox() throws InterruptedException {
        WebElement search = driver.findElement(By.xpath(".//input[@name='hint_q']"));
        search.sendKeys("ASU650SS 120GT R", Keys.ENTER);

        WebElement addInBox = driver.findElement(By.id("button_cart_48722"));
        addInBox.click();

        Assertions.assertEquals
                ("Каталог :: Результаты поиска для \"ASU650SS 120GT R\"",
                        driver.getTitle());
    }

    @Test
    void navigation() throws InterruptedException {
        Actions navigate = new Actions(driver);

        navigate.click(driver.findElement(By.id("sw_dropdown_607")));
        navigate.pause(3000l);
        navigate.click(driver.findElement(By.className("ty-menu__submenu-item-header")));
        navigate.pause(3000l);
        Assertions.assertEquals("КомТек - интерент-магазин компьютеров и комплектующих", driver.getTitle());
    }

//    @Test
//    void filters() throws InterruptedException {
//        driver.get("https://komtek.net.ru/planshety-i-telefony/smartfony/");
//        Thread.sleep(3000);
//        WebElement filter = driver.findElement(By.id("elm_checkbox_32_1078_128041"));
//        filter.click();
//        Thread.sleep(3000);
//        WebElement filter2 = driver.findElement(By.id("1079"));
//        filter2.click();
//    }

//    @AfterAll
//    static void close(){
//        driver.quit();
//    }
}
