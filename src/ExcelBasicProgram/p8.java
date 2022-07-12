package ExcelBasicProgram;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class p8 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile = new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\26 march B.xlsx");
       
		Cell celllinfo = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0);
		
		CellType s1 = celllinfo.getCellType();
		
		if(s1==CellType.STRING)
		{
			String value = celllinfo.getStringCellValue();
			System.out.println(value);
		}
		
		else if (s1==CellType.NUMERIC)
		
		{
			double value = celllinfo.getNumericCellValue();
			System.out.println(value);
		}
		 else if(s1==CellType.BOOLEAN)
		 {
			 boolean value = celllinfo.getBooleanCellValue();
			 System.out.println(value);
		 }
		
		
		
		
		
		
		
	}

}
