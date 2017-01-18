package AppPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomer extends home_Page{

	
	@FindBy(xpath="//input[@type='text' and @name='name']")
    private static WebElement newname;
	@FindBy(xpath="//input[@type='radio' and @value='f']")
    private static WebElement Gendr;
	@FindBy(xpath="//input[@id='dob' and @type='date']")
    private static WebElement DOB;
	@FindBy(xpath="//textarea[@name='addr']")
    private static WebElement Addr;
	@FindBy(xpath="//input[@type='text' and @name='city']")
    private static WebElement cty;
	@FindBy(xpath="//input[@type='text' and @name='state']")
    private static WebElement state;
	@FindBy(xpath="//input[@type='text' and @name='pinno']")
    private static WebElement pin;
	@FindBy(xpath="//input[@type='text' and @name='telephoneno']")
    private static WebElement mob;
	@FindBy(xpath="//input[@type='text' and @name='emailid']")
    private static WebElement email;
	@FindBy(xpath="//input[@type='password' and @name='password']")
    private static WebElement pswrd;

	
	public static void createnewuser(String username,String userDOB,String useradr,String usercty,String userstate,int pinnumber,String usermob,String usermail,String userpswrd){
		inputValue(newname, username);
		clickonradiobutton(Gendr);
		inputValue(DOB, userDOB);
		inputValue(Addr, useradr);
		inputValue(cty, usercty);
		inputValue(state, userstate);
		inputnumericvalue(pin,pinnumber);
		inputValue(mob, usermob);
		inputValue(email, usermail);
		inputValue(pswrd, userpswrd);
			
		
	}

}
