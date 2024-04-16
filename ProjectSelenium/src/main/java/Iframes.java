import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#Single']")).click();
		WebElement sf=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(sf);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;	
		WebElement mframe=driver.findElement(By.xpath("//a[@href='#Multiple']"));
		js.executeScript("arguments[0].click;", mframe);
		 //driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement nf=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(nf);
		WebElement fd=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(fd);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
	}

	
}
