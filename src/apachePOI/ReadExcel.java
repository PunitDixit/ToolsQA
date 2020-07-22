package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
FileInputStream fis = new FileInputStream(new File("C:\\Users\\Sumit\\git\\ToolsQA\\src\\testData\\TC.xlsx"));
        
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	
    	XSSFSheet ws =  wb.getSheet("Sheet1");
    	
    	XSSFCell cell = ws.getRow(1).getCell(1);
    	
    	System.out.println(cell.getStringCellValue());
        
        wb.close();
        
		
		
	}

}
