

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestngAttributes.Before;


public class March24testng extends Before
{
	
	
    @Test ()
	public void row ()
	{
		List <WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Number of rows :" +rows.size());
	}
	
	@Test ()
	public void header()
	{
       List <WebElement> header=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("number of header :" +header.size());
		for(WebElement h:header)
		{
			System.out.println("Header :" +h.getText());
		}
}
	
	@Test()
	public void data()
	{
		List <WebElement> data=driver.findElements(By.xpath("//table[@id='customers']//td"));
		for(WebElement d:data)
		{
			String s=d.getText();
			if(s.equals("Java"))
					{
				System.out.println("Data is valid");
				break;
					}
	      }
	}

}

