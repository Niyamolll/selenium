package Testpkg;



import org.testng.annotations.Test;

import Pagepkg.Createpage;



public class Createtest extends baseclass
{
	@Test
	public void test()
	{
		
		
		Createpage ob=new Createpage(driver);
		ob.createpageclick();
		ob.textverification();
		ob.signupclick();
	}
}

	