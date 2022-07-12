package ExcelBasicProgram;


import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class p1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{  
		 
   File	myfile=new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\Velocity.xlsx");
		
	    String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();	
   
   System.out.println(value);
   
   
   
   
   
   
   
   
   
   
	}
}
