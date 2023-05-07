package pagePackage;

import java.text.NumberFormat;
import java.text.ParseException;
import org.openqa.selenium.By;
import othersPackage.BaseElement;
import othersPackage.DriverUtils;

public class MostPlayedPage {
	private BaseElement firstGame = new BaseElement(By.xpath("(//td[@class = 'weeklytopsellers_ConcurrentCell_3L0CD'])[1]"));
	private BaseElement secondGame = new BaseElement(By.xpath("(//td[@class = 'weeklytopsellers_ConcurrentCell_3L0CD'])[2]"));
	private BaseElement thirdGame = new BaseElement(By.xpath("(//td[@class = 'weeklytopsellers_ConcurrentCell_3L0CD'])[3]"));
	
	public void MostPlayedGames() throws ParseException {
		DriverUtils.wait("(//td[@class = 'weeklytopsellers_ConcurrentCell_3L0CD'])[3]");
		String firstcount = firstGame.getText();
		String secondcount = secondGame.getText();
		String thirdcount = thirdGame.getText();
		
		NumberFormat numberFormate = NumberFormat.getNumberInstance();
		Number num1 = numberFormate.parse(firstcount);
		Number num2 = numberFormate.parse(secondcount);
		Number num3 = numberFormate.parse(thirdcount);
		firstcount = num1.toString();
		secondcount = num2.toString();
		thirdcount = num3.toString();
		
		int fcount = Integer.parseInt(firstcount);
		int scount = Integer.parseInt(secondcount);
		int tcount = Integer.parseInt(thirdcount);
		boolean comp1st = fcount>scount;
		boolean comp2nd = scount>tcount;
		System.out.println(fcount);
		System.out.println(scount);
		System.out.println(tcount);
		if(comp1st == true) {
			System.out.println("1st game in the list has more Current Player than 2nd");
		}
		else {
			System.out.println("2nd game in the list has more Current Player than 1st");
		}
		if(comp2nd == true) {
			System.out.println("2nd game in the list has more Current Player than 3rd");
		}
		else {
			System.out.println("3rd game in the list has more Current Player than 2nd");
		}
	}
	
}
