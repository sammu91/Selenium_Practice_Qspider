package session_4_5_findelements_sendkeys_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Q2_Locators_1_to_6 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("C:/Users/SumitSh/Desktop/NSSW16%20-%20Copy.html");
		
		
// 1. Locator by id  > user name
		
		WebElement username = driver.findElement(By.id("user") );
		
		username.sendKeys("sumittest");
		
// 2. Locator by name > password
		
	driver.findElement(By.name("pwd")).sendKeys("123456");
	
	
// 3. Locator by class name > check box click
	driver.findElement(By.className("MyCheckbox")).click();
	
	
// 4. Locator by tag name 
	driver.findElement(By.tagName("a")).click();
	
// 5. Locator by Link text > Can used only for links by this we can redirect to new page
	//driver.findElement(By.linkText("Selenium")).click();
	
	
// Locator by partial link text > we can customize link text > use it when there is very large text
	driver.findElement(By.partialLinkText("Sel")).click();
	
	
	}

}
