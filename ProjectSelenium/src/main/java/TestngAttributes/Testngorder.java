package TestngAttributes;

import org.testng.annotations.Test;

public class Testngorder {
	
	@Test(priority=1)
	public void Testone() 
	{
		System.out.println("This is Test1");
	}
	
	@Test(priority=2,enabled=false)
	public void Testtwo()
	{
		System.out.println("This is Test2");
	}
	
	@Test(priority=3,invocationCount=2,description="messages")
	public void Testthree()
	{
		System.out.println("This is Test3");
    }
	
	@Test(priority=4,dependsOnMethods= {"Testone"})
	public void Testfour()
	{
		System.out.println("This is Test4");
	}
	
	@Test(priority=5,timeOut=2000)
	public void Testfive() {
		System.out.println("This is Test5");
	}

}
