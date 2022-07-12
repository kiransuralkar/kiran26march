package mics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
        
   	 System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(200);
		
		  driver.findElement(By.name("btnK")).click();
		Thread.sleep(200);
		
		driver.findElement(By.linkText("Images")).click();
		List<WebElement> images = driver.findElements(By.tagName("Images"));
		
		System.out.println(images.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
