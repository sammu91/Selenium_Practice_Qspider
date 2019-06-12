package zzz_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Paytm_Assignment {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		driver.get("https://paytm.com/");
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='_1Vt1']//div[@class ='_3ac-']")).click();
		 
		 Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='qrcode-footer-text']/span")).click();
		
	
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9560439101");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@class='md-raised md-primary btn-new mt-20 login-btn md-button ng-scope md-default-theme']")).click();
		
		// because cross in outside iframe means in default content
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='_1AkQ']/a")).click();
		
		
		
	}

}
