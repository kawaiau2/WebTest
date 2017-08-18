package HK01.WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver = null;
	public String targetLink = "https://www.hk01.com/";
	
	public String getSectionLink (String sectionName) {
		return targetLink + "/section/" + sectionName;
	}
	
	public String getArticleLink (String sectionName, String articleNo, String articleName) {
		return targetLink + "/" + sectionName + "/" + articleNo + "/" + articleName;
	}
	
	public WebDriver getDriver() {
		driver = new ChromeDriver();
		return driver;
	}

	
	
}
