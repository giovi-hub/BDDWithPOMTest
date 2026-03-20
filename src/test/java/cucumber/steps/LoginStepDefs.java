package cucumber.steps;

import org.hamcrest.MatcherAssert;
import pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
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
        loginPage.insertCredentials(userEmail, password);

    }
//valid user
    @Then("I should see {string} in the menu")
    public void iShouldSeeInTheMenu(String expectedText) {
        String actualText = loginPage.userLoggedText();
        assertTrue("Expected text not found", actualText.contains(expectedText));
        //driver.quit();


    }
    //invalid user
    @Then("I should see {string} in the login form")
    public void iShouldSeeInTheLoginForm(String expected) {
        String actualString = loginPage.getLoginErrorMessage();
        assertThat("Expected not found", actualString,containsString(expected));
    }
}

