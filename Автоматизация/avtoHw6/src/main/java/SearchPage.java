import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends AbstractPage{
    @FindBy(id = "search_input")   //            xpath = ".//input[@name='hint_q']")
    private WebElement searchInput;

    @FindBy(className = "ty-search-magnifier")
    private WebElement submit;


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void toSearch(String value) {
        searchInput.click();
        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.elementToBeClickable(searchInput));
        searchInput.sendKeys(value);
        submit.submit();
    }



}
