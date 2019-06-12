package parameterization;

import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

public class Parameters_test {
 
	
	
  @BeforeMethod
  @Parameters({"browser","baseURL"})
  public void Precondition(String Browsername, String Url ) {
	  
	  System.out.println(Browsername+","+Url);
  }

  
  
  @Test
  public void demo() {
	  System.out.println("demoscript");
  }
}
