package zeroda_Utility_Excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_new {

	//excel
	//screenshot
	//closing
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{

		File myfile=new File("C:\\Users\\91983\\eclipse-workspace\\kirran\\SeleniumTest\\Velocity.xlsx");
		 Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");	
	     String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}