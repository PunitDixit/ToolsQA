package Chrome_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoiExcelRead {

	public static void main(String[] args) throws IOException {
		
		File src = new File("D:\\ToolsQA1\\ToolsQA\\Sample.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		          XSSFSheet sheet =      wb.getSheetAt(0);
		          
		          System.out.println(sheet.getLastRowNum());
		          
		          System.out.println(sheet.getSheetName());
		          
		      Cell cell =    sheet.getRow(1).getCell(1);
		          System.out.println(cell.getStringCellValue());
		          
		          cell.setCellValue(29);
		          
		          FileOutputStream fos = new FileOutputStream(src);
		          wb.write(fos);
		          
		          
		          
		          
		        		  
		          
		          
		          
		        
		
		          wb.close();
	}

}
