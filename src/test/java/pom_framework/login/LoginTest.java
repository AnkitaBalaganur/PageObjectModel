package pom_framework.login;

import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import pom_framework.pageobject.LoginPageObject;

public class LoginTest {
	@Test
	public void testLoginPage() {
		System.setProperty("webdriver.opera.driver", "D:\\test1\\operadriver_win64\\operadriver.exe");
		 
		OperaDriver driver = new OperaDriver();

		driver.get("http://www.fb.com");		
		LoginPageObject PageObject = new LoginPageObject(driver);
		
		PageObject.getUsername().sendKeys("mike@gmail");
		PageObject.getPassword().sendKeys("test");
		PageObject.getLoginButton().click();
	}}