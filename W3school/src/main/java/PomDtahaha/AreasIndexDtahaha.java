package PomDtahaha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AreasIndexDtahaha {

	@FindBy(xpath="//button[@id='btnAdd']")
	private WebElement add;
	
	@FindBy(xpath="//h5[text()='Add Area']")
	private WebElement text;
	
	@FindBy(xpath="//input[@id='Name_en']")
	private WebElement nameEn;
	
	@FindBy(xpath="//input[@id='Name_ar']")
	private WebElement nameAr;
	
	@FindBy(xpath="//select[@id='GovernorID']")
	private WebElement governor;
	
	@FindBy(xpath="//input[@checked='checked']")
	private WebElement enabletext;
	
	@FindBy(xpath="//button[text()='Add']")
	private WebElement addsub;

	private WebDriver driver;
	
	public AreasIndexDtahaha(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void clickAdd() {
		add.click();
	}
	
	public void gettext() {
		text.getText();
	}
	
	public void senkeyNameEn(String name) {
		nameEn.sendKeys(name);
	}
	
	public void sendkeyNameEr(String nameer) {
		nameAr.sendKeys(nameer);
	}
	
	public void clickgovernor() {
		Select s=new Select(governor);
		s.selectByValue("Hawalli Governorate");
	}
	
	public void getEnabletext() {
		enabletext.getText();
	}
	
	public void clickaAdsub() {
		addsub.click();
	}
	
	
	
}
