package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completePage extends BasePage {
	

	public completePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2")
	WebElement message;
	
	public String messagetext() {
		return gettext(message);
	}

}
