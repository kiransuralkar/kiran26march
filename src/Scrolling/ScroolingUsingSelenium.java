package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolingUsingSelenium {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		JavascriptExecutor e=(JavascriptExecutor)driver;
		e.executeScript("window.scrollBy(90,800)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
