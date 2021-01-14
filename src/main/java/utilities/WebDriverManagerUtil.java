package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerUtil {

    private static WebDriver driver;

    public static WebDriver createWebDriver(String browserType) {
        switch (browserType){
            default:
            case "chrome":
                driver = getChromeDriver();
        }
        return driver;
    }

    private static ChromeDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
