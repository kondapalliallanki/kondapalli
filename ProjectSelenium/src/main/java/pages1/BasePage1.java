package pages1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage1 {
	
	WebDriver driver;
	
	public BasePage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void waitForelementVisibility(WebElement e,int timeInSeconds) {
		WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait1.until(ExpectedConditions.visibilityOf(e));
		}
	
	public String gettext(WebElement e) {
		waitForelementVisibility(e,5);
		return e.getText();
	}
	
	public void clickAction(WebElement e) {
		waitForelementVisibility(e,5);
		e.click();
		}
	
	public void selectByVisibletext(WebElement e,String txt) {
		waitForelementVisibility(e,5);
		Select st=new Select(e);
		st.selectByVisibleText(txt);
	}
	
	public void Draganddrop(WebElement e,WebElement f) {
		waitForelementVisibility(e,5);
		Actions act=new Actions(driver);
		act.dragAndDrop(e,f).perform();
		
		
	}

}
