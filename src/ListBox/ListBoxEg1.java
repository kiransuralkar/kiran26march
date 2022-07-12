package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
        
		//1.identfy list box  to be  handled and store it in referece variable
		
		    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//2. creat an object of select class will accept WebElement as argument
		    Thread.sleep(3000);
		  WebElement day = driver.findElement(By.id("day"));
		  Select S1 = new Select(day);
		  S1.selectByIndex(28);
		   S1.selectByValue("29");
		   
		//3.By using of the select class methods we can select values from list  box like
		
		   
		
		
		
		
		 
	}

}
