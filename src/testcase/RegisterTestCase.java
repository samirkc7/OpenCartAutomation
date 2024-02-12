package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import page.HomePage;
import page.RegisterPage;

public class RegisterTestCase {
	WebDriver driver;
 @Test
  public void test_register() {
	 try {
		 HomePage hp = new HomePage(driver);
		 hp.click_myAccount();
		 hp.click_navRegister();
		 RegisterPage rp = new RegisterPage(driver);
		 rp.scroll();
		 rp.register("Samir", "kc", "skc1@gmail.com", "samirkc");
		 Thread.sleep(5000);
		 
		 String expected = "Your Account Has Been Created!";
		 String actual = driver.getTitle();
		 Assert.assertEquals(actual, expected, "This value doesnot match");
		
	} catch (Exception e) {
		System.out.println(e);
	}
  }
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
