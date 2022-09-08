import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignIn extends AbstractPage {

    @FindBy(className = "ac-title")
    private WebElement user;

    @FindBy(id = "login_main_login")
    private WebElement login;

    @FindBy(id = "psw_main_login")
    private WebElement password;

    @FindBy(name = "dispatch[auth.login]")
    private List<WebElement> buttonSignIn;


    public SignIn(WebDriver driver) {
        super(driver);
    }

    public void authorization() throws InterruptedException {
        user.click();
        Thread.sleep(1000);
        getDriver().get("https://komtek.net.ru/login");

        login.click();
        login.sendKeys("qwerty@mail.ru");

        password.click();
        password.sendKeys("qwerty123");

        buttonSignIn.get(1).click();
    }
}



