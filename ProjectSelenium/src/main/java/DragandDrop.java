import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
		//driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//driver.get("https://demo.automationtesting.in/Slider.html");
		driver.get("https://demo.automationtesting.in/Resizable.html");
		driver.manage().window().maximize();
		Actions act=new Actions (driver);
		
		/*WebElement src=driver.findElement(By.id("node1"));
		WebElement trg=driver.findElement(By.id("box2"));
		act.dragAndDrop(src, trg).perform();*/
		
		/*drag and drop
		WebElement src=driver.findElement(By.id("box1"));
		WebElement trg=driver.findElement(By.id("box106"));
		act.dragAndDrop(src, trg).perform();*/
		
		//slider
		/*WebElement slider= driver.findElement(By.xpath("//div[@id='slider']/a"));
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).perform();*/
		
		//resizeable
		WebElement resize=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		act.moveToElement(resize).dragAndDropBy(resize, 50, 50).perform();
		
		

	}

}
