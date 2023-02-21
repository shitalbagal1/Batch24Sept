package testpac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomModules.W3schoolOnlineTutorial;

public class VerifyW3schoolOnlineTutorial {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		W3schoolOnlineTutorial w3schoolonlinetutorial= new W3schoolOnlineTutorial(driver);
		w3schoolonlinetutorial.clicktutorials();
		w3schoolonlinetutorial.clickExercise();
		w3schoolonlinetutorial.clickreferences();
		
		
		
		
		
		
	}

}
