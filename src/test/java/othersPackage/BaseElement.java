package othersPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class BaseElement {
	
	private By locator;
	
	public BaseElement(By locator) {
		this.locator = locator;
	}
	
	public void click() {
		getElement().click();
	}
	
	public String getText() {
		return getElement().getText();
	}
	public boolean isDisplayed() {
		return getElement().isDisplayed();
	}

	public void sendKeys(String value) {
		// TODO Auto-generated method stub
		getElement().sendKeys(value);
	}
	
	public void getPageSource(String value) {
		Browser.getDriver().getPageSource().contains(value);
	}
	
	public static void windowhandels() {
		Set<String> windowhandels = Browser.getDriver().getWindowHandles();
		Iterator<String> iterator = windowhandels.iterator();
		iterator.next();
		String PrivacyPolicyPageWindow = iterator.next();
		Browser.getDriver().switchTo().window(PrivacyPolicyPageWindow);
	}
	
	// ScrollDown
	public static void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) Browser.getDriver();
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		Reporter.log("=====Scrolling Down=====", true);
	}
	
	protected WebElement getElement() {
		return Browser.getDriver().findElement(locator);
	}

}
