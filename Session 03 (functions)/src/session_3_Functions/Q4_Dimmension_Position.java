// We can set position of customized browser window using point class
package session_3_Functions;

import org.openqa.selenium.Point;                  // Point class
import org.openqa.selenium.Dimension;         // Dimension class
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
		
public class Q4_Dimmension_Position {
public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "./exefiles//geckodriver.exe");
WebDriver driver = new FirefoxDriver();

Dimension dim = new Dimension (250,600);     // Dimension class give arguments in pixels 
driver.manage().window().setSize(dim);       // use set size method to set dimensions


// Set position using point class

Point pt = new Point (400,0);               // Passing x and y coordinates as arguments

driver.manage().window().setPosition(pt);

	
}
	}


