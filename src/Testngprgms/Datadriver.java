package Testngprgms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriver {
WebDriver driver;
@BeforeTest
public void setUp()
{
	driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
}
@Test
public void datadriver() throws IOException
{
	FileInputStream ob =new FileInputStream("C:\\Users\\siyas\\Downloads\\mailll.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(ob);
	XSSFSheet sh =wb.getSheet("sheet1");
    int row	=sh.getLastRowNum();
    for(int i=1;1<=row;i++)
    {
    	String usern=sh.getRow(i).getCell(0).getStringCellValue();
    	String pasw=sh.getRow(i).getCell(1).getStringCellValue();
    	System.out.println(usern+"-------"+pasw);
    	driver.findElement(By.name("email")).sendKeys(usern);
    	driver.findElement(By.name("pass")).sendKeys(pasw);
    	driver.findElement(By.name("login")).click();
    	driver.navigate().refresh();
    }
}
}
