package Genirc;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

public class Excelgenric {

	public static void readExcel(){
		File path=new File("");
	try{
	FileInputStream input=new FileInputStream(path);
    HSSFWorkbook book =new HSSFWorkbook(input); 
    Sheet sh=book.getSheetAt(1);
    String cellvalue=sh.getRow(1).getCell(2).getStringCellValue();
	
	
	}catch (Exception IO){
		System.out.println("Message:" +IO );
	}
	
	
	}
	
}
