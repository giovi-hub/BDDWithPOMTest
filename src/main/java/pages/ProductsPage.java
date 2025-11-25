package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class ProductsPage {
    WebDriver driver;
    LoginPage loginPage;
    public By firstProduct = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    public By productAdded = By.xpath("(//div[@class='modal-content']//p[1])");

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
