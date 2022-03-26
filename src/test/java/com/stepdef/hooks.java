package com.stepdef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qatest.utility.TestBase;
import com.qatest.utility.commonUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {

	@Before
	public void openBrowser() {
		TestBase.loadProperties();
		TestBase.initDriver();
	}

	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			TestBase.driver.quit();
		}
		//test 
		TestBase.driver.quit();
	}
}
