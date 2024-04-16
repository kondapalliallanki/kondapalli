import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homeworkocators {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://demo.automationtesting.in/Register.html");
		
TakesScreenshot ts=(TakesScreenshot) driver; 
File src=ts.getScreenshotAs(OutputType.FILE);
File trg=new File("screenshot/pravi.png");
FileUtils.copyFile(src,trg);*/
		
		//up load files
		/*driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys("C:\\Users\\User\\OneDrive\\Documents\\New folder\\New Text Document.txt");*/
		
		//up load file in register page
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\User\\OneDrive\\Documents\\New folder\\New Text Document.txt");
		
	}

}
