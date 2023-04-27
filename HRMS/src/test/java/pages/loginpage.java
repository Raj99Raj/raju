package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
		WebDriver driver;
	By txt_username =By.xpath("//input[@name='username']");
	
	By txt_password = By.xpath("//input[@name='password']");
	
	By btn_login = By.xpath("//button[@type='submit']");
	
	
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}

	public void enterusername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterpassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clicklogin() {
		driver.findElement(btn_login).click();
	}
	

}
