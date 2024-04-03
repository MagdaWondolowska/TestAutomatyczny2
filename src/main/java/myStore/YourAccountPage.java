package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourAccountPage {

    private WebDriver driver;
    public YourAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseCategory() {
        WebElement element = driver.findElement(By.id("category-3"));
        element.click();
        element = driver.findElement(By.xpath("//*[@id='js-product-list']/div[1]/div[2]/article/div/div[2]/h2/a"));
        element.click();
    }

    public void goToOrderHistory() {
        WebElement element = driver.findElement(By.id("history-link"));
        element.click();
    }


}
