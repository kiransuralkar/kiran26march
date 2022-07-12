package screenshot;

import java.io.File;
import java.io.IOException;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class s1 {



		

		public static void main1(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
					+ "\\SeleniumTest");
			WebDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/");
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\26March B bach\\scrinshot\\s1.png");

			FileHandler.copy(src, destination);
	}

}
