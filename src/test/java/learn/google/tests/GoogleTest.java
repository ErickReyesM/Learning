package learn.google.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class GoogleTest extends TestBase {

    @Test
    public void titleTest(){
        Assert.assertEquals(driver.getTitle(), "Google");
    }
}
