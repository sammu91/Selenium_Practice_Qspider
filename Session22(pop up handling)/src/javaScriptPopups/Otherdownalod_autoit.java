package javaScriptPopups;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Otherdownalod_autoit {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.autoitscript.com/site/autoit/downloads/");
		
	}

}
