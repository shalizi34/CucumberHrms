package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features/", //specify which feature file to run
					//in our case we do say to run all features inside features package
		glue="com/hrms/steps", //where we can find implementation code for gherkin steps?
					//we specify just package
		dryRun=false, //if set to true it will quickly scan that all gherkin steps have implementation code
					// if set to true no actual execution will happen
		monochrome = true
		,strict=true
		, tags= "@sprint13"
		)

public class TestRunner {

	
}