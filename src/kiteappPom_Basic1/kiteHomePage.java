package kiteappPom_Basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage {

	//.1 
	
	@FindBy(xpath = "//span[@class='user-id']")private  WebElement userName;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logOutButton;
	
	
	//.2
	
	public kiteHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//.3
	
	public void validateUserName()
	{
		String expextedUserName="ELR321";
		String 	actualUserName=userName.getText();
		
		if(expextedUserName.equals(actualUserName))
	{
		System.out.println("actual and expexted user id pass");	
			
	}
	    
	    else {
				
			System.out.println("actual and expexted user id fail");
	        
	         }
			
	}	
			
			public void logout() throws InterruptedException
			
			{
				userName.click();
				Thread.sleep(300);
				logOutButton.click();
				
			}
			
			
			
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
