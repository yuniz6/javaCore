
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        ChromeOptions chromeOptions = options.addArguments("start-maximized");

        chromeOptions.addArguments();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        try {
          //Т-к №1. Авторизация на сайте
            driver.get("https://komtek.net.ru/login/");
            Thread.sleep(1000);

            WebElement signInLogin = driver.findElement(By.id("login_main_login"));
            WebElement signInPassword = driver.findElement(By.id("psw_main_login"));
            WebElement signInButton = driver.findElement(By.xpath("//button[@name='dispatch[auth.login]']"));

            signInLogin.sendKeys("qwerty@mail.ru");

            signInPassword.sendKeys("qwerty123");

            signInButton.click();

            //Т-к №2. Поиск товара
            driver.get("https://komtek.net.ru/");

            WebElement search = driver.findElement(By.xpath(".//input[@name='hint_q']"));

            search.sendKeys("Ryzen 5", Keys.ENTER);

            //Т-к №3. Навигация по категориям сайта
            Thread.sleep(3000);
            driver.navigate().to("https://komtek.net.ru/kompyutery/komplektuyuschie-dlya-kompyuterov/");

            //Т-к №4. Проверка "Избранное"
            Thread.sleep(3000);
            WebElement wishlist = driver.findElement(By.id("abt__ut2_wishlist_count"));

            wishlist.click();
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}

