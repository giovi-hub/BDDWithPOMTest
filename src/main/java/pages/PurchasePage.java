package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class PurchasePage extends PageObject {
    @FindBy(xpath = "//a[contains(text(),' Signup / Login')]")
    WebElementFacade loginLink;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElementFacade usernameField;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElementFacade passwordField;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElementFacade loginButton;
    @FindBy(css = "a[href='/products']")
    WebElementFacade productLink;
    @FindBy(css = "div.modal-content")
    WebElementFacade modal;
    @FindBy(xpath = "(//a[contains(@class,'add-to-cart')])[1]")
    WebElementFacade addToCartButton;
    @FindBy(css = "div.modal-content a[href='/view_cart']")
    WebElementFacade viewCartLink;
    @FindBy(css = "a[class='btn btn-default check_out']")
    WebElementFacade checkoutButton;
    @FindBy(css = "textarea[name='message']")
    WebElementFacade commentText;
    @FindBy(css = "a[href='/payment']")
    WebElementFacade placeOrderButton;
    @FindBy(css = "input[name='name_on_card']")
    WebElementFacade nameOfCard;
    @FindBy(css = "input[name='card_number']")
    WebElementFacade cardNumber;
    @FindBy(css = "input[data-qa='cvc']")
    WebElementFacade cvc;
    @FindBy(css = "input[name='expiry_month']")
    WebElementFacade monthExpiration;
    @FindBy(css = "input[name='expiry_year']")
    WebElementFacade yearExpiration;
    @FindBy(xpath = "//button[@data-qa='pay-button']")
    WebElementFacade payAndConfirmButton;
    @FindBy(css = "h2[data-qa='order-placed']")
    WebElementFacade confirmMessage;



    public void openHomePage(){
        openUrl("https://www.automationexercise.com/");
    }
    public void loginUser(final String userEmail, final String password){
        loginLink.waitUntilClickable().click();
        usernameField.type(userEmail);
        passwordField.type(password);
        loginButton.click();
    }
    public void addProductToCart(){
        productLink.click();
        addToCartButton.waitUntilClickable().click();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(modal).isVisible();
        viewCartLink.waitUntilClickable().click();
    }
    public void processToCheckout(){
        checkoutButton.waitUntilClickable().click();
    }

    public void enterCommentAndPlaceOrder(String comment){
        commentText.type(comment);
        placeOrderButton.waitUntilClickable().click();
    }
    public void enterPaymentData(){
        nameOfCard.type("name01");
        cardNumber.type("12345");
        cvc.type("123");
        monthExpiration.type("06");
        yearExpiration.type("2030");
        payAndConfirmButton.waitUntilClickable().click();
    }
    public String getConfirmationMessage(){
        return confirmMessage.getText();
    }

}
