package TestngAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StaticWebtable {
	
	static WebDriver driver;

	@BeforeMethod()
public void before()
{
	driver=new ChromeDriver();
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	driver.manage().window().maximize();
	
	
}
	@AfterMethod()
	public void after()
	{
	driver.quit();
	}
	
	@Test
	public void test1()
	{
		int r=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int c=driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
		boolean flag=false;
		for(int i=2;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				String data=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText();
				if(data.equals("Amazon"))
				{
					flag=true;
					System.out.println(i+" "+j);
					System.out.println("data valid");
					break;
				}
			}
		}
		if(flag=false)
		{
			System.out.println("not found");
		}
		
}	
	}
	
	
	


