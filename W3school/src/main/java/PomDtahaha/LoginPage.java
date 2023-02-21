package PomDtahaha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath="//input[@id='Username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login;

	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void sendkeyusrname(String user ) {
		username.sendKeys(user);
	}
	
	public void sendkeypassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clicklogin() {
		login.click();
	}
}
