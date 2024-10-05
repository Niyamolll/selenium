package junitprgmss;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void amazon ()
	{
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
	}
}
