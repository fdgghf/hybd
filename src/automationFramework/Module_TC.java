package automationFramework;


	 import java.util.concurrent.TimeUnit;
	 
     import org.openqa.selenium.WebDriver;

     import org.openqa.selenium.firefox.FirefoxDriver;

     // Import package appModule.*

     import appModule.SignIn_Action;

     import pageObjects.HomePage;

public class Module_TC {

     private static WebDriver driver = null;
	
  public static void main(String[] args) {

     driver = new FirefoxDriver();

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.get("http://www.store.demoqa.com");

     // Use your Module SignIn now
     SignIn_Action Sig=new SignIn_Action(driver);
 	Sig.Execute(driver);
     

     System.out.println("Login Successfully, now it is the time to Log Off buddy.");

     HomePage hp=new HomePage(driver);
		hp.MyAccount().click();

     driver.quit();

  }

}
