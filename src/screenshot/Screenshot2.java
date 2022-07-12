package screenshot;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String TCID = RandomString.make(4);
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		 File dest=new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\26March B bach\\scrinshot\\s9"+TCID+".png");	
			FileHandler.copy(src, dest);
		
		
	}

}
