// Webelement have many abstract methods and all are non static

package session_6_Webelements_Enumeration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;            // it is a interface
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
		  
		
		
		
//Q1.  Clear() > to clear data from text box
		
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
		
	  

//Q7.  getLocation() <point class> : to find location of webelement present inside web page.
		
		Point pt = driver.findElement(By.tagName("img")).getLocation();
	
		System.out.println(pt);
		// or
		int x = pt.getX();   // giving x and y coordinate
		int y = pt.getY();
		
		System.out.println("image location is: "  + x + "," + y);
		
		
		
// Q8.  isDispalyed() <boolean> : to find whether the webelement is displayed in the webpage or not.
		// means present in source code not in web page
		
		
		     WebElement lgnBtn = driver.findElement(By.cssSelector("input[value = 'LOGIN'"));
		
		     boolean flag = lgnBtn.isDisplayed();    // will give value in true and false
		 
		     System.out.println(flag);
		     
		     // usage
		
		     if (flag)
		     {
		    	 System.out.println("dispalyed");
		    	 lgnBtn.click();
		     }
		     else {
		    	 System.out.println("not displayed");
		     }
		     
		     
// Q9. How to verify webelement present in Html doc or not. > using try and catch block.
		     
		     try {
		    	 driver.findElement(By.tagName("span"));
		    	 System.out.println("element found");
		     }
		     catch (NoSuchElementException e) {
		    	 System.out.println("Element not found");
		     }
		     
		     
// Q10. isSelected() <Boolean>  : to verify whether checkbox is selected or not.
		

	     WebElement ckbx = driver.findElement(By.className("MyCheckbox"));
	
	     boolean flag1 = ckbx.isSelected();    // will give value in true and false
	 
	     System.out.println(flag1);
	     
	     // usage
	
	     if (flag1)
	     {
	    	 System.out.println("Already selected");
	    	 
	     }
	     else {
	    	 System.out.println("not selected");
	    	 ckbx.click();

	    	 
// Q11. isEnabled() <Boolean> : to verify webelement is enabled or disabled. 
	    	 
// Q12. submit() : use for buttons having type submit instead of click().
	    	 
	     }
		driver.close();
	}	

}






