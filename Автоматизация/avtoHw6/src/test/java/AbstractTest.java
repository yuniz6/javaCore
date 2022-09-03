import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AbstractTest {

    static WebDriver webDriver;

    @BeforeAll
    static void setDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.setPageLoadTimeout(Duration.ofSeconds(10));


        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeEach
    void initMainPage() throws InterruptedException {
        Assertions.assertDoesNotThrow( ()-> getWebDriver().navigate().to("https://komtek.net.ru/"),
                "Страница не доступна");
        Assertions.assertTrue(true);
        Thread.sleep(2000);

    }

//    @AfterAll
//    public static void exit(){
//
//        if(webDriver !=null) webDriver.quit();
//    }

    public WebDriver getWebDriver(){
        return this.webDriver;
    }
}