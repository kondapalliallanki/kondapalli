package TestngAttributes;

import org.testng.annotations.Test;

public class TestngGroup {

	@Test(priority=1,groups= {"Login"})
	public void tc_sanity() 
	{
		System.out.println("Sanity");
	}
	
	@Test(priority=3,groups= {"Search"})
	public void tc_retesting()
	{
		System.out.println("retesting");
	}

	@Test(priority=4,groups= {"Search"})
	public void tc_regression()
	{
		System.out.println("regression");
	}
	@Test(priority=2,groups= {"Login"})
	public void tc_functional()
	{
		System.out.println("functional");
	}
}
