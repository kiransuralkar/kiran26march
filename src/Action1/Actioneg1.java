package Action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actioneg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(1000);
		
		WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		
	//	seleniumButton.click();
		Actions act=new Actions(driver);
		
	//	act.moveToElement(seleniumButton).perform();
	//	act.click().perform();
				
	//	act.moveToElement(seleniumButton).click().build().perform();
	//	act.click(seleniumButton).perform();
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
	//	act.moveToElement(rightclickbutton).contextClick().build().perform();
	//	act.click(rightclickbutton).perform();
		
		WebElement doubleclickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
		act.moveToElement(doubleclickButton).doubleClick().build().perform();
		act.doubleClick(doubleclickButton).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
