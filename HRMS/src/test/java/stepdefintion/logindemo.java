package stepdefintion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.Utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import Utils.Excelutils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.loginpage_pf;

public class logindemo {
	WebDriver driver= null;
	loginpage_pf login ;
	io.cucumber.java.Scenario Scenario;
	ExtentReports extent = new ExtentReports("extent.html", true);
	ExtentTest test = extent.startTest("Orange HRMS  test one",
			"feature to test login functionalities of Orange HRMS");
	
@Before
	public void Setup(io.cucumber.java.Scenario Scenario ) {	
	System.out.println("========Running before Scenario========");
}

@After
	public void cleanup(io.cucumber.java.Scenario Scenario) throws InterruptedException {

		System.out.println("===========Running after Scenario==========");
	if(Scenario.isFailed()) {

			TakesScreenshot ts=(TakesScreenshot) driver;
		byte[] data=ts.getScreenshotAs(OutputType.BYTES);
		Scenario.attach(data, "image/png", "taking failed sc");
        Scenario.embed(data, "image/png");
		}
		else {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] data=ts.getScreenshotAs(OutputType.BYTES);
			Scenario.attach(data, "image/png", "taking passed sc");
			  Scenario.embed(data, "image/png");
		}
		
	driver.close();
	}

	@Given("browser is open")
	public void browser_is_open() {
		
	    System.out.println("inside logindemo");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		test.log(LogStatus.INFO, "Entering URL");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		login = new loginpage_pf(driver);
		 Excelutils excel = new Excelutils("F:\\QSPYDER\\HRMS\\Excel\\data.xlsx", "Sheet1");
		  String username = excel.getCellDataString(1, 0);
		  String password = excel.getCellDataNumber(1, 1);
		  login.enterusername(username);
		 login.enterpassword(password);
		 test.log(LogStatus.PASS,"entered text in password searchbox");
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		login.clicklogin();
		test.log(LogStatus.INFO, "Clicking login button");
	}
	
	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		System.out.println("Testcase pass");
		test.log(LogStatus.INFO, "Ending the test case");
		extent.flush();
		//driver.close();
		
	
	}
	}

