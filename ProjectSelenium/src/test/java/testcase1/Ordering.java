package testcase1;

import java.io.IOException;

import org.testng.annotations.Test;

import pages1.TitlePage;

 
	public class Ordering extends Basetest1{     
		
		@Test  //dhannu
		public void ordering() throws InterruptedException, IOException {
			/*new HomePage(driver).scrolltoElement();
			Thread.sleep(2000);
			new HomePage(driver).clickElement();
			Thread.sleep(2000);*/
			
			/*dropdown
			String actual_head= new TitlePage(driver).getheading();
			System.out.println(actual_head);
		    new TitlePage(driver).selectText();*/
			
			//drag and drop
			 new TitlePage(driver).DragandDrop();
			
}
	}