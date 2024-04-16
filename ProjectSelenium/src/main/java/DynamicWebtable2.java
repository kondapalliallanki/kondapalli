import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DynamicWebtable2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO1 Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");

int page=driver.findElements(By.xpath("//ul[@id='pagination']/li")).size();
System.out.println("number of pages :"+page);

int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr")).size();
System.out.println("number of rows :"+rows);

int column=driver.findElements(By.xpath("//table[@id='productTable']/thead/tr/th")).size();
System.out.println("number of columns :"+column);

int data=driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr/td")).size();
System.out.println("number of data :"+data);	


/*for(int p=1;p<=pages;p++)
{
	WebElement activepage=driver.findElement(By.xpath("//*[@id='pagination']/li/a[@class='active']"));
	activepage.click();
	String ap=activepage.getText();
	
	System.out.println(ap);
	
	int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr")).size();
	System.out.println("number of rows :"+rows);
	
	String pno=Integer.toString(p+1);
	
	driver.findElement(By.xpath("//*[@id='pagination']/li/a[text()='"+pno+"']")).click();
	}*/

for (int i=1;i<=page;i++) 
{
	driver.findElement(By.xpath("//ul[@id='pagination']/li/a[text()='"+i+"']")).click();
	System.out.println("page number :"+i);
	for(int j=1;j<=rows;j++)
	{
		for(int k=1;k<=column;k++)
		{
			String cell=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+j+"]/td["+k+"]")).getText();
			System.out.print(cell+" ");
			
			}
		}
	System.out.println();
	}

	

	
	
	}
}
	

	
