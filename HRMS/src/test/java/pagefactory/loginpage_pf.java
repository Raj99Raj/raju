package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_pf {
	
	@FindBy(name="username")
	WebElement txt_username;
	//@FindBy(xpath="//input[@name='username']")
	//WebElement txt_username;
	//@FindBy(xpath="//input[@name='password']")
	//WebElement txt_password;
	@FindBy(name="password")
	WebElement txt_password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_login;
	
	WebDriver driver;
	public loginpage_pf(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}
	public void clicklogin() {
		btn_login.click();
	}
	

}
