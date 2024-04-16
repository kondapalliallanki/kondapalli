import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("praveena");
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kondapalli");
driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("1340 basswood crst");

driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pravi@gmai.com");
driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
driver.findElement(By.xpath("//input[@value='FeMale']")).click();
driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

driver.findElement(By.xpath("//div[@id='msdd']")).click();
driver.findElement(By.xpath("//a[text()='Arabic']")).click();

WebElement skills=driver.findElement(By.id("Skills"));
Select se=new Select(skills);
se.selectByVisibleText("Adobe InDesign");

WebElement selcountry=driver.findElement(By.xpath("//select[@id='country']"));
Select sc=new Select(selcountry);
sc.selectByVisibleText("Australia");

WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
Select y=new Select(year);
y.selectByVisibleText("1982");

WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
Select m=new Select(month);
m.selectByVisibleText("January");

WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
Select d=new Select(day);
d.selectByVisibleText("3");

driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("pravi23");
driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("pravi123");
driver.findElement(By.id("submitbtn")).click();
	}
	
}