package othersPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.PrivacyPolicyPage;
import pagePackage.MostPlayedPage;

public class TestCases extends BaseClass {
	
	@BeforeMethod
	public void startBrowser() {
		init();
	}

	@Test
	public void Test1() {
		HomePage hp = new HomePage();
		LoginPage lp = new LoginPage();

		hp.checkMainPage();
		hp.LoginButtonClick();
		lp.SendRandomCredential();
		lp.checkLoadingElement();
		lp.checkErrorText();
	}

	@Test
	public void Test2() {
		try {
			HomePage hp = new HomePage();
			PrivacyPolicyPage pp = new PrivacyPolicyPage();

			BaseElement.ScrollDown();

			hp.PrivacyPolicyButtonClick();

			pp.SpanishLanguage();
			pp.FrenchLanguage();
			pp.GermanLanguage();
			pp.ItalianLanguage();
			pp.RussianLanguage();
			pp.JapaneseLanguage();
			pp.PortugueseLanguage();
			pp.BrazilianLanguage();
			pp.EnglishLanguage();
			pp.RevisionVerification();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Test
	public void Test3() {
		try {
			HomePage hp = new HomePage();
			MostPlayedPage mpg = new MostPlayedPage();

			hp.HoverOnNew_Noteworthy();
			hp.clickMostPlayedButton();
			mpg.MostPlayedGames();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void quitBrowser() {
		quit();
	}

}
