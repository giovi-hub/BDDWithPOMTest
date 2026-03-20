package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.CartPage;

public class CartStepdefs {
    @Steps
    CartPage cartPage;
    @Given("I am on the products page")
    public void iAmOnTheProductsPage() {
        cartPage.openProductPage();

    }

    @When("I add a product {string} to the cart")
    public void iAddAProductToTheCart(String product) {
        cartPage.addProductToCart(product);
    }

    @Then("I should see {string} in the cart")
    public void iShouldSeeInTheCart(String product) {
        cartPage.productInTheCartDisplayed(product);
    }

    @When("I remove product {string} form the cart")
    public void iRemoveProductFormTheCart(String product) {
        cartPage.removeProduct(product);
    }

    @Then("I should not see {string} in the cart")
    public void iShouldNotSeeInTheCart(String product) {
        cartPage.productInTheCartNotDisplayed(product);
    }
}
