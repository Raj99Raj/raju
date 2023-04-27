package stepdefintion;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class loginsteps_pom {
	WebDriver driver= null;
	loginpage login;
	@Given("browser is open")
	public void browser_is_open() {
	
	System.out.println("=====i am inside loginsteps pom====");
	   System.out.println("inside step- browser i open");
	    driver = new ChromeDriver();
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 Thread.sleep(2000);
	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
    login = new loginpage(driver);
	login.enterusername(username);
	login.enterpassword(password);

		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	    
	}
	@And("user clicks on login")
	public void user_clicks_on_login() {
	  login.clicklogin();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		System.out.println("Testcase pass");
		driver.close();
	}

}
*/
