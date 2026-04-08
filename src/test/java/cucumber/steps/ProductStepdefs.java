package cucumber.steps;

import net.serenitybdd.annotations.Steps;
import pages.LoginPage;
import pages.LoginScenariosPage;
import pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class ProductStepdefs {
    @Steps
    ProductsPage productPage;
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        productPage.openHomePage();
    }
    @When("I add the first product to the cart")
    public void iAddTheFirstProductToTheCart() {
        System.out.println("when");
        productPage.addFirstProduct();
    }
    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedText) {
        String actualText = productPage.productMessage();
        assertTrue("Product not found", actualText.contains(expectedText));
    }
}
