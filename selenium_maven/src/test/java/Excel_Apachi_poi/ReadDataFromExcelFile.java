package Excel_Apachi_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadDataFromExcelFile {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow row;
	public XSSFCell cell;
	
  @Test
  public void ReadDataFromExcelFile() throws Exception {
	  fi = new FileInputStream("E:\\WORKSPACEFORPROJET\\selenium_maven\\test\\login.xlsx");
	  w = new XSSFWorkbook(fi);
	  s = w.getSheet("Sheet1");
	  row = s.getRow(2);
	  cell = row.getCell(1);
	  System.out.println(cell.getStringCellValue());
	 w.close();
  }
}
