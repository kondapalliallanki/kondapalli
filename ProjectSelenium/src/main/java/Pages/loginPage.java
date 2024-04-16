package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ReadData;

public class loginPage extends BasePage{
	
	//1.page element,2.page actions 3.POM page factory
	
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement login;
	
	public void enterusername() throws IOException {
		 entertext(username,new ReadData().getusername());
	}
	
	public void enterpassword() throws IOException {
		 entertext(password,new ReadData().getpassword());
	}
	
	public void clicklogin() {
		ClickAction(login);
	}

}
