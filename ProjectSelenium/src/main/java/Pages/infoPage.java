package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ReadData;

public class infoPage extends BasePage {

	
	public infoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement postalcode;
	
	@FindBy(id="cancel")
	WebElement cancel;
	
	@FindBy(id="continue")
	WebElement cont;
	
	public void enterDetails() throws IOException {
		entertext(firstname,new ReadData().getfirstname());
		entertext(lastname,new ReadData().getlastname());
		entertext(postalcode,new ReadData().getpostalcode());
		ClickAction(cont);
	}

}
