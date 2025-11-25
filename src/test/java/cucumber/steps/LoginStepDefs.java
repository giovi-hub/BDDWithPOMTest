package cucumber.steps;

import pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class LoginStepDefs {
    WebDriver driver;
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
    }

    @When("I login with username {string} and password {string}")
    public void iLoginWithUsernameAndPassword(String userEmail, String password) {
        loginPage.loginSucceful(userEmail, password);

    }

    @Then("I should see {string} in the menu")
    public void iShouldSeeInTheMenu(String expectedText) {
        String actualText = loginPage.userLoggedText();
        assertTrue("Expected text not found", actualText.contains(expectedText));
        //driver.quit();


    }
}
