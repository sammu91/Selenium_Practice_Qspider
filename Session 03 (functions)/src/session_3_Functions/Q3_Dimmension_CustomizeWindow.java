// For Responsive testing we can set dimensions and position of window.
//  By suing dimension class we can customize browser window

package session_3_Functions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q3_Dimmension_CustomizeWindow {
public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "./exefiles//geckodriver.exe");
WebDriver driver = new FirefoxDriver();
		
		
		// Dimension class
		
		Dimension dim = new Dimension (250,600);     // Dimension class give arguments in pixels 
		
		System.out.println(dim);
		driver.manage().window().setSize(dim);       // use set size method to set dimensons
	}

}
