package HK01.WebTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HK01.WebTest.BaseTest;

public class HkChannel extends BaseTest{
	public WebDriver driver;
	public HkChannel (WebDriver driver){	
		this.driver = driver;
	}
	
	public WebElement getPageDate() {
		return driver.findElement(By.className("date"));
	}
	public WebElement getMemberButton() {
		return driver.findElement(By.className("member_btn"));
	}
	public WebElement getLoginDialog() {
		return driver.findElement(By.className("menu__top__member_beforelogin"));
	}
}
