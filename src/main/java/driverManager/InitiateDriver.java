package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Arrays;

public class InitiateDriver {

   public static ThreadLocal <WebDriver> driver = new ThreadLocal<>(); //will handle driver in each thread run parallelly but independently

    WebDriver driver_tl;


    public WebDriver init_driver(String browserName){
        if (browserName.equals("Chrome")){
            ChromeOptions co = new ChromeOptions();
            co.setExperimentalOption("useAutomationExtension", false);
            co.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));

            driver_tl = new ChromeDriver(co);
            driver.set(driver_tl);

        }
        else if (browserName.equals("firefox")) {
        driver_tl = new FirefoxDriver();
        driver.set(driver_tl);

        }
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return getDriver();
    }
    public static synchronized WebDriver getDriver(){
        return driver.get();
    }

}
