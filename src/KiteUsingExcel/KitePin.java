package KiteUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePin {

	@FindBy(id = "pin")private  WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	
	public KitePin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendpin(String pin)
	
	{
		PIN.sendKeys(pin);
	}
	
	
	
	
	public  void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
