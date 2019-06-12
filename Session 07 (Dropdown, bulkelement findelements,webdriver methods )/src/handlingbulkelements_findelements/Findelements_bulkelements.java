// Find elements

package handlingbulkelements_findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Findelements_bulkelements {
	
			public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe"); 
				ChromeOptions Opt = new ChromeOptions();  
				Opt.addArguments("--start-maximized");   
				WebDriver driver = new ChromeDriver(Opt);
				
				// 
			driver.get("http://istqb.in/");  
			
			
// Q1 : To find all the links present inside the webpage
			
		  List<WebElement> links = driver.findElements(By.tagName("a"));    // findlements have list<webelemnts> return type
			
		        int count= links.size();             // size() is a method of list interface
		        System.out.println(count);
	
		        
		        
/* Q2. To print all the link text present inside the web page
		        
		     // Note : some links doesn't displayed or link doesn' have text so it print blank
		        
		        for (int i = 0; i<count;i++) {
		        	
		        	WebElement eachlinks = links.get(i);
		        	
		        	String linktext = eachlinks.getText();
		        	
		        	System.out.println(linktext); 
		        } */
		        
// Q3. Print link text which is displayed using if else statement
		        
		        // Some displayed link doen't have text so it will print blank list like image has link but no text 
		        
		        int displaycount = 0;
		        int Notdisplaycount = 0;
		        
		        
		        for (int i = 0;i<count; i++) 
		        {
		        	
		        if(links.get(i).isDisplayed()){
		        	displaycount++;
		        	String linktext = links.get(i).getText();
		        	System.out.println(linktext);	        	
		        }
		        else {
		        	Notdisplaycount++;
		        }
		        }
		        
		        System.out.println("Total links dispalyed: " + displaycount);
		        System.out.println("Total links not displayed" + Notdisplaycount);
		       	
		        
// Q4. Difference b/w findelement and findelements	> if elment not found findlement gove blank list and oesn't give any exception
		        
		        driver.get("file:///C:/Users/SumitSh/Desktop/NSSW16.html");  
		       
		      // FindElement
		        try {
		        	driver.findElement(By.tagName("Span"));
		        	System.out.println("Elementfound");
		        }
		        catch (NoSuchElementException e){
		        	
		        	System.out.println("Element Not found");
		        }
		        
		     // FindElements   
		        
		        List<WebElement> Wbs = driver.findElements(By.tagName("Span"));
		        
		        boolean flag = Wbs.isEmpty();
		        System.out.println(flag);
		        
		        if (flag) {   // true
		        	
		        	System.out.println("empltylist");
		        }
		        else {
		        	System.out.println("list is not empty" + Wbs.size());
		        }
		        
		        
		        driver.close();
	}

}
