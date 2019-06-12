// If browser installed in another drive default it select c drive so we use set bimary if browser in d or e drive
// This is only used for chrome and firefox browser because other are default

package session_3_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Q5_Binary_browserlocation {


	public static void main(String[] args) {
	
 FirefoxOptions options = new FirefoxOptions();
 options.setBinary("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");  // setting browser file location, use fwd slash for URL
		
	System.setProperty("webdriver.gecko.driver", "./exefiles//geckodriver.exe");
	WebDriver driver = new FirefoxDriver(options);

}

}
