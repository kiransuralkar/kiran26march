package CrosBrowserTesting;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestC {
  @Parameters("browserName") 
  @Test
  public void myMethad(String name) throws InterruptedException {
	  
	  WebDriver driver=null;
	  
	  if(name.equals("firefox"))
	  {	  
      System.setProperty("webdriver.gecko.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
		+ "\\SeleniumTest\\geckodriver.exe");
        driver= new FirefoxDriver();
        
	  }
	  else if(name.equals("chrome"))
	  {
		  
      System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
		+ "\\SeleniumTest\\chromedriver.exe");
      driver=new ChromeDriver();
      
     
	  }
      
      driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.close();
  }
}
