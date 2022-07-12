import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
        driver.findElement(By.xpath("//label[@for='radio1']")).click();
       driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("kiran");
		
		
		
		
		
		
		
}
}