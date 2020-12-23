package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.Base;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;

public class SearchSteps extends Base{

    public HomePage homePage;
    public CheckoutPage checkoutPage;

    public SearchSteps(){
        homePage = new HomePage(driver);
        checkoutPage = new CheckoutPage(driver);
    }


    @Given("^User is on GreenKart landing page$")
    public void userIsOnGreenKartPage() throws Exception {
        homePage.waitForElementVisibility(homePage.greenMarketLogo);
        homePage.waitForElementsVisibility(homePage.products);
    }

    @When("User searches for (.+) vegetable$")
    public void userSearchesForVegetable(String vegetableName) {
        homePage.searchBar.sendKeys(vegetableName);
    }

    @When("^User adds (.+) items to cart$")
    public void userAddsItemsToCart(String qtyOfProducts) throws Exception {
        homePage.waitForElementVisibility(homePage.products.get(0));
        String qtyBoxNumber = homePage.qtyBox.getAttribute("value");

        while (!qtyBoxNumber.contains(qtyOfProducts)){
            homePage.increaseButton.click();
            qtyBoxNumber = homePage.qtyBox.getAttribute("value");
        }

        homePage.addToCartButton.click();
    }

    @When("User proceeds to checkout page")
    public void userProceedsToCheckoutPage() {
        homePage.cartIcon.click();
        homePage.checkoutButton.click();
    }


    @Then("{string} results are displayed")
    public void resultsAreDisplayed(String vegetableName) throws Exception {
        homePage.waitForElementVisibility(homePage.searchResult);
        String searchResultText = homePage.searchResult.getText();
        Assert.assertTrue("The vegetable searched is correct", searchResultText.contains(vegetableName));
    }


    @Then("Verify that (.+) items of (.+) items are displayed in checkout page$")
    public void verifyThatQtyAndNameAreDisplayedInCheckoutPage(String qty, String vegetableName) throws Exception {
        checkoutPage.waitForElementVisibility(checkoutPage.productsSummary);
        Assert.assertTrue("The product name matches", checkoutPage.productName.getText().contains(vegetableName));
        Assert.assertTrue("The quantity selected matches", checkoutPage.productQty.getText().contains(qty));
    }
}
