package webdriveprgm;

import org.openqa.selenium.chrome.ChromeDriver;

public class textvarification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	
		String actualtitle=driver.getPageSource();
		String exepttitle="Gmail";
		if(actualtitle.contains(exepttitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
