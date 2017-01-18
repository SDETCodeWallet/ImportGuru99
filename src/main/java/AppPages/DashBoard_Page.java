package AppPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Genirc.Web_util_methods;

public class DashBoard_Page extends Web_util_methods{
	
	
	@FindBys({ @FindBy(xpath = "//ul[@class='menusubnav']//a") })
	private static List<WebElement> elementList;
	
	
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Manager']")
	private static  WebElement username;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='New Customer']")
	private static WebElement Newcustomer;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Edit Customer']")
	private static WebElement EditCustomer;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Delete Customer']")
	private static WebElement DeleteCustomer;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='New Account']")
	private static WebElement NewAccount;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Edit Account']")
	private static WebElement EditAccount;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Delete Account']")
	private static WebElement DeleteAccount;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Deposit']")
	private static WebElement Deposit;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Withdrawal']")
	private static WebElement Withdrawal;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Fund Transfer']")
	private static WebElement FundTransfer;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Change Password']")
	private static WebElement ChangePassword;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Balance Enquiry']")
	private static WebElement BalanceEnquiry;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Mini Statement']")
	private static WebElement MiniStatement;
	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Customised Statement']")
	private static WebElement CustomisedStatement;
	
	
   public static manager navigateToManager(){
		clickOnElement(username);
		manager mainpage=PageFactory.initElements(driver, manager.class);
		return mainpage;
	}
	
   public static NewCustomer NewCustomer() throws InterruptedException{
		Thread.sleep(2000);
	   clickOnElement(Newcustomer);
		NewCustomer mainpage=PageFactory.initElements(driver, NewCustomer.class);
		return mainpage;
	}
	
   public static EditCustomer editCustomer(){
		clickOnElement(EditCustomer);
		EditCustomer mainpage=PageFactory.initElements(driver, EditCustomer.class);
		return mainpage;
	}
   public static DeleteCustomer deleteCustomer(){
	   clickOnElement(DeleteCustomer);
	   DeleteCustomer mainpage=PageFactory.initElements(driver, DeleteCustomer.class);
	   return mainpage;
	}
   public static NewAccount Newaccount(){
	   clickOnElement(NewAccount);
	   NewAccount mainpage=PageFactory.initElements(driver, NewAccount.class);
	   return mainpage;
	}
   public static EditAccount editAccount(){
	   clickOnElement(EditAccount);
	   EditAccount mainpage=PageFactory.initElements(driver, EditAccount.class);
	   return mainpage;
	}
   public static DeleteAccount deleteAccount(){
	   clickOnElement(DeleteAccount);
	   DeleteAccount mainpage=PageFactory.initElements(driver, DeleteAccount.class);
	   return mainpage;
	}
   public static Deposit deposit(){
	   clickOnElement(Deposit);
	   Deposit mainpage=PageFactory.initElements(driver, Deposit.class);
	   return mainpage;
	}
   public static Withdrawal withdrawal(){
	   clickOnElement(Withdrawal);
	   Withdrawal mainpage=PageFactory.initElements(driver, Withdrawal.class);
	   return mainpage;
	}
   public static FundTransfer fundtransfer(){
	   clickOnElement(FundTransfer);
	   FundTransfer mainpage=PageFactory.initElements(driver, FundTransfer.class);
	  return mainpage;
   }
   public static ChangePassword changePassword(){
	   clickOnElement(ChangePassword);
	   ChangePassword mainpage=PageFactory.initElements(driver, ChangePassword.class);
	   return mainpage;
	}
   public static Balanceenquiry balanceEnquiry(){
	   clickOnElement(BalanceEnquiry);
	   Balanceenquiry mainpage=PageFactory.initElements(driver, Balanceenquiry.class);
	   return mainpage;
	}
   public static Ministatment miniStatment(){
	   clickOnElement(MiniStatement);
	   Ministatment mainpage=PageFactory.initElements(driver, Ministatment.class);
	   return mainpage;
   }
   public static CustomizedStatment customizedStatment(){
	   clickOnElement(CustomisedStatement);
	   CustomizedStatment mainpage=PageFactory.initElements(driver, CustomizedStatment.class);
	   return mainpage;
	}
  
	
	public static void checkLinks(){
		System.out.println("inside link methods ");
		checkAllLinks(elementList);
	}

	
}