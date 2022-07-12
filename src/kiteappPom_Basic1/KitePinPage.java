package kiteappPom_Basic1;

import java.sql.Driver;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webelement.webdriver;

public class KitePinPage {

// 1 data member
	
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;

	//2	 constructor
	
	public KitePinPage (WebDriver driver )
	{
		
		
		PageFactory.initElements(driver,this);
	}	
		
	// 3 mathod	
		
	public void sendPIN()
	{
		PIN.sendKeys("982278");
	}
	
	public void clickOncontinueButton()
	{
		continueButton.click();
	}
		
		
		
		
		
	}


