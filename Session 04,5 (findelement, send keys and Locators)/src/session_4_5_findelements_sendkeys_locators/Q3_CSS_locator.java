// Syntax of css selector = html tag [ attribute ='attribute value']
package session_4_5_findelements_sendkeys_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Q3_CSS_locator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("C:/Users/SumitSh/Desktop/NSSW16%20-%20Copy.html");
		

		// Login button
		
		driver.findElement(By.cssSelector("input[vlaue='LOGIN']")).click();
		
// CSS selector symbols
// 1. * --> contains > we can customize value
		// for password field
		driver.findElement(By.cssSelector("input[placeholder*='password']")).click();    
		//driver.findElement(By.cssSelector("input[placeholder*='enter pass']")).click();
		//driver.findElement(By.cssSelector("input[placeholder*='password']")).click();    // it will give 2 M Node

		
		
// 2. ^ --> starts with > can customize only last/end part
		
		//driver.findElement(By.cssSelector("input[placeholder*='enter pass']")).click(); 
		//driver.findElement(By.cssSelector("input[placeholder*='enter']")).click();   // it will give 2 M Node

// 3. > Traversing from parent to immediate child		
		
		//driver.findElement(By.cssSelector('html>body>h1')).click();
	}

}
