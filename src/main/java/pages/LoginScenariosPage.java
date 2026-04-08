package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginScenariosPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),' Signup / Login')]")
    WebElementFacade loginLink;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElementFacade usernameField;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElementFacade passwordField;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElementFacade loginButton;
    @FindBy(xpath = "//li[contains(text(),'Logged in as')]")
    WebElementFacade loggedUser;
    @FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
    WebElementFacade errorMessage;


    public void openPage(){
        openUrl("https://www.automationexercise.com/login");

    }
    public void loginUser(final String userEmail, final String password){
        loginLink.waitUntilClickable().click();
        usernameField.clear();
        usernameField.type(userEmail);
        passwordField.clear();
        passwordField.type(password);
        loginButton.click();

    }
   public String getLoginMessage(){
       if (errorMessage.isPresent() && errorMessage.isVisible()){
           errorMessage.waitUntilVisible();
           return errorMessage.getText();
       } else if (loggedUser.isPresent() && loggedUser.isVisible()) {
           return loggedUser.getText();
       }
       return "";
   }
}
