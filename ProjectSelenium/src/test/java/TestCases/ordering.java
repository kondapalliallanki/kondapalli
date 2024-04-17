package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productDetailPage;
import Pages.productsPage;
import Pages.yourcartPage;
import utils.ReadData;

public class ordering extends  BaseTest{ //sanjana
	
	@Test
	public void productordering() throws IOException {
		new loginPage(driver).enterusername();
		new loginPage(driver).enterpassword();
		new loginPage(driver).clicklogin();
		new productsPage(driver).clickproduct1();
		new productDetailPage(driver).clickaddtocart();
		new productDetailPage(driver).clickshoppingcart();
		new yourcartPage(driver).clickcheckout();
		new infoPage(driver).enterDetails();
		new overviewPage(driver).clickfinish();
		String actual_mess=new completePage(driver).messagetext();
		String expected_mess=new ReadData().getexpected_mess();
		Assert.assertEquals(actual_mess, expected_mess);
	}
				
	
	

}
