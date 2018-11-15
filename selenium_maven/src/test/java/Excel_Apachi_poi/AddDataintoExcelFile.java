package Excel_Apachi_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class AddDataintoExcelFile {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow row;
	public XSSFCell cell;
	
  @Test
  public void f() throws Exception {
	 fi = new FileInputStream("E:\\WORKSPACEFORPROJET\\selenium_maven\\test\\login.xlsx");
	 w = new XSSFWorkbook(fi);
	 s = w.getSheet("Sheet1");
	 row=null;
	 cell=null;
	 int column = -1;
	 row = s.getRow(0);
	 for(int i=0;i<row.getLastCellNum();i++) {
		 System.out.println(row.getCell(i).getStringCellValue());
		 if(row.getCell(i).getStringCellValue().equalsIgnoreCase("PASSWORD")) {
			 column=i;
			 
		 }
	 }
	 row=s.getRow(1);
	 if(row==null)
		 row=s.createRow(1);
	 cell=row.getCell(column);
	 if(cell==null)
		 cell=row.createCell(column);
	 cell.setCellValue("Blocked");
	 fo=new FileOutputStream("E:\\WORKSPACEFORPROJET\\selenium_maven\\test\\login.xlsx");
	 w.write(fo);
	 fo.close();	 
  }
  
}
