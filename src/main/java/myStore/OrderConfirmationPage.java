package myStore;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class OrderConfirmationPage {

    private WebDriver driver;
    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void screenShot() {

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("src\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String generatedOrderValue () {
        WebElement element = driver.findElement(By.cssSelector("div[class='col-xs-4 text-sm-center text-xs-right bold']"));
        return element.getText();

    }

    public void goToAccountDetails () {
        WebElement element = driver.findElement(By.xpath("//*[@id='_desktop_user_info']/div/a[2]/span"));
        element.click();
    }


}
