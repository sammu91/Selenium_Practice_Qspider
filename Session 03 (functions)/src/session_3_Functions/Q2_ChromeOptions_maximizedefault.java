//Maximize chrome browser default > Using options setting for browsers we can maximized browser by default.

package session_3_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;   // Chrome options used to set backend settings for chrome and firefox options for mozilla

public class Q2_ChromeOptions_maximizedefault {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe"); 
				
				ChromeOptions Opt = new ChromeOptions();  
				Opt.addArguments("--start-maximized");    // It will maximized chrome by default
				
				WebDriver driver = new ChromeDriver(Opt);
	}

}
