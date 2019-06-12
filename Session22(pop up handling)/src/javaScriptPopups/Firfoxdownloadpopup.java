package javaScriptPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firfoxdownloadpopup {

	public static void main(String[] args) {

	FirefoxOptions options = new FirefoxOptions();
	options.addPreference("browser.helperApps.neverAsk.openFile", "application/zip");
	
	// to find key : type about:config in firefox browser, back end settings of firefox called preferences name
	//value is mime type > search in google list of mime type
	// After run this script check in about: config appliction/zip will appear in type field.
	
	
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.seleniumhq.org/download/");
		
		driver.findElement(By.linkText("32 bit Windows IE")).click();
		

		
	}

}
