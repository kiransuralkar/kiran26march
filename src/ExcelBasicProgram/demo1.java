package ExcelBasicProgram;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
 
	File myfile = new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\26 march B.xlsx");
	
  Workbook book =  WorkbookFactory.create(myfile);  
  
  Sheet sh = book.getSheet("Sheet1");
  
 Row rw = sh.getRow(0);
  
  Cell col = rw.getCell(0);

	String value = col.getStringCellValue();
	
	System.out.println();
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		

	
	
	}

}
