package pageObjects;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage extends Base {
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void waitForElementVisibility(WebElement elementToBeVisible) throws Exception{
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(elementToBeVisible));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void waitForElementsVisibility(List<WebElement> elementsToBeVisible) throws Exception{
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfAllElements(elementsToBeVisible));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
