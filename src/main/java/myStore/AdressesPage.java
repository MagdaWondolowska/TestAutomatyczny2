package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdressesPage {

    private WebDriver driver;
    public AdressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkAdress() {
        WebElement element = driver.findElement(By.cssSelector("button[name='confirm-addresses']"));
        element.click();

    }





}
