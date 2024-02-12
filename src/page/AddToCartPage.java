package page;

import org.openqa.selenium.WebDriver;
import base.Locators;

public class AddToCartPage {
	WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addToCart() {
		driver.findElement(Locators.addToCartMacBook).click();
		driver.findElement(Locators.addToCartIphone).click();
	}
	
}
