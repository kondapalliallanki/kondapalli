package TestngAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparameters {

	
	@Test
	@Parameters({"url","username","pwd"})
	public void Login(String url,String username,String pwd)
	{
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
}
