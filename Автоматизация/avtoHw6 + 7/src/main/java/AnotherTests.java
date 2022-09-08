import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnotherTests extends AbstractPage {
//    WISHLIST_TEST

    @FindBy (xpath= ".//input[@name='hint_q']")
    private WebElement searchForWishlist;

    @FindBy (id = "det_img_51868desktop")
    private WebElement product;

    @FindBy (id = "button_wishlist_51868")
    private WebElement addToWishlist;

    @FindBy (id= "abt__ut2_wishlist_count")
    private WebElement checkWishlist;

    public AnotherTests(WebDriver driver) {
        super(driver);
    }

    public void AddAndCheckWishlist() throws InterruptedException {
        searchForWishlist.sendKeys("SM-A022GZKBSER", Keys.ENTER);

        product.click();

        addToWishlist.click();
Thread.sleep(9000);
        checkWishlist.click();
    }

//  CART_TEST

    @FindBy (xpath= ".//input[@name='hint_q']")
    private WebElement searchForCart;

    @FindBy (id = "det_img_48722desktop")
    private WebElement product2;

    @FindBy (id= "button_cart_48722")
    private WebElement cart;


    public void addInCart() throws InterruptedException {
        searchForCart.sendKeys("ASU650SS 120GT R", Keys.ENTER);

        product2.click();

        cart.click();
        Thread.sleep(5000);
    }

}
