package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {
	        
	    },
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports/Automation-Testcase-report.html"
	    }
	    //monochrome = true
	    //tags = "@signin_valid"
	)
	public class TestRunner extends AbstractTestNGCucumberTests {
	   
	}

