package com.hcl.definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Definition 
{
	WebDriver driver;
	@Given("launching browser")
	public void launching_browser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gangana.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.firstcry.com/");
	    		
}

	@When("hit the firstcry URL")
	public void hit_the_firstcry_URL()
	
	{
		System.out.println("Website launched");
		
	 }

	@Then("First cry website launched")
	public void first_cry_website_launched() 
	
	{
		System.out.println("Firstcry website launched");
	 }
	
	
	@Given("Mouse hover on All categories and boys fashion")
	public void mouse_hover_on_All_categories_and_boys_fashion() {
		//Locators
	WebElement elmt=driver.findElement(By.xpath("//li[@class='allcat']"));
	WebElement elmt1=driver.findElement(By.xpath("//a[@class='M13_42']"));
	
	//Actions class for performing mouse hover 
	Actions act= new Actions(driver);
	act.moveToElement(elmt).perform();
	System.out.println("All categories mouse hover performed");
	
	act.moveToElement(elmt1).perform();
	System.out.println("Boys Fashion mouse hover performed");
	
	    	}

	@When("Open the sub categories")
	public void open_the_sub_categories() 
	
	{
			
		
	   
	}

	@Then("Open the sub categories of Boys fashion")
	public void open_the_sub_categories_of_Boys_fashion() {
	    
	}

}

