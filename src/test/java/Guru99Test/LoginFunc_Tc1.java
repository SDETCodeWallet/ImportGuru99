package Guru99Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AppPages.DashBoard_Page;
import AppPages.home_Page;
import Genirc.Excelgenric;


public class LoginFunc_Tc1 extends home_Page {
	

	
@BeforeMethod
  public static void openApplication() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException{
	
	Genirc.Excelgenric.writeCodeToexcel("C:\\Users\\Deepak\\Desktop\\Excels\\Selenium1.xlsx",0,6,10, "my name isgdfgdfgdfgdfgdfg shhubham Goyal");
	
//	WebDriver driver=launchbrowser("ff","http://demo.guru99.com/V4/index.php");
//	home_Page Launchapp= PageFactory.initElements(driver, home_Page.class);
//	
//	DashBoard_Page dsh=LoginFunc_Tc1.Loginuser("mngr58268","Ehyveme");;
//	Thread.sleep(5000);
//	String titile=driver.getTitle();
//	String actualtitle="Guru99 Bank Manager HomePage";
//	verifyTitle(titile,actualtitle );
//	Thread.sleep(3000);
//	 dsh.checkLinks();
//	 Thread.sleep(3000);
//	 System.out.println(txtAlert());
	
}

//@Test
// public static void loginuser() throws InterruptedException{
//	 Loginuser();
//	 Thread.sleep(5000);
//	 String titile=driver.getTitle();
//	 System.out.println(titile);
//	 String actualtitle="Guru99 Bank Manager HomePage";
//	 verifyTitle(titile,actualtitle );
// 
// }


//}
// @Test
//public static void getuserdetails() throws InterruptedException{
//	 Genratecredentials("shubhamg@360logica.com");
 

@Test
public void tc2(){
       
}

//}
//@AfterMethod
//public static void closeApp(){
  
//	driver.quit();
//}
	
}
