package automationFramework;



import org.apache.log4j.xml.DOMConfigurator;
 

import java.util.concurrent.TimeUnit;
 

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.*;
import utility.*;
import appModule.*;
 
public class Log4j_Logging_TC {
 
private static WebDriver driver = null;
 
        public static void main(String[] args) throws Exception {
 
// Provide Log4j configuration settings
        	
DOMConfigurator.configure("C:/A/SONI/QA traning/Selenium/Ira/src/log4j.xml");
 
Log.startTestCase("Selenium_Test_001");
 
ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
 
Log.info(" Excel sheet opened");
 
driver = new FirefoxDriver();
 
Log.info("New driver instantiated");
 
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
Log.info("Implicit wait applied on the driver for 10 seconds");
 
driver.get(Constant.URL);
 
Log.info("Web application launched");
 
SignIn_Action.Execute(driver);
 
System.out.println("Login Successfully, now it is the time to Log Off buddy.");
 
//HomePage.lnk_LogOut(driver).click();
 
Log.info("Click action is perfomred on Log Out link");
 
driver.quit();
 
Log.info("Browser closed");
 
ExcelUtils.setCellData("Pass", 1, 3);
 
Log.endTestCase("Selenium_Test_001");
 
}
 
}
