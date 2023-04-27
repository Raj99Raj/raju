package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.Excelutils;

public class login {
@Test()
public void Login() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Excelutils excel = new Excelutils("F:\\QSPYDER\\HRMS\\Excel\\data.xlsx", "Sheet1");
    String un = excel.getCellDataString(1, 0);
	String pwd = excel.getCellDataNumber(1, 1);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	Assert.assertEquals(title, "OrangeHRM");
	System.out.println("Testcase pass");
	driver.close();
	
}
}


