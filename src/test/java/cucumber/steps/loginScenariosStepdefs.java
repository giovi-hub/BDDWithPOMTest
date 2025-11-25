package cucumber.steps;


import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.WebDriver;
import pages.LoginScenariosPage;
import io.cucumber.java.en.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class loginScenariosStepdefs {
    @Managed(uniqueSession = true)
    WebDriver driver;
    @Steps
   LoginScenariosPage loginScenariosPage;
    @Given("I am on the page")
    public void iAmOnThePage() {
        loginScenariosPage.openPage();

    }
    @When("I enter with userEmail {string} and Pass {string}")
    public void iEnterWithUserEmailAndPass(String email, String pass) {
        loginScenariosPage.loginUser(email,pass);

    }
    @Then("I should see a message {string}")
    public void iShouldSeeAMessage(String expectedResult) {
        String actualResult = loginScenariosPage.getLoginMessage();
        System.out.println("Mensaje real: " + actualResult);
        System.out.println("expected: " + expectedResult );
        assertThat("Expected not found", actualResult,containsString(expectedResult));

    }
}
