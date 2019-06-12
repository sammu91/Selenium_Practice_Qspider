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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

public class GoIbibibo {

	public static void main(String[] args)  {

		
		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		driver.get("https://www.goibibo.com/");
		
		
		
		WebElement From = driver.findElement(By.id("gosuggest_inputSrc"));
		
		// From field
		From.sendKeys("Delhi");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.attributeToBe(From, "aria-expanded", "true")); 
		 From.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		 
		 
		// Destination
		 WebElement Dest = driver.findElement(By.id("gosuggest_inputDest"));
			
		Dest.sendKeys("Bangalore");
		
		 wait.until(ExpectedConditions.attributeToBe(Dest, "aria-expanded", "true"));
		 Dest.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		 
		 
		 
		 
		 
		 // No. of adult selector
		 driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span")).click();
		 driver.findElement(By.id("fare_20190405")).click();
		 driver.findElement(By.id("pax_link_common")).click();
		 
		 // Loop till no. of adult is equal to 9 it will click plus sign till 9
		 while (true){
			 
			 String count = driver.findElement(By.id("adultPaxBox")).getAttribute("value");
			 
			 int adultcount = Integer.parseInt(count);
			 
			 if (adultcount==9) {
				 System.out.println(adultcount);
				 break;
			 }else {
				 driver.findElement(By.id("adultPaxPlus")).click();
			 }
		 }
		
		 
		 
		 
		 // Search button
		 driver.findElement(By.id("gi_search_btn")).click();
		
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[ @class='navSection_link' and @id='pricesFilter' ] ")));
		 
		 // Price slider
		 WebElement Pricefilter = driver.findElement(By.xpath("//a[ @class='navSection_link' and @id='pricesFilter' ] "));
		 
		 Actions act = new Actions(driver);
		 //Hover price
		 act.moveToElement(Pricefilter).perform();
		 
		// xpath of right slide button 
		 WebElement rightslider = driver.findElement(By.xpath("//div[@id='sliderFO']//div[@class='fltSld-handle fltSld-handle-1 '] "));
		 
		 
		 act.clickAndHold(rightslider).perform();  // holding button
		 act.moveByOffset(-100,0).perform();     // Drag and drop button to left on minus x axis. Button
		 act.moveToElement(Pricefilter).perform();
		 act.release(rightslider).perform();
		 
		 
		 
		
	}		 
	}


