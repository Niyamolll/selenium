package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Createpage {
	WebDriver driver;
	
		@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
		WebElement createpagelink;	
		@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
		WebElement signup;
		
		public Createpage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		public void createpageclick()
		{
			createpagelink.clear();
		}
		
		public void textverification()
		{
			String src=driver.getPageSource();
			if(src.contains("create a page"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
				
		}
	public void signupclick()	
	{
		signup.click();
	}
		
		
		
		
		
	



}

