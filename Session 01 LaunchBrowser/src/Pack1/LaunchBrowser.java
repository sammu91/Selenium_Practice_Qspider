package Pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// For chrome
		String key = "webdriver.chrome.driver";         // key given in copy 
		String value = "./exefiles//chromedriver.exe";   // Value if location of exe file and put dot to make it dynamic.
		                                                 // Use fwd slash instead of backward slash in java always for location
	  
		System.setProperty(key, value);                 // this is same as sysout type
		 
		// initialize browser
		ChromeDriver C = new ChromeDriver ();           // Importing chrome driver class and creating object
				
		
		
		// For Mozilla
			  
		System.setProperty("webdriver.gecko.driver", "./exefiles//geckodriver.exe"); 
		
		FirefoxDriver M = new  FirefoxDriver ();
	}

}
