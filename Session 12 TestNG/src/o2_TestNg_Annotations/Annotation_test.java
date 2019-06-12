package o2_TestNg_Annotations;

import org.testng.annotations.*;


public class Annotation_test {

	@BeforeSuite
	public void BS(){
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void AS(){
		System.out.println("After suite");
	}
	
	@BeforeTest
	public void BT(){
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void AT(){
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void BC(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AC(){
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void BM(){
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AM(){
		System.out.println("After Method");
	}
	
	
@Test
public void first(){
	
	System.out.println("executed first script");
}

	
	
	
	
	
	
	
	
	
}
