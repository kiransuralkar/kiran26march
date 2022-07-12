package ExcelBasicProgram;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile= new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\26 march B.xlsx");
		
	int name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getLastCellNum();
		
		System.out.println(name);
		
		
		
		
	}

}
