package ListnerMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utilityclass {

	public static String  getDataFromproperityfile( String Key) throws IOException
	{
	  Properties prop=new Properties();
	  FileInputStream myfile=new FileInputStream("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\myproperties,properties");
		prop.load(myfile);
		String value = prop.getProperty(Key);
        return value;
	}
}
