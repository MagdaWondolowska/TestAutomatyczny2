package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopingCart {

    private WebDriver driver;
    private WebDriverWait wait;
    public ShopingCart(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void proceedToCheckOut () {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[2]/div[1]/div[2]/div/a")));
        WebElement element = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div[1]/div[2]/div/a"));
        element.click();

    }


}
