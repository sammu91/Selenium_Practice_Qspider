package o1_After_before_class;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;;


public class O2_Scenerio_After_Calss {
	WebDriver driver;
	
	@BeforeClass
	public void Setup(){
		System.out.println("Before class");
		System.setProperty("webdriver.chrome.driver", "./exefiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=173zsqzxvm8gz");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}

	@AfterClass
	public void TearDown (){
		System.out.println("After class executing");
		driver.close();
	}
	
	
	// 1. Create New User
	
	@Test
	public void CreateNewUser(){
		// login
		System.out.println("CreateNewUser");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		// Navigate to users and click on create new user page 
		driver.findElement(By.xpath("//div[text()= 'Users']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Create New User']")).click();
		
		//Create user page
		driver.findElement(By.name("username")).sendKeys("sumitsh2");
		driver.findElement(By.name("passwordText")).sendKeys("123456");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("123456");
		driver.findElement(By.name("firstName")).sendKeys("Sumit");
		driver.findElement(By.name("lastName")).sendKeys("Sharma");
		driver.findElement(By.name("email")).sendKeys("test2@gmail.com");
		driver.findElement(By.xpath("//td[@class='formbuttonpane']/input")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Logout
		driver.findElement(By.id("logoutLink")).click();
		}
	
	//2. Login As new user
	
	@Test (dependsOnMethods={"CreateNewUser"})
	public void LoginAsNewUser(){
		System.out.println("NewUserLogin");
		driver.findElement(By.name("username")).sendKeys("sumitsh2");
		driver.findElement(By.name("pwd")).sendKeys("123456");
		driver.findElement(By.id("loginButton")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Logout
		driver.findElement(By.id("logoutLink"));
	}
	
	
	//3. Delete New User
	
//	@Test
//	public void DeleteNewUser(){
//		System.out.println("DeleteNewUser");
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("loginButton")).click();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		// Navigate to users and click on create new user page 
//		driver.findElement(By.cssSelector("//div[text ()= 'Users']")).click();
		
	//}
}
