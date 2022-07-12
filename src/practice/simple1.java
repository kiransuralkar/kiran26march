package practice;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 
		Thread.sleep(1000);
	//	WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
		
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
      //  UN.sendKeys("KIRAN");
         
        
      //  Thread.sleep(1000);
      //  UN.clear();
        
      //  Thread.sleep(1000);
      //  UN.sendKeys("neha");
        
        
        
        
        

	}

}
