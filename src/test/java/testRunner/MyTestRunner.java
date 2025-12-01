package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
        features = "C:\\Users\\ADMIN\\Documents\\Automation\\AutomatePlaylist\\src\\test\\resources\\appFeatures",
        glue = {"stepDefinition"},
        tags = "@Smoke",
        plugin ={"rerun:target/failedTC.txt"}
)
public class MyTestRunner extends AbstractTestNGCucumberTests {


}
