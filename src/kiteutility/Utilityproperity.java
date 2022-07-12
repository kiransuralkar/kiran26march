package kiteutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Utilityproperity  {

	public static void captureScreenshot(WebDriver driver ,String TCID) throws IOException {
		
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	 File dest=new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\26March B bach\\scrinshot\\s9"+TCID+".png");	
		FileHandler.copy(src, dest);
	
	}
	
	public static String  getDataFromproperityfile( String Key) throws IOException
	{
	  Properties prop=new Properties();
	  FileInputStream myfile=new FileInputStream("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\myproperties,properties");
		prop.load(myfile);
		String value = prop.getProperty(Key);
        return value;
    
		
		
		
	}	
}
