package Testngprgms;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	    driver.get("https://janasya.com");
	}
@Test
public void test() throws IOException
{
	driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/h1/a/img[2]"));
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File(".//screenshot//pagescreen.png"));
	
	List<WebElement>li=driver.findElements(By.tagName("a"));
	System.out.println("toatal no of links="+li.size());
	int explink=400;
	if(li.equals(explink))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
@Test
public void test1()
{
	String actualtitle=driver.getTitle();
	String exptitle="janasya";
	if(actualtitle.equals(exptitle))
	{
		System.out.println("matched");
	}
	else
	{
		System.out.println("non matched");
	}
}

}
