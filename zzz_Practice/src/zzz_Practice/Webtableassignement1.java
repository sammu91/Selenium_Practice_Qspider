package zzz_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtableassignement1 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		ChromeOptions Opt = new ChromeOptions();  
		Opt.addArguments("--start-maximized");   
		WebDriver driver = new ChromeDriver(Opt);
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		
		int rowcount=rows.size();
		System.out.println(rowcount);
		
		// for row loop
		for (int i =2; i<=rowcount;i++) {
			
	 List<WebElement> rowxp = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td"));
		
	      int colcount = rowxp.size();
		
			for (int h =2; h<colcount; h++) {
				String hd = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[1]/th ["+h+"]")).getText();
				System.out.println(hd);
				for(int j=2; j< colcount; j++) {
					
					WebElement colxp = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td ["+j+"]"));
					
					System.out.println(colxp.getText());
				}
			}
			
		
		}
		
		
		 
	}

}
