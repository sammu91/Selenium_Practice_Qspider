package zzz_Practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class ViratKohli {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		driver.get("https://www.google.com/");
		
	
		WebElement txtbx = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		
              txtbx.sendKeys("Virat Kohli Birthday");
              
              Thread.sleep(2000);
              
             
             txtbx.sendKeys(Keys.DOWN, Keys.ENTER);
                         
              String DOB = driver.findElement(By.xpath("//span[contains(text(),'5 November 1988')]")).getText();             
              System.out.println(DOB);
               
              String[] DB = DOB.split("\\(");
               
              System.out.println(DB[0].trim());
              
              driver.close();
			
		}
		
		
		
		 
	}


