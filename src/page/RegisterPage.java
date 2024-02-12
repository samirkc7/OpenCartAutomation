package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import base.Locators;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterFirstName(String firstname) {
		driver.findElement(Locators.firstNameInput).sendKeys(firstname);
	}
	
	public void enterLastName(String lastname) {
		driver.findElement(Locators.lastNameInput).sendKeys(lastname);
	}
	
	public void enterEmail(String email) {
		driver.findElement(Locators.txtEmail).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(Locators.txtPassword).sendKeys(password);
	}
	
	public void click_Checkbox() {
		driver.findElement(Locators.agreeCheckBox).click();
	}
	
	public void clickRegister() {
		driver.findElement(Locators.btnRegister).click();
	}
	
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void register(String firstname, String lastname, String email, String password) {
		enterFirstName(firstname);
		enterLastName(lastname);
		enterEmail(email);
		enterPassword(password);
		click_Checkbox();
		clickRegister();
	}
	
	
}
