import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		int r=driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr")).size();
System.out.println("number of rows :"+r);
int c=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th")).size();
System.out.println("number of columns :"+c);
boolean flag=false;
for(int i=1;i<=r-2;i++)
{
	String s=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th")).getText();
	
	if (s.equals("Burj Khalifa"))
	{
		String h=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td[3]")).getText();
		System.out.println(h);
		if(h.equals("829m"))
		{
			flag=true;
			System.out.println("data is vaid");
		}
	}
}
if(flag=false)
{
System.out.println("data i snot valid");	
}
}
}
