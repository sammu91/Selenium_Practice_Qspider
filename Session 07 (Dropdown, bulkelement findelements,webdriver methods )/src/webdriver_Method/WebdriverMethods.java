package webdriver_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		
		driver.get("file:///C:/Users/SumitSh/Desktop/NSSW16.html");
		
// getTitle
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
// Getpagesource()  > GEt the html source code of page
		
		String HTMlsource = driver.getPageSource();
		
		System.out.println(HTMlsource);
		
// getCurrentURL()
		
		driver.findElement(By.tagName("a")).click();
		
		String URL = driver.getCurrentUrl();
		
		System.out.println(URL);
		
	}

}
