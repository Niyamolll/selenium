package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
  
	WebDriver driver;	
	
	@FindBy(id="email")
	WebElement Fbemail;
		
	@FindBy(id="pass")
	WebElement Fbpasswd;
		
	@FindBy(name="login")
	WebElement Fbloginbutton;
		
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);     //driver.findelement vendaaaa
	}
	public void setValues(String email,String passwd) 
	{
		
		Fbemail.sendKeys(email);
		Fbpasswd.sendKeys(passwd);
		
		
	}
	public void loginclick()
	{
		Fbloginbutton.click();
	}
		




	}
