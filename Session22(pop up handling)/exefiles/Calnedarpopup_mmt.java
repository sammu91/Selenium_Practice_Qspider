package calendarpopup;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calnedarpopup_mmt {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		int currentMonth = LocalDate.now().getMonthValue();
		LocalDate departureDate = LocalDate.now().plusMonths(3).plusDays(1);
		System.out.println("departureDate"+departureDate);
		
		int selectDepDate = departureDate.getDayOfMonth();
		int selectDepMonth = departureDate.getMonthValue();
		String monthLower = departureDate.getMonth().name().toLowerCase();
		
		String selectDepMonthName = monthLower.substring(0,1).toUpperCase()+monthLower.substring(1);
		
		System.out.println("currentMonth: " +currentMonth + " ::selectDepMonth: "+ selectDepMonth);
		
		System.out.println("selectDepMonthName: "+ selectDepMonthName +"selectDepDate: "+ selectDepDate );
		
		for (int i = currentMonth; i < selectDepMonth; i++) {
			
			driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
			
		}
		
		
		String xp="//div[starts-with(text(),'"+selectDepMonthName+"')]/../following-sibling::div//p[text()='"+selectDepDate+"']";
		
		
		driver.findElement(By.xpath(xp)).click();
		
		
	}

}
