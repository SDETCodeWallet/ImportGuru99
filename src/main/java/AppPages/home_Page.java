package AppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genirc.Web_util_methods;

public class home_Page extends Web_util_methods   {

	@FindBy(xpath="//input[@name='uid' and @type='text']")
	 static WebElement username;
	@FindBy(xpath="//input[@name='password' and @type ='password']")
	 static WebElement Password;
	@FindBy(xpath="//input[@name='btnLogin' and @type ='submit']")
	 static WebElement LgnBtn;
	@FindBy(xpath="//input[@name='btnReset' and @type ='reset']")
	 static WebElement resetbtn;
	@FindBy(xpath="//a[@href='http://demo.guru99.com/']")
	 static WebElement createuser;
	@FindBy(xpath="//input[@name='emailid' and @type ='text']")
	 static WebElement Emailforcreate;
    @FindBy(xpath="//input[@name='btnLogin' and @type ='submit']")
	 static WebElement submit;
	@FindBy(xpath="//tr//td[2]")
	 static WebElement getusername;
	@FindBy(xpath="html/body/table/tbody/tr[5]/td[2]")
	 static WebElement getpassword;
	
	
public static DashBoard_Page Loginuser(String usrname,String userpassword) {
     inputValue(username, usrname);
     inputValue(Password, userpassword);
     clickOnElement(LgnBtn);
     DashBoard_Page dshboradpage=PageFactory.initElements(driver, DashBoard_Page.class);
     return dshboradpage;
    
    }
  
public static void resetfilleds(){
    	clickOnElement(resetbtn);
    }

    
    
public static void Genratecredentials(String emailid) throws InterruptedException{
    	clickOnElement(createuser);
    	Thread.sleep(3000);
    	inputValue(Emailforcreate, emailid);
    	clickOnElement(submit);
    	Thread.sleep(5000);
    	getText(getusername);
    	getText(getpassword);
    	
    	
    }


  }
