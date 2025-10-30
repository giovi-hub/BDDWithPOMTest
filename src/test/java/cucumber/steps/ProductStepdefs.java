package cucumber.steps;

import CartExample.ui.pages.LoginPage;
import CartExample.ui.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import static org.junit.Assert.assertTrue;


public class ProductStepdefs {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productPage;

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginSucceful("got.test.06@gmail.com", "Password@1");

    }

    @When("I add the first product to the cart")
    public void iAddTheFirstProductToTheCart() {
        productPage = new  ProductsPage(driver);
        productPage.addFirstProduct();
    }

    @Then("I should see the message of product added  in the cart")
    public void iShouldSeeTheMessageOfProductAddedInTheCart(String expectedText) {
        String actualText = productPage.productMessage();
        assertTrue("Product not found", actualText.contains(expectedText));
    }
}
