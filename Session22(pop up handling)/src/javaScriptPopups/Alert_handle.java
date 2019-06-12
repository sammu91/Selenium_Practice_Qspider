package javaScriptPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		String Contbtn_XP="//div[@id='banner']//a[starts-with(text(),'CONTINUE')]";
		
		driver.findElement(By.xpath(Contbtn_XP)).click();
		driver.findElement(By.id("Button2")).click();
		
		Alert alt = driver.switchTo().alert();
		String alerttxt = alt.getText();
		System.out.println(alerttxt);
		
		alt.accept();
		
		// or
		
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.id("username")).sendKeys("abc");
	
		
		
	}

	
}
