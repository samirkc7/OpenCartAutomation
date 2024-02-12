package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import base.Locators;

public class SearchAndAddPage {
	WebDriver driver;

	public SearchAndAddPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void searchProduct() {
		driver.findElement(Locators.txtSearch).sendKeys("Nikon");
		driver.findElement(Locators.btnSearch).click();
	}
	
	public void addToCart() {
		driver.findElement(Locators.addToCartNikon).click();
	}
	

}
