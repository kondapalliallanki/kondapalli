import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicesite {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.ca/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));






	}
	}