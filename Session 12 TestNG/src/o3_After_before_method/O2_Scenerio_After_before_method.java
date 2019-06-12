// Scenerio 2 Use of before and after class

package o3_After_before_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class O2_Scenerio_After_before_method {

	WebDriver driver;           // declaring driver
	
	
	// Launch browser and nav. to URL
	@BeforeClass
	public void precondition(){
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=173zsqzxvm8gz");
		}
	
	// Close Browser
	@AfterClass
	public void AM(){
		System.out.println("After Class");
		driver.close();
	}
	
	
	
	
// following are the three scenerios and after and before method will execute for three test suits
	
@Test     (priority=1)             
public void VerifyLandingPage(){
	
	System.out.println("VerifyLandingPage");
	System.out.println(driver.getTitle());
}
	



@Test (priority=2)
public void ValidLogin(){
	
	System.out.println("ValidLogin");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
}


@Test (priority=3)
public void InvalidLogin(){
	
	System.out.println("InvalidLogin");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("1234");
	driver.findElement(By.id("loginButton")).click();
}





}
