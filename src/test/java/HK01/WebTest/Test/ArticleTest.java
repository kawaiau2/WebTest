package HK01.WebTest.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HK01.WebTest.Base;
import HK01.WebTest.Pages.HkArticle;

public class ArticleTest {
	public WebDriver driver;
	public HkArticle articlePage;
	
	@BeforeTest
	public void beforeTest() {
		Base b = new Base();
		driver = b.getDriver();
		driver.get(b.getArticleLink("港聞", "79555", "-一契多伙-避稅成風政府不修例-學者-現階段無計可施"));
		driver.manage().window().maximize();
		articlePage = new HkArticle(driver);
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void CheckTitle(){
		assertEquals(articlePage.getArticleTitle().getText(), "「一契多伙」避稅成風政府不修例　學者：現階段無計可施");
	}
}
