import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Newclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/hotels/lakeview-hotel-in-ooty-6386700252967176126/?hquery={%22ci%22:%2220240416%22,%22co%22:%2220240417%22,%22r%22:%221-2-0%22,%22ibp%22:%22%22}&cc=IN&reviewType=gi&vcid=889033689324744753&locusId=CTXOO&locusType=city&cityCode=CTXOO");
		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement room=driver.findElement(By.xpath("//h3[text()='Suite']"));
		js.executeScript("arguments[0].scrollIntoView(true)",room);
		driver.findElement(By.xpath("//h4[text()='1. Room Only | Free Cancellation']//preceding::h3[text()='Executive Suite']//following::button[1]")).click();
		
		
		
		
		
		
		/*driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		driver.findElement(By.xpath("//div[@data-testid='search-radio-button-wrap']")).click();
		driver.findElement(By.xpath("//input[@data-testid='home-autosuggest-input']")).sendKeys("ooty");
driver.findElement(By.xpath("//li[@id='downshift-1-item-0']")).click();
driver.findElement(By.xpath("//button[text()='Search']")).click();

driver.findElement(By.xpath("//input[@id='search-widget-checkin-input']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='search-widget-calendar-element']//descendant::li[@data-testid='date_li_16_3_2024']")).click();
driver.findElement(By.xpath("//div[@id='search-widget-calendar-element']//descendant::li[@data-testid='date_li_17_3_2024']")).click();*/

/*driver.findElement(By.xpath("//input[@value='2 Adults  . 1 Room ']")).click();
driver.findElement(By.xpath("//span[@data-testid='button-child-add']")).click();

driver.findElement(By.xpath("//div[@id='root']//following::h4[text()='Select']//following-sibling::span")).click();
driver.findElement(By.xpath("//div[@id='root']//following::li[text()='4']")).click();
driver.findElement(By.xpath("//div[@id='root']//following::button[text()='Done']")).click();*/

/*WebElement close=driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
obj.until(ExpectedConditions.visibilityOf(close));
close.click();*/
/*driver.findElement(By.xpath("//button[text()='Update Search']")).click();
driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//div[@id='root']//descendant::h4[3]")).click();

JavascriptExecutor js=(JavascriptExecutor) driver;
WebElement room=driver.findElement(By.xpath("//h3[text()='Suite']"));
js.executeScript("arguments[0].scrollIntoView(true)",room);*/


	}
}


