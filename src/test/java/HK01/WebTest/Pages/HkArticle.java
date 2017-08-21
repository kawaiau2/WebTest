package HK01.WebTest.Pages;

import HK01.WebTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class HkArticle extends BasePage {
	@FindBy (className = "article_tit")
	private WebElement articleTitle;

    public HkArticle(WebDriver driver) {
        super(driver);
    }

	public String getArticleTitle() {
		return this.articleTitle.getText();
	}

}
