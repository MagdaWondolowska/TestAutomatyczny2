package myStore;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HummingbirdPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HummingbirdPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    public void checkDiscount(String expectedDiscount) {

        WebElement element = driver.findElement(By.cssSelector("span[class='discount discount-percentage']"));
        String currentDiscount = element.getText();
        Assert.assertTrue(currentDiscount.contains(expectedDiscount));


    }

    public void chooseSize(String size) {

        WebElement element = driver.findElement(By.cssSelector("select[id='group_1']"));
        Select select = new Select(element);

        switch (size.toUpperCase()) {
            case "S":
                select.selectByValue("1");
                break;
            case "M":
                select.selectByValue("2");
                break;
            case "L":
                select.selectByValue("3");
                break;
            case "XL":
                select.selectByValue("4");
                break;
            default:
                select.selectByValue("2");

        }


    }
    public void chooseQuantity(int quantity) {

        wait.until(driver -> driver.getCurrentUrl().contains("2-size-m") ||
                driver.getCurrentUrl().contains("3-size-l") ||
                driver.getCurrentUrl().contains("4-size-xl"));



        WebElement element = driver.findElement(By.id("quantity_wanted"));
        element.sendKeys(String.valueOf(quantity));
        element.sendKeys(Keys.DELETE);

    }

    public void addToCart() {
        WebElement element = driver.findElement(By.cssSelector("button[data-button-action='add-to-cart']"));
        element.click();
    }

    public void proceedToCheckout() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a")));
        WebElement element = driver.findElement(By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a"));
        element.click();

    }




}
