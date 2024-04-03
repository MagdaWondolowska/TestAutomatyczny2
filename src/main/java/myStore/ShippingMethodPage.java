package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingMethodPage {

    private WebDriver driver;


    public ShippingMethodPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseShippingMethod() {
        WebElement element = driver.findElement(By.cssSelector("input[value='8,']"));
//        element.click();
        element = driver.findElement(By.cssSelector("button[name='confirmDeliveryOption']"));
        element.click();


    }


}
