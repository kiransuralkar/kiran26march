package ExcelBasicProgram;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class p5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile = new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\26 march B.xlsx");
		
	    int colsize = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getLastCellNum();
	
	System.out.println(colsize);
	

		
		
		
		
		
	}

}
