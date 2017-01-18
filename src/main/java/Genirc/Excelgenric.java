package Genirc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelgenric {
	
	public static String cellvalue;

	public static String readExcel(String path,int sheet,int row,int column) throws IOException{
		File loc=new File(path);
		
		String[] values=path.split("\\.");
		String type0=values[0];
		String type1=values[1];
		
		
		if(type1.equalsIgnoreCase("xlsx")){
			
			try {
				System.out.println("dfsdfsdfsdfasdrwerwe");
				FileInputStream input=new FileInputStream(path);
			    XSSFWorkbook book=new XSSFWorkbook(input);
			    Sheet sh=book.getSheetAt(sheet);
			   cellvalue=sh.getRow(row).getCell(column).getStringCellValue();
			   
		}catch(Exception IO){
			System.out.println("Exception message"+IO);
		}
		}else if(type1.equalsIgnoreCase("xlx")){
			try {
				FileInputStream input=new FileInputStream(path);
				HSSFWorkbook book=new HSSFWorkbook(input);
				Sheet sh=book.getSheetAt(sheet);
			    cellvalue=sh.getRow(row).getCell(column).getStringCellValue();
			    
			}catch(Exception IO){
				System.out.println("Exception message"+IO);
			}
		}
		return cellvalue;
   
	
	
	}
	
}
