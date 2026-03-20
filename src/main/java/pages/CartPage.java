package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {
    @FindBy(css = "a[href='/products']")
    WebElementFacade productLink;
    @FindBy(css = "a[href='/view_cart']")
    WebElementFacade cartLink;
    @FindBy(xpath = "(//a[contains(@class,'add-to-cart')])[1]")
    WebElementFacade product;
    @FindBy(xpath = "//a[contains(@class,'cart_quantity_delete')]")
    WebElementFacade deleteProductButton;
    @FindBy(xpath = "//td[@class='cart_description']")
    WebElementFacade productInCart;

    public void openProductPage(){
        openUrl("https://www.automationexercise.com/products");
    }
    public void addProductToCart(String productName){
        product.waitUntilClickable().click();
    }
    public void removeProduct(String product){
        deleteProductButton.waitUntilClickable().click();
    }
    public void productInTheCartDisplayed(String product){
        productInCart.shouldContainText(product);
    }
    public void productInTheCartNotDisplayed(String product){
        productInCart.shouldNotContainText(product);
    }

}
