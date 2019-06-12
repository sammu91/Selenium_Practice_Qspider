package o1_After_before_class;

import org.testng.annotations.*;


public class O1_After_before_Class {

	
	
	@BeforeClass
	public void BM(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AM(){
		System.out.println("After Class");
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
