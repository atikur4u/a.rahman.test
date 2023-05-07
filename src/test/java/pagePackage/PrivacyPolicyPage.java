package pagePackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import othersPackage.BaseElement;
import othersPackage.Browser;
import othersPackage.DriverUtils;


public class PrivacyPolicyPage {
		
	private BaseElement english = new BaseElement(By.xpath("//a[contains(@href, 'privacy_agreement/english')]"));
	private BaseElement spanish = new BaseElement(By.xpath("//a[contains(@href, 'privacy_agreement/spanish')]"));
	private BaseElement french = new BaseElement(By.xpath("//a[contains(@href, 'privacy_agreement/french')]"));
	private BaseElement german = new BaseElement(By.xpath("//a[contains(@href, 'privacy_agreement/german')]"));
	private BaseElement italian = new BaseElement(By.xpath("//a[contains(@href, 'privacy_agreement/italian')]"));
	private BaseElement russian = new BaseElement(By.xpath("//a[contains(@href, 'privacy_agreement/russian')]"));
	private BaseElement japanese = new BaseElement(By.xpath("//a[contains(@href, 'privacy_agreement/japanese')]"));
	private BaseElement portuguese = new BaseElement(By.xpath("//a[contains(@href, 'privacy_agreement/portuguese')]"));
	private BaseElement brazilian = new BaseElement(By.xpath("//a[contains(@href, 'privacy_agreement/brazilian')]"));

	
	
	public void EnglishLanguage() {
		BaseElement.windowhandels();
		boolean en = english.isDisplayed();
		if(en == true) {
			Assert.assertTrue(true);
			Reporter.log("=====English Language is Available=====", true);
		}
		else {
			Assert.assertTrue(false);
			Reporter.log("=====English Language is not Available=====", true);
		}
		english.click();
		
	}
	public void SpanishLanguage() {
		BaseElement.windowhandels();
		boolean en = spanish.isDisplayed();
		if(en == true) {
			Assert.assertTrue(true);
			Reporter.log("=====Spanish Language is Available=====", true);
		}
		else {
			Assert.assertTrue(false);
			Reporter.log("=====Spanish Language is not Available=====", true);
		}
		spanish.click();
		
	}
	public void FrenchLanguage() {
		BaseElement.windowhandels();
		boolean en = french.isDisplayed();
		if(en == true) {
			Assert.assertTrue(true);
			Reporter.log("=====French Language is Available=====", true);
		}
		else {
			Assert.assertTrue(false);
			Reporter.log("=====French Language is not Available=====", true);
		}
		french.click();
		
	}
	public void GermanLanguage() {
		BaseElement.windowhandels();
		boolean en = german.isDisplayed();
		if(en == true) {
			Assert.assertTrue(true);
			Reporter.log("=====German Language is Available=====", true);
		}
		else {
			Assert.assertTrue(false);
			Reporter.log("=====German Language is not Available=====", true);
		}
		german.click();
		
	}
	public void ItalianLanguage() {
		BaseElement.windowhandels();
		boolean en = italian.isDisplayed();
		if(en == true) {
			Assert.assertTrue(true);
			Reporter.log("=====Italian Language is Available=====", true);
		}
		else {
			Assert.assertTrue(false);
			Reporter.log("=====Italian Language is not Available=====", true);
		}
		italian.click();
		
	}
	public void RussianLanguage() {
		BaseElement.windowhandels();
		boolean en = russian.isDisplayed();
		if(en == true) {
			Assert.assertTrue(true);
			Reporter.log("=====Russian Language is Available=====", true);
		}
		else {
			Assert.assertTrue(false);
			Reporter.log("=====Russian Language is not Available=====", true);
		}
		russian.click();
		
	}
	public void JapaneseLanguage() {
		BaseElement.windowhandels();
		boolean en = japanese.isDisplayed();
		if(en == true) {
			Assert.assertTrue(true);
			Reporter.log("=====Japanese Language is Available=====", true);
		}
		else {
			Assert.assertTrue(false);
			Reporter.log("=====Japanese Language is not Available=====", true);
		}
		japanese.click();
		
	}
	public void PortugueseLanguage() {
		BaseElement.windowhandels();
		boolean en = portuguese.isDisplayed();
		if(en == true) {
			Assert.assertTrue(true);
			Reporter.log("=====Portuguese Language is Available=====", true);
		}
		else {
			Assert.assertTrue(false);
			Reporter.log("=====Portuguese Language is not Available=====", true);
		}
		portuguese.click();
		
	}
	public void BrazilianLanguage() {
		BaseElement.windowhandels();
		boolean en = brazilian.isDisplayed();
		if(en == true) {
			Assert.assertTrue(true);
			Reporter.log("=====Brazilian Language is Available=====", true);
		}
		else {
			Assert.assertFalse(false);
			Reporter.log("=====Brazilian Language is not Available=====", true);
		}
		brazilian.click();
		
	}
	

	
	public void RevisionVerification() throws IOException {
		FileReader fr = new FileReader(DriverUtils.propertyFilePath);
		Properties prop = new Properties();
		prop.load(fr);
		DriverUtils.wait("//i[text()='Revision Date: January 1, 2023']");
		if(Browser.getDriver().getPageSource().contains(prop.getProperty("RevisionYearData"))) {
			Reporter.log("=====Policy revision signed in 2023=====", true);
		}
		else {
			Reporter.log("=====Policy revision is not signed in 2023=====", true);
		}
	}
	

}
