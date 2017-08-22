package HK01.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
	protected static WebDriver driver;
	public String targetLink = "https://www.hk01.com/";
	public enum DriverType {
		chrome, safari, firefox
	}

	public String getSectionLink (String sectionName) {
		return targetLink + "/section/" + sectionName;
	}
	
	public String getArticleLink (String sectionName, String articleNo, String articleName) {
		return targetLink + "/" + sectionName + "/" + articleNo + "/" + articleName;
	}
	
	public WebDriver getDriver(DriverType driverType) {
		switch (driverType) {
			case chrome:
				System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver-mac-64bit");
				driver = new ChromeDriver();
				break;
			case safari:
				driver = new SafariDriver();
				break;
			default:
				System.setProperty("webdriver.gecko.driver","src//main//resources//geckodriver-mac-64bit");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				driver = new FirefoxDriver();
				break;
		}
		return driver;
	}
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver-mac-64bit");
		driver = new ChromeDriver();
		return driver;
	}

}
