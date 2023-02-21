package PomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3schoolOnlineTutorial {
	
	@FindBy(xpath="//a[text()='Tutorials '][1]")
	private WebElement tutorials;
	
	@FindBy(xpath="//a[text()='References '][1]")
	private WebElement reference;
	

	@FindBy(xpath="//a[text()='Exercises '][1]")
	private WebElement exercises;
	
	@FindBy (xpath="//input[@id='search2']")
    private WebElement serch;
	
	// Constructor
	
	public W3schoolOnlineTutorial(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// Methods
	public void clicktutorials() {
		tutorials.click();
	}
	
	public void clickreferences() {
		reference.click();
	}
	
	public void clickExercise() {
		exercises.click();	
	}
	

}
