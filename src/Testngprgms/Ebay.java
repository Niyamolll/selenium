package Testngprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	String beseur1=("https://www.ebay.com/");
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	    driver.get(beseur1);
	
	}
	@Test
	public void test()
	{
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		WebElement smartphone=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[3]/a"));
	}}
}
