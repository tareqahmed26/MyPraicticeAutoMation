package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {

	public WebDriver driver;

	public NewAccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstname;

	public void getfirstname(String name) {
		firstname.sendKeys(name);

	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	public void getusername(String email) {
		username.sendKeys(email);
	}

	@FindBy(xpath = "//div[@id='passwd']")
	WebElement passwword;

	public void getpasswword() {
		passwword.click();
	}

	@FindBy(xpath = "//input[@name='ConfirmPasswd']")
	WebElement confirmpassword;

	public void getconfirmpassword() {
		confirmpassword.click();
	}
}
