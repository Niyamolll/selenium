package Testngprgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	ChromeDriver d;
@BeforeTest
public void  beforeTest()
{
 d = new ChromeDriver();	
}

@Test
public void test()
{
	d.get("https://demo.guru99.com/popup.php");
	String parentwindow=d.getWindowHandle();
	
	System.out.println("parant window title"+d.getTitle());
	d.findElement(By.xpath("/html/body/p/a")).click();
	
	Set<String>allWindowhandles=d.getWindowHandles();
	for(String handle:allWindowhandles)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			d.switchTo().window(handle);
			d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("niya@gmail.com");
			d.close();
		}
		d.switchTo().window(parentwindow);
	}
	
	
	
}

}
