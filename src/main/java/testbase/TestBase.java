package testbase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.PropertiesReader;
import utilities.WebDriverManagerUtil;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    Properties properties = new PropertiesReader().getPropValues("data.properties");

    @BeforeMethod
    public void setUp(){
        driver = WebDriverManagerUtil.createWebDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(properties.getProperty("BaseURL"));
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
