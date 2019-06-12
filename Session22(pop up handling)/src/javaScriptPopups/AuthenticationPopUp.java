package javaScriptPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("http://portal.futuresoftindia.com/DashBoard.aspx");
		
		// adding username and pwd in url
		//syntax:https;;//UN:PWD@URl 
		
		
		driver.get("http://sumitsh:Way2hell@portal.futuresoftindia.com"); 
		
		driver.switchTo().alert().sendKeys("sumitsh"+Keys.TAB+"Way2hell");
		driver.switchTo().alert().accept();
	
		
		System.out.println("script run");
		
		
	}

}
