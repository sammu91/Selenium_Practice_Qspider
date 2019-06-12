// Webelement have many abstract methods and all are non static

package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;            // it is a inter face
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webelement_methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe"); 
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		// System.out.println(driver.getClass().getSimpleName());    used to get class name on execution
		driver.get("file:///C:/Users/SumitSh/Desktop/NSSW16.html");  
		

		WebElement textBox = driver.findElement(By.id("user"));   
		  
		
		
		
/*Q1.  Clear() > to clear data from text box
		
		textBox.sendKeys("abc"); 
		Thread.sleep(2000);
		
		textBox.clear();
		
		
//Q2.   Keys >  its a enumeration for all keyboard keys , we can clear data without using clear()
		
		textBox.sendKeys("without using clear()"); 
		Thread.sleep(2000);
		
		textBox.sendKeys(Keys.CONTROL+"a");
		textBox.sendKeys(Keys.DELETE);
		
		Thread.sleep(2000);
		textBox.sendKeys("guddu");
		
		
//Q3. getText() > to get html text from webelement' and its return type is string
	
		WebElement Text = driver.findElement(By.tagName("h1"));
	
		String h1tx = Text.getText();
		System.out.println(h1tx);
	     
		    //  OR
		
	  String lnktx = driver.findElement(By.tagName("a")).getText();   // Jo end mein method hoga uska is return type ayega

		System.out.println(lnktx);
	
		
		
//Q4. 	getAttribute() > to get attribute value from the webelement
		//<input type="password" placeholder="enter password" maxlength="9" value="" name="pwd">
		
		 WebElement PwdTx = driver.findElement(By.name("pwd"));	
		
		     String value1 = PwdTx.getAttribute("placeholder");      // This will return value of placeholder
		     System.out.println(value1);                             // will show enter password
		    
		     
		     // We can check what we enter and what we get in value field of pwd
		     // Here max length is 9 an we try to enter more than that and check but value inserted in pwd field
		     
		     PwdTx.sendKeys("123456789012345");  // we are inserting more than 9 character
		     
		    String value2 = PwdTx.getAttribute("value");       // here we get what value inserted in password field
		     System.out.println(value2);                       // This will give 1 to 9 values as max length is 9.

		     
//Q5. 	getCssValue() > to get css attribute value > there is default CSS attribute in HTML like color, font size etc.
		     
 		     //<h1>Welcome to Automation</h1>
		     
		    String CSSvalue1 = driver.findElement(By.tagName("h1")).getCssValue("font-size");   // will give result in px.
		    System.out.println(CSSvalue1 );
		    
		  
		    

//Q6. 	getSize() <dimension class>: to find dimension of webelement return type is dimension
		   
		// a. dimension of element
		   Dimension dim = driver.findElement(By.tagName("img")).getSize();
		
		System.out.println("image width : "+ dim.getWidth() + " and image height : " + dim.getHeight() );
		
		// b. To find total page height > use body tag name

		int pageht = driver.findElement(By.tagName("body")).getSize().getHeight();   // here last method is height so return type as per ht method
		System.out.println(pageht);
		
	  */

//Q7.  
	
		driver.close();
	}	

}
