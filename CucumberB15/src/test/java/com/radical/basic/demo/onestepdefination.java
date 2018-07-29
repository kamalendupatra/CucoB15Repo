package com.radical.basic.demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class onestepdefination {
	
	protected WebDriver driver;
	
	
	
	@Given("^the user is on facebook login Page$")
	public void the_user_is_on_facebook_login_Page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\02062018\\chromedriver_win32_B39\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}
	@When("^he enters \"([^\"]*)\" as user name$")
	public void He_enters_user_name(String userName) {
		driver.findElement(By.id("email")).sendKeys(userName);
	}
	@When("^he enters \"([^\"]*)\" as password$")
	public void He_enters_user_password(String pwd) throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(5000);
	}
		
	}
	
	
	
	
	


