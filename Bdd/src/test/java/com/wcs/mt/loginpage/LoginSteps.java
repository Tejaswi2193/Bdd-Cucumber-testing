package com.wcs.mt.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	WebDriver driver;//single scenario
		//static WebDriver driver;//multiple scenario
		
	public void openBrowser(String browsername)
	{
		
			System.setProperty("webdriver.chrome.driver", "D:\\chrome1_jar\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			
		}
	
	@Given("Given There is a user who visit gmail login page")
	public void gmailpage()
	{
		System.out.println("login page");
	}

	@Given ("^user enter application url \"(.*)\"$")
		public void enterUrl(String url)
		{
			
			driver.get(url);
			System.out.println("enter url");
		}


	@And("^ User login with username \"(.*)\"$")
	public void enterUsername(String uname)
	{
		System.out.println("uname value"+uname);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abc123@gmail.com");
		System.out.println("enter username");
	}

	@And("^User login with username  password \"(.*)\"$")
	public void enterpass(String pass)
	{
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("abc123");
		System.out.println("enter password");
	}

	@When("^ User sends an email to \"(.*)\" $")
	public void emailto()
	{
		driver.findElement(By.xpath("//*[@id=\":qo\"]")).sendKeys("xyz@gmail.com");
		System.out.println("enter emailto");

	}
	
	@And ("^User sends an email  with subject\"(.*)\"$")
	
		public void emailwith()
		{
		driver.findElement(By.xpath("//*[@id=\":q6\"]")).sendKeys("Incubyte");
		System.out.println();
	}
	
	@Then("^User sends an email with the body\"(.*)\"$")
	
	public void emailbody()
	{
		driver.findElement(By.xpath("//*[@id=\":rb\"]")).sendKeys("Automation QA test for Incubyte");
	}

	}