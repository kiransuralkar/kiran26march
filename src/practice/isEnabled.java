package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		  boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();

		  System.out.println(result);
		  
		 if(result==true)
			 
		 {
			 System.out.println("Element is Enable");
		 }	 
		 else
		 {
			 System.out.println("Element is disable");
		 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	}

}
