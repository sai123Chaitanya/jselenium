package jenkinsseleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HrmLogin {
	
	private WebDriver driver;
	public HrmLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By username = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By button   = By.id("btnLogin");
	
	private void set_username(String uname)
	{
		
		driver.findElement(username).sendKeys(uname);
		
	}
	
	private void set_password(String pass)
	{
		
		driver.findElement(password).sendKeys(pass);
		
	}
	
	private void click_on()
	{
		
		driver.findElement(button).click();
		
	}
	
	
	public void Hrmlogin(String uname,String pass)
	{
		this.set_username(uname);
		this.set_password(pass);
		this.click_on();
		
		
	}
	
	

}
