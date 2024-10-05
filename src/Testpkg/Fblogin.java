package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Fbloginpage;

public class Fblogin {
WebDriver driver;
	@BeforeTest
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1()
	{
		Fbloginpage ob=new Fbloginpage(driver);
	    ob.setValues("abc@gmail.com", "abc123");
     	ob.loginclick();
	}
	

	
	
	
	
}
