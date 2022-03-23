package com.stepdef;

import java.util.Map;

import org.testng.annotations.Test;

import com.qatest.pageobject.ecomLoginPage;
import com.qatest.utility.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Test
public class ecomLoginPageStepDef {

	ecomLoginPage ecomlp = new ecomLoginPage(TestBase.driver);

	@Given("user is on main login page")
	public void user_is_on_main_login_page() {
		ecomlp.launch();
	}

	@When("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		ecomlp.loginintoApp();
	}

	@Then("user is redirected to login page")
	public void user_is_redirected_to_login_page() {
		ecomlp.verifyLoginPageDisplayed();
	}

}
