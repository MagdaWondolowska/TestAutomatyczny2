package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

    private WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void payment () {
        WebElement element = driver.findElement(By.id("payment-option-1"));
        element.click();
        element = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        element.click();
        element = driver.findElement(By.cssSelector("button[class='btn btn-primary center-block']"));
        element.click();

    }


}
