package PomDtahaha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndeaxDtahaha {

	@FindBy(xpath="//span[text()='Settings']")
	private WebElement setting;
	
	@FindBy(xpath="//a[text()='Areas']")
	private WebElement areas;
	
	private WebDriver driver;
	
	public IndeaxDtahaha(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void clickSetting() {
		setting.click();
	}
	
	public void clickAreas() {
		areas.click();
	}
	
	
}








//span[text()='Settings']
//a[text()='Areas']
//button[@id='btnAdd']