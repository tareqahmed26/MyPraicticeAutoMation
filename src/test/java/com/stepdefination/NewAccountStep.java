package com.stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.NewAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAccountStep extends Base


{
	
	     NewAccountPage p1;

		 NewAccountPage p=new NewAccountPage(driver);
	
	
	@Given("user on youtube create account home page")
	public void user_on_youtube_create_account_home_page() {
	    
	 getDriver();
	 
	 
	}
		
	

	@When("user provide first name and last name as a {string}")
	public void user_provide_first_name_and_last_name_as_a(String string) {
	    
	//  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(string);
	  p.getfirstname(string);
	}

	@When("email as a\"tareqahmed11416@gmail.com\"")
	public void email_as_a_tareqahmed11416_gmail_com(String email) {
		
	 // driver.findElement(By.xpath("//input[@id='username']")).click();  
	  p.getusername(email);
	}

	@When("password as {string}")
	public void password_as(String string) {
	  // driver.findElement(By.xpath("//div[@id='passwd']")).click(); 
	p.getpasswword();  
	}

	@When("user provide password as {string}")
	public void user_provide_password_as(String string) {
	  p.getconfirmpassword();  
	 // driver.findElement(By.xpath("//input[@id='confirm-passwd']")).click();
	}

	@Then("user created youtube account")
	public void user_created_youtube_account() {
	    
	  Assert.assertEquals(driver.getTitle(),"https://search.yahoo.com/");
	}
}
