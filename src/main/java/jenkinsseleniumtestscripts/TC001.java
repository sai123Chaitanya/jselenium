package jenkinsseleniumtestscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jenkinsseleniumpages.HrmLogin;
import jenkinsseleniumutilities.Browser;

public class TC001 {
	WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		driver = Browser.openchromeurl();
		Browser.openurl();
		
	}
	
	@AfterClass
	public void teardown()
	{
		Browser.close_browser();
	}
	
	@Test
	public void senddata()
	{
		//hrm login
		HrmLogin log = new HrmLogin(driver);
		log.Hrmlogin("Admin", "admin123");
	}
	

}
