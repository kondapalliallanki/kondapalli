package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.ReadData;

public class BaseTest {
	
	WebDriver driver;
	@BeforeTest
	public void Before() throws IOException {
		driver=new ChromeDriver();
		driver.get(new ReadData().geturl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	/*@AfterTest
	public void After() {
		driver.quit();
	}*/
	
	

}
