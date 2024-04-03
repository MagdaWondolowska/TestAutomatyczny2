package myStore;


import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractTest {

    WebDriver driver;
    WebDriverWait wait;

    public void setUp(String browser) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\magda\\WebDrivers\\chromedriver.exe");
        driver = getDriver(browser);
        wait = new WebDriverWait(driver, 3);
    }

//        @After
//    public void closeBrowser() {
//        driver.quit();
//    }

    private WebDriver getDriver(String browser) {
        switch (browser.toUpperCase()) {
            case "FIREFOX": {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\magda\\WebDrivers\\chromedriver.exe");
                return new FirefoxDriver();
            }
            default: {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                return new ChromeDriver();
            }
        }
    }
}