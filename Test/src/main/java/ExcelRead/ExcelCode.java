package ExcelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {


		static FileInputStream f;
		static XSSFWorkbook w;
		static XSSFSheet sh;

		public static String readStringData(int row, int col) throws IOException  {
			f = new FileInputStream("/Users/cvs/git/repo1/Test/src/main/resources/Book1.xlsx");
			w = new XSSFWorkbook(f);
			sh = w.getSheet("Sheet1");
			XSSFRow r = sh.getRow(row);
			XSSFCell c = r.getCell(col);
			return c.getStringCellValue();

		}

		public static String readIntegerData(int row, int col) throws IOException {
			f = new FileInputStream("/Users/cvs/git/repo1/Test/src/main/resources/Book1.xlsx");
			w = new XSSFWorkbook(f);
			sh = w.getSheet("Sheet1");
			XSSFRow r = sh.getRow(row);
			XSSFCell c = r.getCell(col);
			int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting
			return String.valueOf(val);   //convert int to string using valueOf() method
			//return val;
		
		}

	
}
