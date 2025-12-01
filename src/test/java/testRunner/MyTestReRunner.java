package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
        features = "@target/failedTC.txt",
        glue = {"stepDefinition"}

)

public class MyTestReRunner extends AbstractTestNGCucumberTests{


}
