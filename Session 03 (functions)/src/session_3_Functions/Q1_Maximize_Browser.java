// Maximized browser  
// Firefox no need to maximize as it is maximized by default
package session_3_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Q1_Maximize_Browser {

	public static void main(String[] args) {
	
 //Maximize chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();                     // Upcasting

		driver.manage().window().maximize();   //Runtime polymorphism method of websriver and implemetation of object.
		
	

		
		
	}
		
		
	}
