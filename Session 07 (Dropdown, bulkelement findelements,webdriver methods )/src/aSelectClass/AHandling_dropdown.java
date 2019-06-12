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

public class AHandling_dropdown
{
// method to check is multiple and can reuse again and again
	
	public static boolean verifydrpdn (WebElement drpdn){
		Select sel = new Select (drpdn);
		boolean flag = sel.isMultiple();
		return flag;
		
	}
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe"); 
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		// System.out.println(driver.getClass().getSimpleName());    used to get class name on execution
		driver.get("file:///C:/Users/SumitSh/Desktop/NSSW16.html");  
		

		// first dropdown
		WebElement drpdn1 = driver.findElement(By.name("Country"));  
		
		boolean flag1 = verifydrpdn(drpdn1);
		
		  System.out.println(flag1);  
		  
		  // second dropdown
		  WebElement drpdn2 = driver.findElement(By.name("Courses"));  
			
			boolean flag2 = verifydrpdn(drpdn2);
			
			  System.out.println(flag2);
		

		driver.close();
	}	

}






