package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutPage extends BasePage {

    @FindBy(how = How.CSS, using = "p.product-name")
    public WebElement productName;
    @FindBy(how = How.CSS, using = "p.quantity")
    public WebElement productQty;
    @FindBy( how = How.XPATH, using = "//div[@class='products']")
    public WebElement productsSummary;


    public CheckoutPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
