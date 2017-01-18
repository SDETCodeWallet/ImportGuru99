package Guru99Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AppPages.DashBoard_Page;
import AppPages.home_Page;

public class NewCustomer extends home_Page{

	@BeforeMethod
	public  void TC2() throws InterruptedException{
		WebDriver driver=launchbrowser("ff","http://demo.guru99.com/V4/index.php");
		home_Page Launchapp= PageFactory.initElements(driver, home_Page.class);
		
	}

	@Test
	public static void newcustomer() throws InterruptedException{

		DashBoard_Page dsh=LoginFunc_Tc1.Loginuser("mngr58268","Ehyveme");;
		Thread.sleep(5000);
		String titile=driver.getTitle();
		String actualtitle="Guru99 Bank Manager HomePage";
		verifyTitle(titile,actualtitle );
		
		AppPages.NewCustomer customer=dsh.NewCustomer();
		Thread.sleep(3000);
		customer.createnewuser("scriptusername", "07/06/1992", "saksoft pvtltd", "gatuambhudhnagar", "uttarpradesh", 201305, "4654655464", "deepaksa@360logica.com", "deepaksa360");
		tkeScrnshot("C:\\Users\\Deepak\\Desktop\\Jmeter steps\\seleniumscrnshot1");
	}
	
	
	@AfterMethod
	public static void closeapp(){
		driver.close();
	}
	

}
