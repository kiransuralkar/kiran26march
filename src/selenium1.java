import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome driver", "C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		

	

	}

}
