package testbase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utilities.PropertiesReader;
import utilities.WebDriverManagerUtil;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    Properties properties = new PropertiesReader().getPropValues("data.properties");

    @BeforeTest
    @Parameters({"browser"})
    public void setUp(String browserType){
        driver = WebDriverManagerUtil.createWebDriver(browserType);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(properties.getProperty("BaseURL"));
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
