package Testngprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontask {
	ChromeDriver d;
@BeforeTest
public void  beforeTest()
{
 d = new ChromeDriver();	
}

@Test
public void test()
{
	d.get("https://www.amazon.in/");
}
@Test
public void Test()
{
	String actualtitle=d.getTitle();
	String exptitle="amazon";
	if(actualtitle.equals(exptitle))
	{
		System.out.println("matched");
	}
	else
	{
		System.out.println("non matched");
	}
}
@Test
public void textverivication()
{
	String src=d.getPageSource();

	if(src.contains("mobiles"))
	{
		System.out.println("text present");
	}
	else
	{
		System.out.println("not present");
	}
}
@Test
public void search()
{
	
d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles",Keys.ENTER);
d.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
}






}