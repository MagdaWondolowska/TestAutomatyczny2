package myStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

   public void logIn(String login, String password) {
       WebElement element = driver.findElement(By.id("field-email"));
       element.sendKeys(login);
       element = driver.findElement(By.id("field-password"));
       element.sendKeys(password);
       element = driver.findElement(By.id("submit-login"));
       element.click();
   }
}
