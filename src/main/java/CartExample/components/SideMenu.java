package CartExample.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideMenu {
    WebDriver driver;
    By womenLink = By.linkText("//[contains(text(),'#Women')]");

    public void selectWomenCategory(){
        driver.findElement(womenLink).click();
    }

}
