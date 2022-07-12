package Webtable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teble {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome driver", "C:\\Urs\\91983\\eclipse-workspace\\kirran"
				+ "\\SeleniumTest");
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		int totalrow = row.size();
        System.out.println(totalrow);
        
        
        List<WebElement> cell = driver.findElements(By.xpath("//table//tr[1]//th"));
        int totalcell = cell.size();
        System.out.println(totalcell);
        
        
        List<WebElement> read = driver.findElements(By.xpath("//table//tr"));
        Iterator<WebElement> it = read.iterator();
        while(it.hasNext()) 
        {
          System.out.println(it.next().getText()+" ");
          System.out.println();
          
        }
        
        
        
        
        
        
	}

}
