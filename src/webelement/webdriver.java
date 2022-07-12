package webelement;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) {
       System.getProperty("webdriver.chromedriver","C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.close();
        driver.quit();
        
        driver.navigate().to("https://paytm.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
	}  
         
}	


