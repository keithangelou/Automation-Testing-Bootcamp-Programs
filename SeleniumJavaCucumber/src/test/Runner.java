package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports"}
				,features = {"src\\resources"}
				,junit = "--step-notifications"
				//,dryRun = true
				)

public class Runner {

}
