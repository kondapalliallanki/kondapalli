package pages1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage1 {
	

	JavascriptExecutor js;
	public HomePage(WebDriver driver){
		super(driver);
		this.js=(JavascriptExecutor)this.driver;
	}
	@FindBy(xpath="//a[@id='dropdown-checkboxes-radiobuttons']")
	WebElement element;
	
	public void scrolltoElement() {
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public void clickElement() {
		 clickAction(element);
	}
	
	

}
