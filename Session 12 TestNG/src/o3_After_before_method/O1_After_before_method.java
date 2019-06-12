package o3_After_before_method;

import org.testng.annotations.*;


public class O1_After_before_method {

	
	
	@BeforeMethod
	public void BM(){
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AM(){
		System.out.println("After Method");
	}
	
	
@Test                   // script 1
public void first(){
	
	System.out.println("executed first script");
}

@Test                    //script 2
public void second(){ 
	
	System.out.println("executed second script");
}

	
	
	
	
	
	
	
	
}
