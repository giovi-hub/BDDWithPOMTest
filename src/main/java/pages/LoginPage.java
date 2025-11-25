package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    By loginLink = By.xpath("//a[contains(text(),'Signup / Login')]");
    By usernameField = By.xpath("//input[@data-qa='login-email']");
    By passwordField = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[@data-qa='login-button']");
    By loggedUserName = By.xpath("//a[contains(text(),'Logged in as')]");

    By messageError = By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void openLoginPage(){
        driver.get("https://www.automationexercise.com");
        driver.findElement(loginLink).click();
    }
    public void loginSucceful(final String userEmail, final String password){
        setUserEmail(userEmail);
        setPassword(password);
        clickLoginButton();
    }
    private void setUserEmail(String userEmail){
        WebElement userEmailTxtBox = driver.findElement(usernameField);
        userEmailTxtBox.clear();
        userEmailTxtBox.sendKeys(userEmail);
    }
    private void setPassword(String password){
        WebElement passwordTxtBox = driver.findElement(passwordField);
        passwordTxtBox.clear();
        passwordTxtBox.sendKeys(password);
    }
    private void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public String userLoggedText(){
        return driver.findElement(loggedUserName).getText();

    }
    public String getLoginErrorMessage(){
        return driver.findElement(messageError).getText();
    }
}
