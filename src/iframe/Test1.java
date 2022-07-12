package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		Thread.sleep(1000);
	
		String S = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
		System.out.println(S);

		driver.switchTo().frame("Frame1");
		
		String S1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		 System.out.println(S1);
		
	     driver.switchTo().parentFrame();
		
	    String S2 = driver.findElement(By.linkText("Pavilion")).getText();
		System.out.println(S2);
	
		driver.switchTo().frame("Frame2");
		
		String S3 = driver.findElement(By.linkText("Category3")).getText();
		System.out.println(S3);
		
		driver.switchTo().defaultContent();
		
		String S4 = driver.findElement(By.linkText("Blogger")).getText();
	    System.out.println(S4);
		
		System.out.println("this is my first comment");
		
		
		
		
		
		
		
		
		
	}

}
