package mics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofLinks {
             public static void main(String[] args) throws InterruptedException {
				
            	 System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
         				+ "\\SeleniumTest");
         		WebDriver driver= new ChromeDriver();
                 driver.manage().window().maximize();
         		driver.get("https://vctcpune.com/selenium/practice.html");
         		
         		Thread.sleep(2000);
        	             	 
            	 List<WebElement> link = driver.findElements(By.tagName("a"));
            	 System.out.println(link.size());
            	
            	Iterator<WebElement> it = link.iterator();
            	while(it.hasNext())
            	{
            		System.out.println(it.next().getText());
            	}
            	
            	
            	
            	
            	
            	
            	
            	
            	
            	
            	
            	
            	
            	
            	 
            	 
            	 
            	 
			}
}
