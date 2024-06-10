package utils;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public void ReadingExcel() throws Exception {
		File src = new File("C:\\Users\\272242\\OneDrive\\Desktop\\Selenium Testing\\demo\\src\\main\\resources\\Excel\\Test Data.xlsx");
		
		FileInputStream wbook = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(wbook);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		String id = sheet.getRow(1).getCell(0).getStringCellValue();
		String paswrd = sheet.getRow(1).getCell(1).getStringCellValue();
		
	}
}
