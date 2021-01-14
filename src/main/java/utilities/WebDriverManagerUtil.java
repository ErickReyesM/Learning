package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManagerUtil {

    private static WebDriver driver;

    public static WebDriver createWebDriver(String browserType) {
        switch (browserType){
            default:
            case "chrome":
                driver = getChromeDriver();
                break;
            case "firefox":
                driver = getFireFoxDriver();
        }
        return driver;
    }

    private static WebDriver getFireFoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private static ChromeDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
