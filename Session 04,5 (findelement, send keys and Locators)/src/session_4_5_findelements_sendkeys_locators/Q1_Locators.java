// Web element is a interface

package session_4_5_findelements_sendkeys_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;            // it is a inter face
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Q1_Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe"); 
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		
		System.out.println(driver.getClass().getSimpleName());   // this will tell the class name in implementation done.
		
		driver.get("file:///C:/Users/SumitSh/Desktop/NSSW16%20-%20Copy.html");     // naviaget to created HTML page
		
		
		
		
//1.  Using web element and locator to find webelement fo html page
		
		WebElement textBox = driver.findElement(By.id("user"));   // we are using username id
		
		System.out.println(textBox.getClass().getSimpleName());    // textBox is storing reference variable of remote webement object
		
		// Here find element() is also present in web driver and give webelement interface in return
		//driver.findElement(By.id("")); = it creates object of remote web element  class
		// textbox  = we are putting object reference in variable text box
		// WebElement textbox =  As findelement return interface then return type should be interface name so we use 
		//                       webelement before textBox as return type
		

//2.  Using send keys to input values	and send keys present in webekement interface	
		
	textBox.sendKeys("abc");    // this will put value in user name which was located by above written web element
		
	
	
	
//We can write above code in single line  without storing object reference in variable.
	
	driver.findElement(By.id("user")).sendKeys("abc");     // But here we have to write driver.findelement again and again.
	

		
		
		
	}

}
