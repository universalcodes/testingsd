package ccumember.testngg.runnerr;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
glue = "/Automation_BDD/src/selenium/stepss",
tags = "@Login", 
features = "G:\\CucumberFramework\\Automation_BDD\\featureFile\\Test.feature",
plugin = { "cucumberHooks.customReportListener", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm" }
		
		
)


public class TestNGRunnerCucumber extends AbstractTestNGCucumberTests {

}
