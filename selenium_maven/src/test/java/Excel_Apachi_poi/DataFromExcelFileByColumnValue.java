package Excel_Apachi_poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataFromExcelFileByColumnValue {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow row;
	public XSSFCell cell;
	
	
  @Test
  public void f()throws Exception {
	  fi=new FileInputStream("E:\\WORKSPACEFORPROJET\\selenium_maven\\test\\login.xlsx");
	  w=new XSSFWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  row=s.getRow(0);
	  cell=null;
	  int column=-1;
	  for(int i=0;i<row.getLastCellNum();i++)
	  {
	     System.out.println(row.getCell(i).getStringCellValue());
	     if(row.getCell(i).getStringCellValue().equalsIgnoreCase("PASSWORD"))
	     {
	    	 column=i;
	    	 System.out.println(column);
	     }
  }
	  row=s.getRow(3);
	  cell=row.getCell(column);
	  String pwd = cell.getStringCellValue();
	  System.out.println("value in excel cell is:"+pwd);
}
  
  
}

