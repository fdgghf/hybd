package appModule;


	import org.openqa.selenium.WebDriver;
	 

import org.openqa.selenium.support.PageFactory;

	 import pageObjects.HomePage;
	 
import pageObjects.LogIn_Page;

public class SignIn_Action{
	  
	 WebDriver driver;
		public SignIn_Action(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		 public static void Execute(WebDriver driver){
			 
    	HomePage hp=new HomePage(driver);
    	hp.MyAccount().click();
		
		//rd.submit().click();
		
		LogIn_Page Lp=new LogIn_Page(driver);
		Lp.UserName().sendKeys("soni");
		Lp.Password().sendKeys("India@1234");
		 System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		hp.Logout().sendKeys("hello");
}

}
