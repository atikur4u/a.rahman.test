package pagePackage;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.Reporter;

import othersPackage.BaseElement;
import othersPackage.DriverUtils;

public class LoginPage {
	private BaseElement userName = new BaseElement(By.xpath("(//input[contains(@class, 'newlogindialog_TextInput_2eKVn')])[1]"));
	private BaseElement passWord = new BaseElement(By.xpath("//input[@type='password']"));
	private BaseElement signinButton = new BaseElement(By.xpath("//button[@type='submit']"));
	private BaseElement loadingIcon = new BaseElement(By.xpath("//button[contains(@class, 'newlogindialog_Loading_i9MK3')]"));
	private BaseElement errorText = new BaseElement(By.xpath("//div[contains(@class, 'newlogindialog_FormError_1Mcy9')]"));
	private BaseElement QRCodeSelector = new BaseElement(By.xpath("//div[@class='qrcode_Bit_2Yuvr qrcode_Active_274P1']"));

	public void username() {
		userName.sendKeys(DriverUtils.randomString1);
	}
	public void password() {
		passWord.sendKeys(DriverUtils.randomString2);
	}
	public void signinButton() {
		signinButton.click();
	}
	public boolean loadingcheck() {
		boolean lc = loadingIcon.isDisplayed();
		return lc;
	}
	public boolean Errorcheck() {
		boolean ec = errorText.isDisplayed();
		return ec;
	}
	
	public void checkSignPage() {
		//Verifying the main page is displayed or not
		Reporter.log("=====Verifying the Login page is displayed or not=====", true);
		if (QRCodeSelector.isDisplayed()) {
			System.out.println("Login Page display ");
		} else {
			System.out.println("Login Page is not display ");
		}
	}
	public void SendRandomCredential() {
		//Verifying the main page is displayed or not
		Reporter.log("=====Sending Random username & password & clicking on signin button=====", true);
		DriverUtils.wait("(//input[contains(@class, 'newlogindialog_TextInput_2eKVn')])[1]");
		DriverUtils.wait("//input[@type='password']");
		username();
		password();
		signinButton();
	}
	public void checkLoadingElement() {
		//Verifying the loading element is displayed or not
		Reporter.log("=====Checking loading element is displayed or not=====", true);
		if (loadingcheck() == true) {
			AssertJUnit.assertTrue(true);
			System.out.println("loading displayed");
		}
		else {
			AssertJUnit.assertTrue(false);
			System.out.println("loading not displayed");
		}
	}
	public void checkErrorText() {
		//Verifying the Error Text is displayed or not
		Reporter.log("=====Checking Error Text displayed or not=====", true);
		if (Errorcheck() == true) {
			AssertJUnit.assertTrue(true);
			System.out.println("ErrorText displayed");
		}
		else {
			AssertJUnit.assertTrue(false);
			System.out.println("ErrorText not displayed");
		}
	}

}
