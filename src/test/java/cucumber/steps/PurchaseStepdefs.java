package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.PurchasePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PurchaseStepdefs {
    @Steps
    PurchasePage purchasePage;
    @Given("I am on the home page for purchase")
    public void iAmOnTheMainPageForPurchase(){
        purchasePage.openHomePage();
    }
    @And("I log in with username {string} and password {string}")
    public void iLogInWithUsernameAndPassword(String user, String password) {
        purchasePage.loginUser(user,password);
    }
    @When("I add a product to the cart")
    public void iAddAProductToTheCart() {
        purchasePage.addProductToCart();
    }

    @And("I proceed to checkout")
    public void iProceedToCheckout() {
        purchasePage.processToCheckout();
    }

    @And("I review your order add the comment {string}")
    public void iReviewYourOrderAddTheComment(String comment) {
        purchasePage.enterCommentAndPlaceOrder(comment);
    }

    @And("I enter the payment data")
    public void iEnterThePaymentData() {
        purchasePage.enterPaymentData();
    }

    @Then("I should see the confirmation message {string}")
    public void iShouldSeeTheConfirmationMessage(String expectedText) {
        String actualText = purchasePage.getConfirmationMessage();
        assertThat(actualText, equalTo(expectedText));

    }

}
