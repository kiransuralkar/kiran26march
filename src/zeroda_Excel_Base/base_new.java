package zeroda_Excel_Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class base_new {
	  protected WebDriver driver;
	
	public void openBrowser()
	{
	System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	opt.addArguments("incognito");
	driver= new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("Launching browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	}
}
