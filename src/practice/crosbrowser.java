package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crosbrowser {
  @Parameters("browserName")
  @Test
  public void f(String name) {
	  
	  WebDriver driver =null;
	  
	  if(name.equals("firefox"))
	  {
	  System.setProperty("webdriver.gecko. driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest\\geckodriver.exe");
		 driver= new FirefoxDriver();
	  }
	  else if (name.equals("chrome")) 
		
	  {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		 driver= new ChromeDriver();
		
		
  }
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

  }
  
}
