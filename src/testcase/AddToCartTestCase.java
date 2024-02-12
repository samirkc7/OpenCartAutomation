package testcase;

import org.testng.annotations.Test;

import base.BasePage;
import page.AddToCartPage;
//import page.SearchAndAddPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AddToCartTestCase {
	WebDriver driver;
	
  @Test
  public void test_addToCart() throws InterruptedException {
	  
	  try {
		  AddToCartPage ac = new AddToCartPage(driver);
		  ac.addToCart();
		  Thread.sleep(5000);
	  
		  WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"alert\"]"));
		  Assert.assertTrue(successMessage.isDisplayed(), "Item was not added to the cart");
		  Thread.sleep(5000);
		
	} catch (Exception e) {
		System.out.println(e);
		
	}
	    
  }
  
//  @Test
//  public void test_Cart() throws InterruptedException {
//	  
//	  try {
//		  SearchAndAddPage sc = new SearchAndAddPage(driver);
//		  sc.searchProduct();
//		  sc.scroll();
//		  Thread.sleep(5000);
//		  sc.addToCart();
//		  Thread.sleep(5000);
//	  
//		  WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"alert\"]"));
//		  Assert.assertTrue(successMessage.isDisplayed(), "Item was not added to cart");
//		  Thread.sleep(5000);
//		
//	} catch (Exception e) {
//		System.out.println(e);
//		
//	}
//	    
//  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  BasePage bp = new BasePage(driver);
	  bp.startbrowser("https://qaopen.bishalkarki.xyz/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
