package handlingbulkelements_findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class A_Getoptions_listwebelements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe"); 
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		// System.out.println(driver.getClass().getSimpleName());    used to get class name on execution
		driver.get("file:///C:/Users/SumitSh/Desktop/NSSW16.html");  
		
		
//Q1. 	getOptions() <list<webelements>>: to find total no. of options present inside dropdown.
		
		   WebElement drpdn = driver.findElement(By.name("Courses"));
		   
		   Select sel = new Select(drpdn);
		   
		   List<WebElement> options = sel.getOptions();  // lis<webelement> interanlly work as lit and can call list methods 
		   
		   int optionscount=options.size();             // siz() is a list method
		   System.out.println(optionscount);
		   
		   
// Q2. Print or retrieve the options text from all the options.  (using for loop and using list methods)
		
		   for(int i=0; i<optionscount;i++) {               // here i = 0 as in list index start from 0
			   
			   WebElement eachoptions = options.get(i);     // get webelemnt 
			   
			   String optiontext = eachoptions.getText();   // get text value of each option.
			   System.out.println(optiontext);
			   
			   // Or
			   String optiontext2= options.get(i).getText();
			   System.out.println(optiontext2);
		   }
			   
// Q3. script to select and deselect all the options present inside the dropdown	
		 	   
		   
	  // Select all options	   
		   for(int i = 0; i < optionscount;i++)
		   {
			   sel.selectByIndex(i);
		   }
		  
		 
		   
     // first selected option method
		   String firstselected = sel.getFirstSelectedOption().getText(); 
		  
		   System.out.println("first selction vlue is : " + firstselected);
		   
		   
		   
	// All selected options
		     
		  System.out.println("Value from all selected value is: " + sel.getAllSelectedOptions().get(2).getText());
		  
		  
		  
		   
	// Deselect all	   
		   for(int j = optionscount-1; j>=0;j--)    // option count = 7 so last index is 6
		   {
			sel.deselectByIndex(j);
			// OR 
			//sel.deselectAll();    // this method deselectall from top to bottom
		   }
			   
		   
		   driver.close();
	}

}