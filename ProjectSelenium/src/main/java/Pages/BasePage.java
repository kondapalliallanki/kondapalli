package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void waitForElementVisibility(WebElement e,int timeInSeconds) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.visibilityOf(e));
		}
	
	public void ClickAction(WebElement e) {
		waitForElementVisibility(e,5);
		e.click();
	}
	public void entertext(WebElement e,String txt) {
		waitForElementVisibility(e,5);
		e.sendKeys(txt);
	}
	
	public String gettext(WebElement e ) {
		waitForElementVisibility(e,5);
		return e.getText();
	}
	
	public void Alertaccept() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	
	public void Alertdismiss() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}
}
