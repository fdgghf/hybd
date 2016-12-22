package automationFramework;


	 
    
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
     // Import package pageObject.*
 
import org.testng.annotations.Test;

     import pageObjects.HomePage;
 
import pageObjects.LogIn_Page;
 
     public class POM_TC {
    	
    			@Test
    			public void Login()
    			{
    				//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    				WebDriver driver=new FirefoxDriver();
    				driver.get("http://www.store.demoqa.com");;
    				HomePage hp=new HomePage(driver);
    				hp.MyAccount().click();
    				
    				//rd.submit().click();
    				
    				LogIn_Page Lp=new LogIn_Page(driver);
    				Lp.UserName().sendKeys("soni");
    				Lp.Password().sendKeys("India@1234");
    				 System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
    				hp.Logout().sendKeys("hello");
 
 
     driver.quit();
 
     }
 
}

