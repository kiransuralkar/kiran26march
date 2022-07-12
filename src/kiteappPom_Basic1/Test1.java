package kiteappPom_Basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
        
		KiteLoginPage login=new KiteLoginPage(driver);
		login.senusername();
		login.sendpassword();
		login.clickonloginButton();

		Thread.sleep(2000);

		KitePinPage pin=new KitePinPage(driver);
		pin.sendPIN();
		pin.clickOncontinueButton();
		
		
		Thread.sleep(3000);
		
		kiteHomePage home=new kiteHomePage(driver);
		home.validateUserName();
		home.logout();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
