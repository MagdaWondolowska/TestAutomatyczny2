package myStore;

import org.openqa.selenium.*;

import java.util.List;

public class HomePage {

    private WebDriver driver;
    private WebElement element;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    public void goToLoginPage() {
        WebElement element = driver.findElement(By.cssSelector("a[title='Log in to your customer account']"));
        element.click();


    }




}
