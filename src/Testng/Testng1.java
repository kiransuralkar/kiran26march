package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng1 {
  @Test
  public void Login() throws InterruptedException {
	  
      System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
		+ "\\SeleniumTest");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      System.out.println("hi this mathad is printing statment");
      Reporter.log("hi this mathad is reporter output");
      Reporter.log("hi this mathad is reporter output true",true);
      Thread.sleep(2000);
	  
      }
    	  @Test
    	  public void login1()
      {
	  
    		  
    	      System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
    			+ "\\SeleniumTest");
    	      WebDriver driver= new ChromeDriver();
    	      driver.manage().window().maximize();
    	      driver.get("https://www.instagram.com/accounts/login/");
	  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
	  
	  
  }
}
