package page;

import org.openqa.selenium.WebDriver;

import base.Locators;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterEmail(String email) {
		driver.findElement(Locators.txtEmail).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(Locators.txtPassword).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(Locators.btnLogin).click();
	}
	
	public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLogin();
	}
	
	

}
