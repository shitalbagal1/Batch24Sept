package testdtapac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomDtahaha.LoginPage;

public class VerifyLoginPage {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("http://dthahab.com/Dashboard/Home");
     
     LoginPage loginpage=new LoginPage(driver);
     loginpage.sendkeyusrname("VELOCITYAUTO");
     loginpage.sendkeypassword("VELOCITYAUTO");
     loginpage.clicklogin();
     
	}

}
