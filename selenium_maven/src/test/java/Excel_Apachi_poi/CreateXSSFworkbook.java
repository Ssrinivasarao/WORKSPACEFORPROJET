package Excel_Apachi_poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class CreateXSSFworkbook {
	
  @Test(enabled = false)
  public void f() throws Exception {
	  Workbook wb = new HSSFWorkbook();
	  FileOutputStream fo = new FileOutputStream("E:\\WORKSPACEFORPROJET\\selenium_maven\\test\\1.xls");
	  wb.write(fo);
	  fo.close();
 } 
  @Test
  public void f1() throws Exception{
	  Workbook wb = new HSSFWorkbook();
	  FileOutputStream fo = new FileOutputStream("E:\\\\WORKSPACEFORPROJET\\\\selenium_maven\\\\test\\\\2.xlsx");
	  wb.write(fo);
	  fo.close();
  }
}
