package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledUse 
{

public static void main(String[] args) throws InterruptedException{

	System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
			+ "\\SeleniumTest");
			WebDriver driver= new ChromeDriver();
			
		    driver.manage().window().maximize();
		    driver.get("https://www.discoveryplus.in/");
		    Thread.sleep(3000);
	driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
        Thread.sleep(5000);
        	 WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
             
        System.out.println(getOTPButton.isEnabled());
        
        driver.findElement(By.id("mobileNumber")).sendKeys("7972020493");
        Thread.sleep(2000);
        System.out.println(getOTPButton.isEnabled());
        getOTPButton.click();
        
        
        
        
        
        
	}

}
