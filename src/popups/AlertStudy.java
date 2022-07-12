package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertButton")).click();
		Alert s1 = driver.switchTo().alert();
		System.out.println(s1.getText());
		s1.accept();
		
		Thread.sleep(200);
		
	//	driver.findElement(By.id("confirmButton")).click();
	//	Alert s1 = driver.switchTo().alert();
	//	System.out.println(s1.getText());
		
	//	s1.accept();
	//	s1.dismiss();
		
		Thread.sleep(500);
		
		
        
        
	}

}
