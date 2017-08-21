package HK01.WebTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HK01.WebTest.BasePage;
import org.openqa.selenium.support.FindBy;

public class HkChannel extends BasePage{
	@FindBy (className = "date")
	private WebElement pageDate;

	@FindBy (className = "member_btn")
	private WebElement memberButton;

	@FindBy (className = "menu__top__member_beforelogin")
	private WebElement loginDialog;

	public HkChannel(WebDriver driver) {
		super(driver);
	}
	
	public String getPageDate() {
		return this.pageDate.getText();
	}
	public void clickMemberButton() {
		this.memberButton.click();
	}

	public boolean loginDialogDisplay() {
		return this.loginDialog.isDisplayed();
	}
}
