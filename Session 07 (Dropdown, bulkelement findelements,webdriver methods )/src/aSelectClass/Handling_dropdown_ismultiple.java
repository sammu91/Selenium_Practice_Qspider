// Dropdwon can be hndle using select class only if dropdown is developed using select and optiosn html tag
// it has all non static method so need to create object

package aSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;            // it is a interface
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Handling_dropdown_ismultiple {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe"); 
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		// System.out.println(driver.getClass().getSimpleName());    used to get class name on execution
		driver.get("file:///C:/Users/SumitSh/Desktop/NSSW16.html");  
		
// dropdown Country
		
		WebElement drpdn = driver.findElement(By.name("Country"));   
		  
		
//Q1.  Select options present isnide dropdown
		
		Select sel = new Select (drpdn);  // we hav to enter webelement reference as argument.
		
		sel.selectByIndex(4);   // by index starts from 0
		sel.selectByValue("5");   //  Value shown in html doc will be quotes
		sel.selectByVisibleText("Japan");// value of dropdown
		
// For multiple select dropdown		
	     
		WebElement drpdn2 = driver.findElement(By.name("Courses")); 
		Select sel2 = new Select (drpdn2);
		sel2.selectByIndex(2);
		sel2.selectByValue("2");
		sel2.selectByVisibleText("Selenium");
	
		sel2.deselectByIndex(2);
		sel2.deselectByValue("2");
		sel2.deselectByVisibleText("Selenium");

		
		driver.close();
	}	

}






