package Stepsforhooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	
	WebDriver driver= null;
	
	@Before
  public void BrowserSetup()
  {
		System.out.println("i am inisde browser setup");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	 driver.manage().window().maximize();
  }
	@After
	public void teardown()
	{
		System.out.println("i am inside teardown");
		driver.close();
		driver.quit();
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	}
}
