package Testngprgms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGprgm {
@BeforeTest
public void setup()
{
	System.out.println("beforetest");
}
@BeforeMethod
public void urlloading()
{
	System.out.println("beforemethode");
}
@Test(priority=2,invocationCount=3)
public void Test1()
{
	System.out.println("test1");
}
@Test(priority=4,groups= {"smoke"})
public void Test2()
{
	System.out.println("test2");
}
@Test(priority=1,dependsOnMethods= {"Test4"})
public void Test3()
{
	System.out.println("test4"); 
}

@Test(priority=3,groups= {"sanity"})
public void Test4()
{
	System.out.println("test5");
}
@Test(priority=5,enabled=false)
public void Test5()
{
	System.out.println("test6");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("aftermethod");
}
@AfterTest
public void aftertest()
{
	System.out.println("aftertest");
	
}
}
