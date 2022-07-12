package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
		
		WebElement MultiSelectable = driver.findElement(By.name("cars"));
        Select s1=new Select(MultiSelectable);
        System.out.println("MultiSelectable stetus "+s1.isMultiple());
         Thread.sleep(200);
         s1.selectByValue("volvo");
        Thread.sleep(200);
        s1.selectByVisibleText("Saab");
           Thread.sleep(200);
         s1.selectByIndex(2) ;
            Thread.sleep(200);
         s1.selectByIndex(3);
            
        s1.deselectAll();
           Thread.sleep(200);
        s1.deselectByIndex(3);
            Thread.sleep(200);
         s1.deselectByIndex(2);
          Thread.sleep(200);
        s1.deselectByValue("saab");
        
         System.out.println(s1.getFirstSelectedOption().getText());
         s1.getAllSelectedOptions();
         
         
         
	}

}
