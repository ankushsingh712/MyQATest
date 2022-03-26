package com.qatest.pageobject;

import javax.naming.CommunicationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qatest.utility.AssertUtils;
import com.qatest.utility.TestBase;
import com.qatest.utility.commonUtilities;
import com.qatest.utility.waitUtils;

public class ecomLoginPage extends TestBase implements launchBrowser {

	WebDriver driver;

	public ecomLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//input[@name='email']")
	private WebElement emial_login;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_login;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_button;
	
	@FindBy(xpath = "//a[@class='btn btn-link navbar-btn']")
	private WebElement Acount_text_btm;
	

	public void launch() {

		commonUtilities.openURL();
	}

	public void loginintoApp() throws InterruptedException {
		commonUtilities.HighlightElement(emial_login);
		commonUtilities.sendTextToField(emial_login, "ankushsingh712@gmail.com");
		commonUtilities.HighlightElement(password_login);
		commonUtilities.sendTextToField(password_login, "India@123");
		commonUtilities.HighlightElement(login_button);
		commonUtilities.click(login_button);
		Thread.sleep(5000);
	}

	public void verifyLoginPageDisplayed() {
		commonUtilities.waitTillPageLoad();
		//String loginText= commonUtilities.getObjectText(Acount_text_btm);
		commonUtilities.HighlightElement(Acount_text_btm);
		AssertUtils.assertTextMatches(Acount_text_btm,"ACCOUNT");
	}

}
