package serialExucation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myclass1 {
  @Test
  public void mymethad() {
	  

	  System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
			  

	  
	  
	  
  }
}
