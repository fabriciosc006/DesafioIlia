package br.com.Apidesafioilia;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {
				"src/test/resources"
				
		},
		plugin = {
				"pretty",
				"html:results/html/cucumber.html"
		},
		monochrome = true
)

public class TestRunner {

}
