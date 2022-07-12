package zerodaKite_Using_Excel_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {


	// 1.data members
	@FindBy (id = "userid") private WebElement userName;
	@FindBy (id = "password") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginButton;
	
	
	//2. constructor
	public KiteLoginPage1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	//3. methods
	public void sendUserName(String UN)
	{
	userName.sendKeys(UN);
	}
	public void sendPassword(String PWD)
	{
	password.sendKeys(PWD); }
	public void clickOnLoginButton()
	{
	loginButton.click();
	}
}
