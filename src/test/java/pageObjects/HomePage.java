package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{


    @FindBy(how = How.CSS, using = "[type='search']")
    public WebElement searchBar;
    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'greenLogo')]")
    public WebElement greenMarketLogo;
    @FindAll(@FindBy( how = How.XPATH, using = "//div[@class='product']"))
    public List<WebElement> products;
    @FindBy(how = How.CSS, using = "input.quantity")
    public WebElement qtyBox;
    @FindBy(how = How.CSS, using = "a.increment")
    public WebElement increaseButton;
    @FindBy(how = How.CSS, using = "div.product-action > button")
    public WebElement addToCartButton;
    @FindBy(how = How.CSS, using = "a.cart-icon")
    public WebElement cartIcon;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'CHECKOUT')]")
    public WebElement checkoutButton;
    @FindBy(how = How.CSS, using = "h4.product-name")
    public WebElement searchResult;


    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
