import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  driver=new ChromeDriver();
driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
driver.manage().window().maximize();
System.out.println(value("Amazon"));
	}

public static boolean value(String name) {
List <WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
int r=rows.size();
System.out.println("number of rows :"+r);

List <WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
int c=columns.size();
System.out.println("number of columns :"+c);

boolean flag=false;
for (int i=2;i<=r;i++)
{
	for(int j=1;j<=c;j++)
	{
		String data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
		if(data.equals(name))
		{
			flag=true;
			System.out.println(i+ " : "+j);
			break;
		}
		
	}
}
if(flag)
{
	return true;
}
return flag;
}
}

/*for(int i=2;i<=r;i++)
{
	for (int j=1;j<=3;j++)
	{
		String data=driver.findElement(By.xpath(""//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.print(data+"  ");
	}
	System.out.println();
}*/






