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

public class HDFC {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		driver.get("https://www.hdfcbank.com/");
		
		
		try {
			driver.findElement(By.id("//div[@id='div-close']")).click();
			driver.findElement(By.id("loginsubmit")).click();
			System.out.println("popup handles");
		}
		catch (NoSuchElementException e){
			
		driver.findElement(By.id("loginsubmit")).click();
			
			System.out.println("login hit");
			Thread.sleep(4000);
		}
			  Set<String> sessions = driver.getWindowHandles();
			System.out.println(sessions);
		Iterator<String> itr = sessions.iterator();
			
               String parentid = itr.next();
               String childid=itr.next();
		
               
               System.out.println("parent:  "+parentid+"  child: "+childid);
              
               driver.switchTo().window(childid);
             
               driver.findElement(By.xpath("//div[@class='container']/div[@class='pdtb25 text-center']/a[text()='Continue to NetBanking']")).click();
               
               driver.close();
               driver.switchTo().window(parentid);
               
               Thread.sleep(2000);
               System.out.println("element found");
              driver.findElement(By.xpath("//div[@class='selectedvalue' and text()='NetBanking']") ).click();
               
//               Actions act = new Actions(driver);
//               
//               act.click(dropdnxp).perform();
               
             driver.findElement(By.xpath("//li[@id='creditcardlogin']")).click();
              
              
               
               
              
               
              
               
               
			
		}
		
		
		
		 
	}


