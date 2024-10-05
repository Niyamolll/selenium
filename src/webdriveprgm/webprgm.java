package webdriveprgm;

import org.openqa.selenium.chrome.ChromeDriver;

public class webprgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String excepttitle="Google";
		if(actualtitle.equals(excepttitle))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		driver.close();
	}

}
