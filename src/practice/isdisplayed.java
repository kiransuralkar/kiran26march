package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

	
		boolean result = driver.findElement(By.xpath("//input[@value='Radio1']")).isSelected();
		
		System.out.println(result);
		
	    if(result==true)
		
	    {
	    	System.out.println("Element found");
	    }
	    else
	    {
	    	System.out.println("Element not found");
	    }
		
		
		
		
		
		
	}
	

}
