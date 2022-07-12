package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
        
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kiran suralkar");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9175995629");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
