package Excel_Apachi_poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_API {
	public FileInputStream fis=null;
	public FileOutputStream fos=null;
	public XSSFWorkbook workbook=null;
	public XSSFSheet sheet=null;
	public XSSFRow row=null;
	public XSSFCell cell=null;
	String filepath;
	
	public Excel_API(String file) throws Exception{
		this.filepath = file;
		fis = new FileInputStream(filepath);
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}
	// Reading cell data from Excel by using Column Number
	

	public String getcelldata(String sheetname,int column,int rownum) {
		
		try { sheet = workbook.getSheet(sheetname);
		      row = sheet.getRow(rownum);
		      cell = row.getCell(column);
 		      
		 if(cell.getCellTypeEnum()==CellType.STRING) {
			 return cell.getStringCellValue();
		 }
		 else if(cell.getCellTypeEnum()==CellType.NUMERIC|| 
				 
				cell.getCellTypeEnum()==CellType.FORMULA) {
			 String cellvalue = String.valueOf(cell.getNumericCellValue());
			 return cellvalue;
		 }
		 else if (cell.getCellTypeEnum()==CellType.BLANK) {
			 return " ";
			 
		 }else
			 return String.valueOf(cell.getBooleanCellValue());
		}catch (Exception e) {
			e.printStackTrace();
			return "No Matching Value";
		}
	}
	//Reading Cell Data from the Excel File by using Column Name
	public String getcelldata(String sheetname,String colName,int rowNum){
		try {
			int colnum = -1;
			sheet = workbook.getSheet(sheetname);
			row = sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().equals(colName)) {
					colnum = i;
				
				}
			}
			row = sheet.getRow(rowNum);
			cell = row.getCell(colnum);
			if(cell.getCellTypeEnum()==CellType.STRING) {
				return cell.getStringCellValue();
				
			}else if(cell.getCellTypeEnum()==CellType.NUMERIC || 
					cell.getCellTypeEnum()==CellType.FORMULA) {
				String cellvalue = String.valueOf(cell.getNumericCellValue());
				return cellvalue;
			}else if(cell.getCellTypeEnum()==CellType.BLANK) {
				return "  ";
			}else
				return String.valueOf(cell.getBooleanCellValue());
		}catch (Exception e) {
			e.printStackTrace();
			return "No Matching Value";
		}
		
	}
	// Writing Cell Data into Excel file by using ColNum
	public boolean setcelldata(String sheetname,int colNum,int rowNum,String value)throws Exception{
		
		try {
			sheet = workbook.getSheet(sheetname);
			row = sheet.getRow(rowNum);
			if(row==null)
				row = sheet.createRow(rowNum);
			cell = row.getCell(colNum);
			if(cell==null)
			cell = row.createCell(colNum);
			cell.setCellValue(value);
			fos = new FileOutputStream("E:\\WORKSPACEFORPROJET\\selenium_maven\\test\\login.xlsx");
			workbook.write(fos);
			fos.close();
				
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	// Writing Cell Data to Excel file by using colName
	public  boolean setcelldata(String sheetname,String colname,int rownum,String value)throws Exception{
		try {
			int colNum = -1;
			sheet = workbook.getSheet(sheetname);
			row = sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().equals(colname)) {
					colNum=i;
				}
			}
			row = sheet.getRow(rownum);
			if(row==null)
				row = sheet.createRow(rownum);
			cell = row.getCell(colNum);
			if(cell==null)
				cell = row.createCell(colNum);
			cell.setCellValue(value);
			fos = new FileOutputStream("E:\\WORKSPACEFORPROJET\\selenium_maven\\test\\login.xlsx");
			workbook.write(fos);
			fos.close();
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	// Identify the No.of Rows and No.of Columns
	public int getrows(String sheetname) {
		sheet = workbook.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum()+1;
		return rowcount;
	}
	public int getColumns(String sheetName) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);
		int columnCount = row.getLastCellNum();
		return columnCount;
	}
}


