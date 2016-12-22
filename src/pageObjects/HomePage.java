package pageObjects;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Log; 
  public class HomePage{
	  
		  WebDriver driver;
			public HomePage(WebDriver driver){
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
			
    @FindBy(xpath="html/body/div[2]/div/div/header/div[2]/a")
    
	WebElement MyAccount;
   
 

	@FindBy(xpath="html/body/div[2]/div/div/header/div[1]/a")
	
	WebElement LogOut;
    
	 public WebElement MyAccount()
	   {Log.info("My Account link element found");
		   return MyAccount;
	   }
	 public WebElement Logout()
	   {
		 Log.info("Log Out link element found");
		   return LogOut;
	   }
 
}

