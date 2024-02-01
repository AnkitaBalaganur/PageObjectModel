package pom_framework.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class LoginPageObject {
	
	private OperaDriver driver;
	
	public LoginPageObject(OperaDriver driver) {
		this.driver = driver;
		
	}
	
	By username =By.xpath("//*[@id='email']");
	By password =By.xpath("//*[@id='pass']");
	By loginButton =By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button");
	
	public WebElement getUsername() {
		
		return driver.findElement(username);
	}
	
public WebElement getPassword() {
		
		return driver.findElement(password);
	}
public WebElement getLoginButton() {
	
	return driver.findElement(loginButton);
}


}
