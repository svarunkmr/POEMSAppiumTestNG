package Scenarios;

import Scenarios.AndroidSetup;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AppiumTest extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void falseLoginTest() throws InterruptedException {
        new Pages.LoginPage(driver).invalidLogin();
    }

}