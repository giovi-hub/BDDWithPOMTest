package cucumber.steps;

import net.serenitybdd.annotations.Steps;
import pages.LoginScenariosPage;
import io.cucumber.java.en.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class loginScenariosStepdefs {
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
        String actualMsg = loginScenariosPage.getLoginMessage();
        System.out.println(actualMsg);
        assertThat("Expected not found", actualMsg,containsString(expectedResult));

    }
}
