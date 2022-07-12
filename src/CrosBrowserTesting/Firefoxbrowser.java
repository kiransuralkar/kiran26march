package CrosBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefoxbrowser {
  @Test
  public void myMethad() 
  {

      System.setProperty("webdriver.gecko.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
		+ "\\SeleniumTest\\geckodriver.exe");
      WebDriver driver= new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");

  }
}
