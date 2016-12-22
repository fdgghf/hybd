package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;
import appModule.SignIn_Action;
import appModule.SignIn_Action1;

public class Param_TC {
	private static WebDriver driver = null;
	
	  public static void main(String[] args) {

	     driver = new FirefoxDriver();

	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	     driver.get("http://www.store.demoqa.com");

	     // Use your Module SignIn now
	     SignIn_Action1 Sig=new SignIn_Action1(driver);
	 	Sig.Execute(driver,"soni","India@1234");
	     

	     System.out.println("Login Successfully, now it is the time to Log Off buddy.");

	     HomePage hp=new HomePage(driver);
			hp.MyAccount().click();

	     driver.quit();

	  }

}
