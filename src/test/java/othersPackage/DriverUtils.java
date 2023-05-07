package othersPackage;

import java.time.Duration;
import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtils {
	public static WebDriverWait wait = new WebDriverWait(Browser.getDriver(), Duration.ofSeconds(20));
	public static String propertyFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
	
	public static void wait(String xPath) {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
	}
	 
	public static void navigate() throws IOException {
		FileReader fr = new FileReader(propertyFilePath);
		Properties prop = new Properties();
		prop.load(fr);
		Browser.getDriver().navigate().to(prop.getProperty("url"));
	}
	
	public static void HoverOnElement(WebElement element) {
		Actions action = new Actions(Browser.getDriver());
		action.moveToElement(element).perform();
	}
	
	public static String randomAlphanumericString(int length) {
	    String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuv";
	 
	    StringBuffer randomString = new StringBuffer(length);
	    Random random = new Random();
	 
	    for (int i = 0; i < length; i++) {
	        int randomIndex = random.nextInt(alphanumericCharacters.length());
	        char randomChar = alphanumericCharacters.charAt(randomIndex);
	        randomString.append(randomChar);
	    }
	 
	    return randomString.toString();
	}

	public static String randomString1 = randomAlphanumericString(10);
	public static String randomString2 = randomAlphanumericString(15);

}
