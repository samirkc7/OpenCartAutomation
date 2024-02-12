package base;

import org.openqa.selenium.By;

public class Locators {
	
	public static final By addToCartMacBook = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/form/div/button[1]/i");
	public static final By addToCartIphone = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/form/div/button[1]");
	public static final By txtSearch = By.name("search");
	public static final By btnSearch = By.xpath("//*[@id=\"search\"]/button");
	public static final By addToCartNikon = By.xpath("//*[@id=\"product-list\"]/div/div/div[2]/form/div/button[1]");
	public static final By myAccount = By.linkText("My Account");
	public static final By navLogin = By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/ul/li[2]/a");
	public static final By navRegister = By.xpath("//*[@id='top']/div/div[2]/ul/li[2]/div/ul/li[1]/a");
	public static final By txtEmail = By.name("email");
	public static final By txtPassword = By.name("password");
	public static final By btnLogin = By.xpath("//*[@id=\"form-login\"]/div[3]/button");
	public static final By firstNameInput = By.name("firstname");
	public static final By lastNameInput = By.name("lastname");
	public static final By agreeCheckBox = By.name("agree");
	public static final By btnRegister = By.xpath("//*[@id='form-register']/div/button");
	
}
