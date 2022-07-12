package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest\\chrome.exe");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\26March B bach\\scrinshot\\S2.png");
		
		FileHandler.copy(source,destination);
		
	}

}
