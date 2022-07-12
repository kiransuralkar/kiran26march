package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeTexUse {

	private static Object element;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
					+ "\\SeleniumTest");
			WebDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://vctcpune.com/selenium/practice.html");
	        Thread.sleep(1000);
      //1
	     System.out.println(driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText());
	   
	  
	}

}
