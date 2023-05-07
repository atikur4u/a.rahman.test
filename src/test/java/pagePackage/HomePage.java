package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import othersPackage.BaseElement;
import othersPackage.Browser;
import othersPackage.DriverUtils;


public class HomePage {
	
	private BaseElement loginButton = new BaseElement(By.xpath("//*[@id='global_action_menu']/a"));
	private BaseElement homeTabRow = new BaseElement(By.xpath("//div[@class='home_tabs_row store_horizontal_minislider']"));
	private BaseElement PrivacyPolicyButton = new BaseElement(By.xpath("//a[contains(@href, 'https://store.steampowered.com/privacy_agreement/?snr=1_44_44_')]"));
	WebElement New_Noteworthy = Browser.getDriver().findElement(By.xpath("(//a[@class = 'pulldown_desktop'])[2]"));
	private BaseElement MostPlayedButton = new BaseElement(By.xpath("//a[contains(text(),'Most Played')]"));
	
	public void checkMainPage() {
		// Verifying the main page is displayed or not
		Reporter.log("=====Verifying the main page is displayed or not=====", true);
		if (homeTabRow.isDisplayed() == true) {
			System.out.println("Main Page display ");
		} else {
			System.out.println("Main Page is not display ");
		}
	}
	// Method to click Privacy Policy button
	public void LoginButtonClick() {
		DriverUtils.wait("//*[@id='global_action_menu']/a");
		loginButton.click();
		Reporter.log("=====Login Button Clicked=====", true);
	}

	public void PrivacyPolicyButtonClick() {
		DriverUtils.wait("//a[contains(@href, 'https://store.steampowered.com/privacy_agreement/?snr=1_44_44_')]");
		PrivacyPolicyButton.click();
		Reporter.log("=====Privacy Policy Button Clicked=====", true);
	}
	
	public void HoverOnNew_Noteworthy() {
		DriverUtils.HoverOnElement(New_Noteworthy);
	}

	public void clickMostPlayedButton() {
		DriverUtils.wait("//a[contains(text(),'Most Played')]");
		MostPlayedButton.click();
	}
}
