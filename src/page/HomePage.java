package page;

import org.openqa.selenium.WebDriver;

import base.Locators;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click_myAccount() {
		driver.findElement(Locators.myAccount).click();
	}
	
	public void click_navLogin() {
		driver.findElement(Locators.navLogin).click();
	}
	
	public void click_navRegister() {
		driver.findElement(Locators.navRegister).click();
	}
	

}
