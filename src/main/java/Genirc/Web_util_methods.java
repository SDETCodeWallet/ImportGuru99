package Genirc;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import AppPages.home_Page;

public class Web_util_methods {
	
	public static WebDriver driver=null;
	
	
	 public static WebDriver launchbrowser(String Browsername,String browsername){
			
			if(Browsername.equalsIgnoreCase("ff")){
			    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\workspace\\Training_PoaDevEnv\\Software\\geckodriver.exe");
			    driver=new FirefoxDriver();
			}else if(Browsername.equalsIgnoreCase("ch")){
				System.setProperty("", "");
				driver=new ChromeDriver();
			
			}
			driver.get(browsername);
			return driver;    
			      
		}
	 /*For opening the application by using separate method 
	   public static home_Page myApplication(String  url){
			driver.get(url);
			home_Page Mainpage=PageFactory.initElements(driver, home_Page.class);
	        return Mainpage;
	 }*/
	 public static void clickOnWebelement(WebElement we){
		 we.click();		 
	    }
	 public static void inputValue(WebElement inputelement,String userinput){
		 inputelement.sendKeys(userinput);
	    }
	 public static void inputnumericvalue(WebElement inputelement,int userinput){
		String stringvalue= Integer.toString(userinput);
		 inputelement.sendKeys(stringvalue);
	    }
	 
     public static void clickOnElement(WebElement ClickBtn){
 		 ClickBtn.click();
	   }
	 public static void clearCookies(WebDriver driver) throws InterruptedException{
			driver.manage().deleteAllCookies();
			Thread.sleep(5000);
		}
	 public static void verifyTitle(String actual,String expectedtitle){
		 Assert.assertEquals(actual, expectedtitle);
	 }
	 public static void getText(WebElement we){
		String text=we.getText();
		System.out.println(text);
	}
	 
	 public  static  void checkAllLinks(List<WebElement> alllinkscollection){
		
		int totallinks=alllinkscollection.size();
		System.out.println(totallinks);
		
		for(int i=0;i<=totallinks-1;i++){
			WebElement perlink=alllinkscollection.get(i);
			String linkname=perlink.getText();
			System.out.println(linkname);
		    perlink.click();
		    int totallinks1=alllinkscollection.size();
		    
		}
	 }
		
		public static void clickonradiobutton(WebElement we){
			boolean value=we.isEnabled();
			if(value==true){
			we.click();
			}
		}
		
		public static void tkeScrnshot(String savefileloc){
			File sht= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File path=new File(savefileloc+".png");
			try{
				FileUtils.copyFile(sht, path);
			}catch (IOException e){
				System.out.println(e);
			}
		}
		
		public static String txtAlert(){
			Alert txt=driver.switchTo().alert();
			String txtvalue=txt.getText();
		    return txtvalue;
		}
		
		public static void acceptAlert(){
			Alert actlrt=driver.switchTo().alert();
			actlrt.accept();
		}
	  
		public static void dsmssAlert(){
			Alert dsmmss=driver.switchTo().alert();
		   dsmmss.dismiss();
		}
   
		public static void alertInput(String inputvalue){
			Alert input=driver.switchTo().alert();
		    input.sendKeys(inputvalue);
		}
		
		public static void explictWait(int timedur,By locator) throws InterruptedException{
		    WebDriverWait wait=new WebDriverWait(driver, timedur);
		    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			
		}
		public static void switchFrameId(int i){
			driver.switchTo().frame(i);
		}
		public static void switchFrameString(String St1){
			driver.switchTo().frame(St1);
		}
		public static void switchFrameString(WebElement we){
			driver.switchTo().frame(we);
		}
	
}

	
	
	

