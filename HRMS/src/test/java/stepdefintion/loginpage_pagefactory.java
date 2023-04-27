package stepdefintion;
/*
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.Excelutils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.loginpage_pf;

public class loginpage_pagefactory {
	WebDriver driver= null;
	loginpage_pf login ;
	
	private static Logger logger = LogManager.getLogger(loginpage_pagefactory.class);
	//LOG4J


	ExtentReports extent = new ExtentReports("extent.html", true);
	ExtentTest test = extent.startTest("Orange HRMS  test one",
			"feature to test login functionalities of Orange HRMS");
     
	//EXTENT REPORT
	
	
	
	
	@Given("browser is open")

	public void browser_is_open() {
		logger.info("Browser setup");
		
		
	    System.out.println("==== i am inside loginpage pagefactory===");
	    System.out.println("inside step- browser i open");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		logger.info("Entering URL");
		test.log(LogStatus.INFO, "Entering URL");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		 
		 SoftAssert sa = new SoftAssert();
		 sa.assertEquals("OrangeHRM", "OrangeHRM");
		 System.out.println("title is same");
		 sa.assertAll();
		 
	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		
		login = new loginpage_pf(driver);
		logger.info("Entering Login details");
		//Excelutils excel = new Excelutils("F:\\QSPYDER\\HRMS\\Excel\\data.xlsx", "Sheet1");
	  // String username = excel.getCellDataString(1, 0);
	  // String password = excel.getCellDataNumber(1, 1);
		login.enterusername(username);
		login.enterpassword(password);
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		test.log(LogStatus.PASS,"entered text in password searchbox");
	}
	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		login.clicklogin();
		logger.info("Clicking login button");
		test.log(LogStatus.INFO, "Clicking login button");
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		System.out.println("Testcase pass");
		
		logger.trace("This is trace message");

		test.log(LogStatus.INFO, "Ending the test case");
		extent.flush();
		driver.close();
	}

}
*/