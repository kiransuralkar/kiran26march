package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedUse {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
				WebDriver driver= new ChromeDriver();
				
			    driver.manage().window().maximize();
			    driver.get("https://vctcpune.com/selenium/practice.html");
			        
			    Thread.sleep(3000);
		        WebElement checkBox1=
		driver.findElement(By.name("checkBoxOption1"));
	// (checkBox1.click();
		
		 if(checkBox1.isEnabled()) 
		        {  
		        	
		          System.out.println("checkBox is already selected");	
		        }        
		  else
		       {  
			       checkBox1.click();
			       System.out.println("checkBox is now selected");  
		       }
		
		
		
	}

}
