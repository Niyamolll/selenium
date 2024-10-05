package junitprgmss;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
		ChromeDriver driver;
		@Before
		public void setup()
		{
			driver= new ChromeDriver();
			driver.get("https://rishiherbalindia.linker.store" );
		}
		@Test
		public void test()
		{
			String actualtitle=driver.getTitle();
			String exptitle="rishherber";
			if(actualtitle.equals(exptitle))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}	
		@Test
		public void link()
		{
			List<WebElement>li=driver.findElements(By.tagName("a"));  
			System.out.println("total no of links="+li.size());
			int expt=100;
			if(li.equals(expt))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
		@Test
		public void textverivication()
		{
			String src=driver.getPageSource();

			if(src.contains("FOOD"))
			{
				System.out.println("text present");
			}
			else
			{
				System.out.println("not present");
			}
		}
		@Test
		public void health()
		{
		driver.findElement(By.xpath("//a=@glair-source-ctype='category']")).click();
		}
}
