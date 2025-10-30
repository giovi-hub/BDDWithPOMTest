package CartExample.ui.pages;

import CartExample.ui.components.SideMenu;
import CartExample.ui.components.TopMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;
    LoginPage loginPage;
    public By firstProduct = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    public By productAdded = By.xpath("(//p[contains(text(),'Your product has been added to cart.'])");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addFirstProduct(){
        driver.findElement(firstProduct).click();

    }
    public String productMessage(){
        return driver.findElement(productAdded).getText();
    }

}
