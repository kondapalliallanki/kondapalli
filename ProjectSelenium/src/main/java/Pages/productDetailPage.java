package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailPage extends BasePage {
	
			
			public productDetailPage(WebDriver driver) {
				super(driver);
				}
	
	@FindBy(xpath="//div[@class='inventory_details_price']")
	WebElement price;
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	WebElement addtocart;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement shoppingcart;
	
	public String getprice() {
		return  gettext(price);
	}
	public void clickaddtocart() {
		 ClickAction(addtocart);
	}
	
	public void clickshoppingcart() {
		 ClickAction(shoppingcart);
	}
	
	
	
	
	
	
	

}
