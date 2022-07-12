package Action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
	
		WebElement destination = driver.findElement(By.id("amt8"));
		 
		Actions act=new Actions(driver);
		 
	//	act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
	//	act.build().perform();
		
		act.dragAndDrop(source, destination).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
