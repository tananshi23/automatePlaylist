package stepDefinition;

import driverManager.InitiateDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;


public class AppHooks {
    WebDriver driver;

    // 4 annotations

    @Before
    public void launchBrowser() {
        InitiateDriver initiateDriver = new InitiateDriver();
        String browserName = "Chrome";
        driver = initiateDriver.init_driver(browserName);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

   // @BeforeStep


  //  @AfterStep
}
