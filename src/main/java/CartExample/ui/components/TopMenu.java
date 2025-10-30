package CartExample.ui.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {
    WebDriver driver;

    By productsLink = By.linkText("//a[contains(text(),'products')]");

    public void openProductPage() {
        driver.findElement(productsLink).click();
    }
}
