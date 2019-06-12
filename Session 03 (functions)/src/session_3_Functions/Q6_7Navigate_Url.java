// Using get() and navigate().to() method we can navigate to URL in browser
// USe navigate to method always

package session_3_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Q6_7Navigate_Url {
public static void main(String[] args) throws InterruptedException {              // add throws at top is not good cding std.
						
	System.setProperty("webdriver.gecko.driver", "./exefiles//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	
	driver.get("https://employeeqa.havells.com/");      // Get method
	
	
	driver.navigate().to("https://google.com/");        // Navigate() to () method
	

	Thread.sleep(2000);                   // need to add throws for exception handling
	
	driver.navigate().back();                          
	
	Thread.sleep(2000);                 // 
	
	driver.navigate().forward();
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();

}

}
