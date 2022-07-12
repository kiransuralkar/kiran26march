package KiteUsingExcel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin {

	@FindBy(id = "userid")private WebElement userName;
	@FindBy(id = "password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	
	
	
	public  kitelogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void senduserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	
	public void sendPassword(String passWord)
	{
		password.sendKeys(passWord);
	}
	public void clickOnLoginButton()
	
	{
		loginButton.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
