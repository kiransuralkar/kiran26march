package ExcelBasicProgram;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class p7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile = new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\26 march B.xlsx");
		
	    Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet2");
	    
	    	int lastindex = sh.getLastRowNum();
	    	
	    	for(int i=0; i<=lastindex; i++)
	    	{
	    		String info = sh.getRow(i).getCell(1).getStringCellValue();
	    		System.out.println(info);
	    	}
	
	

		
		
		
		
		
	}

}
