package kiteappPom_Basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	//. data members        // privet
	
	@FindBy(id = "userid")private  WebElement username;
	@FindBy(id = "password")  private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	
	 public KiteLoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	
	 // 3 methods            // element
	 
	 public void senusername()
	 {
		 username.sendKeys("ELR321");
	 }
	 public void sendpassword()
	 {
		 password.sendKeys("Dhana1111");
	 }
	 public void clickonloginButton()
	 {
		 loginButton.click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
