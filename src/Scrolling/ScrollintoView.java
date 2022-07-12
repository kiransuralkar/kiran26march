package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoView {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		WebElement Katraj = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		
		JavascriptExecutor e=(JavascriptExecutor)driver;
		e.executeScript("arguments[0].scrollIntoView(true)",Katraj);
		
		
		
		
		
		
		
		
		
		

	}

}
