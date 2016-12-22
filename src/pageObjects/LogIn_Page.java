package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Log;
public class LogIn_Page {
 
	WebDriver driver;
	public LogIn_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	
	@FindBy(id="log")
	
	  	WebElement UserName;
         
	@FindBy(id="pwd")
	WebElement Password;
    
	
	
	 public WebElement UserName()
	   {Log.info("Username text box found");
		   return UserName;
	   }
  
         
   public WebElement Password()
   {Log.info("Password text box found");
	   return Password;
   }
   
  
  
	

	
	
	
}
