package Testngprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogintest {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
@Test
public void test()
{
	driver.findElement(By.name("email")).sendKeys("niya@gmail.com");
	driver.findElement(By.name("password")).sendKeys("45673");
	driver.findElement(By.name("login")).click();
	String expurl="https://www.facebook.com/profile";
	String actualurl=driver.getPageSource();
	if(expurl.equals(actualurl))
	{
		System.out.println("login successfully");
		
	}
	else
	{
		System.out.println(" invalid login");	
	}
	
}
}