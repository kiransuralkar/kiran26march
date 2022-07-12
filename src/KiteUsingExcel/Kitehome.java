package KiteUsingExcel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehome {

	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logOutButton;
	
	
	
	public Kitehome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ValidateUserName(String expextedUserID )
	  {
		String expextedUserName=expextedUserID;
		String actualUserName=userName.getText();
		
		if(expextedUserName.equals(actualUserName))
			
	  {  
         System.out.println("Actual and Expexted User id are maching Tc is pass");
			
	  }	
		else {
			
			System.out.println("Actual and Expexted User id are not maching Tc is failed");
			
	  } 
	  }
	
		public void logOut() throws InterruptedException
	 {
		
		userName.click();
		Thread.sleep(200);
		logOutButton.click();
		
			
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	 }	
}
