package junitprgmss;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alert {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/siyas/OneDrive/Desktop/anieta.html");
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();

		org.openqa.selenium.Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		//a.dismiss();
		
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("niya");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("sabu");
		
		driver.findElement(By.xpath("/html/body/input[4]")).click();

		
	}
	
}
