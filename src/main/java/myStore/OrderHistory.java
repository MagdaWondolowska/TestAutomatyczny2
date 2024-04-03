package myStore;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderHistory {
    private WebDriver driver;
    public OrderHistory(WebDriver driver) {
        this.driver = driver;
    }

    public void orderStatusVeryfication(String expectedPaymentStatus) {
        WebElement element = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[4]/span"));
        String currentPaymentStatus = element.getText();
        Assert.assertTrue(currentPaymentStatus.contains(expectedPaymentStatus));

    }

    public void orderValueVeryfication(String expectedOrderValue) {
        WebElement element = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]"));
        String currentOrderValue = element.getText();
        Assert.assertTrue(currentOrderValue.contains(expectedOrderValue));



    }


}
