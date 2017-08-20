package HK01.WebTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HK01.WebTest.BaseTest;

public class HkArticle extends BaseTest{
	public WebDriver driver;
	public HkArticle (WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getArticleTitle() {
		return driver.findElement(By.className("article_tit"));
	}

}
