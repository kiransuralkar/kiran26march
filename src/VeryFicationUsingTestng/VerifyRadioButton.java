package VeryFicationUsingTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyRadioButton {
  @Test
  public void MyMethod() 
  {

	  System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
     WebElement radioButton = driver.findElement(By.xpath("//input[@value='Radio1']"));
	
  //   Assert.assertTrue(radioButton.isSelected(), "Radio button is  not selected test case failed");
		
     Assert.assertFalse(radioButton.isSelected(), "radio button is  selectes test case pass");
     
     
     
     
     
     
     
  }
}
