package HK01.WebTest.Test;

import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HK01.WebTest.Base;
import HK01.WebTest.Pages.HkChannel;

public class ChannelTest {
	public WebDriver driver;
	public HkChannel channelPage;
	
	@BeforeTest
	public void beforeTest() {
		Base b = new Base();
		driver = b.getDriver();
		driver.get(b.getSectionLink("港聞"));
		driver.manage().window().maximize();
		channelPage = new HkChannel(driver);
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void CheckLoginButtonShow(){
		channelPage.getMemberButton().click();
		assertTrue(channelPage.getLoginDialog().isDisplayed());
	}
	
	@Test
	public void CheckDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy.M.d");
		Date date = new Date();
		System.out.printf(dateFormat.format(date) + "," + channelPage.getPageDate().getText());
		assertTrue(channelPage.getPageDate().getText().matches(dateFormat.format(date)+"(.*)"));
	}
	
}
