package Testngprgms;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Gurudemo {
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void test()
{

	WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	WebElement Edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
	Actions act=new Actions(driver);
	act.contextClick(rightclick);
	act.perform();
	Edit.click();
	Alert a=driver.switchTo().alert();
	a.accept();
	act.doubleClick(doubleclick);
	act.perform();
	Alert b=driver.switchTo().alert();
	String alerttest=b.getText();
	System.out.println(alerttest);
	b.accept();

	
	
}
}
 