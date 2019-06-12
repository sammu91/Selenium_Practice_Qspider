/* Invocation count use to run single script multiple times
*/

package o1TestNG_Basic;

import org.testng.annotations.Test;

public class O6_Script_run_multiple_times {
	
	
  @Test   (invocationCount = 10, invocationTimeOut = 2000)    //  check copy for this          
  public void demo() {
	  System.out.println("demo");
  }
  
  // Or
  
  @Test (invocationCount=5,timeOut=100000)  //   in this we total time to execute whole 5 suits
  public void prototype() {
	  System.out.println("prototype");
  }
  
  
  @Test
  public void dummy() {
	  System.out.println("dummy");
	  
	  
	  
  }
  
  
  
  
}
