package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePage {

	
	public productsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='item_4_title_link']")
	WebElement product1;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addcart_p1;
	


	
	public void clickproduct1() {
		ClickAction(product1);
	}
	public void clickaddcart1() {
		ClickAction(addcart_p1);
	}
	



	
	
	
	
	
	
	
	
	
	
}
