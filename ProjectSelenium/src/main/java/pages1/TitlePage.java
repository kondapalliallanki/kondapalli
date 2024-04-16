package pages1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils1.ReadData1;


public class TitlePage extends BasePage1 {

	public TitlePage (WebDriver driver){
		super(driver);
	}
		
	@FindBy(xpath="//div[@id='main-header']/h1")
	WebElement title;
	
	@FindBy(xpath="//select[@id='dropdowm-menu-1']")
	WebElement dropdown;
	
	
	@FindBy(xpath="//div[@id='draggable']")
	WebElement source;
	
	@FindBy(xpath="//div[@id='droppable']")
	WebElement target;
	
	
	public String getheading() {
		return gettext(title);
	}
	
	public void selectText() throws IOException {
		 selectByVisibletext(dropdown,new ReadData1().getdropdownoption());
		}
	
	public void DragandDrop() {
		Draganddrop(source,target);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
