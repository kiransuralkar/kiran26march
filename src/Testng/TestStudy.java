package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestStudy {
  @Test
  public void Kitlogin() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		System.out.println("hi this methad is printing statment ");
        Reporter.log("hi this methad is reporter output");
        Reporter.log("hi this methad is reporter output true",true);
        Thread.sleep(2000);
  }
    @Test
    public void Kitlogin1()
 {
	  
        System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
		+ "\\SeleniumTest");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com");











	  
	  
	  
  }
}
