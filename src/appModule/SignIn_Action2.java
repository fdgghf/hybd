package appModule;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.PageFactory;

 import pageObjects.HomePage;
 
import pageObjects.LogIn_Page;
import utility.ExcelUtils;
import utility.Log;
public class SignIn_Action2{
  
 WebDriver driver;
	public SignIn_Action2(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	  public static void Execute(WebDriver driver) throws Exception{
		  
		  String sUserName = ExcelUtils.getCellData(1, 1);
		  Log.info("Username picked from Excel is "+ sUserName );
		  String sPassword = ExcelUtils.getCellData(1, 2); 
			Log.info("Password picked from Excel is "+ sPassword );
			 
	HomePage hp=new HomePage(driver);
	hp.MyAccount().click();
	Log.info("Click action performed on My Account link");
	//rd.submit().click();
	
	LogIn_Page Lp=new LogIn_Page(driver);
	Lp.UserName().sendKeys("sUsername");
	Log.info("Username entered in the Username text box");
	 
	Lp.Password().sendKeys("sPassword");
	Log.info("Password entered in the Password text box");
	 System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

	hp.Logout().sendKeys("hello");
	Log.info("Click action performed on Submit button");
}

}
