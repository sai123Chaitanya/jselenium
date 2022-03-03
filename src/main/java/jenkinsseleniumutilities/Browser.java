package jenkinsseleniumutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	private static WebDriver driver;
	
	public static WebDriver openchromeurl()
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\software-Testing\\softwarefiles\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
		
	}
	
	public static void  openurl()
	{
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");	
		
	}
	
	public static void close_browser()
	{
		driver.close();
			
	}
	

}
