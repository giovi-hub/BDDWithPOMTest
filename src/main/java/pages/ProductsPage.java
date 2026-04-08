package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class ProductsPage extends PageObject
{
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    WebElementFacade firstProduct;
    @FindBy(xpath = "//div[@class='modal-body']/p")
    WebElementFacade messageProductAdded;

    public void addFirstProduct(){
        firstProduct.click();
    }
    public String productMessage(){
        return messageProductAdded.getText();
    }
    public void openHomePage(){
        openUrl("https://www.automationexercise.com/");

    }

}
