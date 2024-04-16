package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yourcartPage extends BasePage {
	
	
	public yourcartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	WebElement remove;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	
	public void clickremove() {
		 ClickAction(remove);
	}
	
	public void clickcontinueshopping() {
		 ClickAction(continueshopping);
	}
	
	public void clickcheckout() {
		 ClickAction(checkout);
	}
	
	

}
