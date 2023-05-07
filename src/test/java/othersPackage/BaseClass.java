package othersPackage;

import java.io.IOException;

public class BaseClass {
	
	public static void init() {
		Browser.getDriver();
		try {
			DriverUtils.navigate();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void quit() {
		Browser.quitDriver();
	}

}
