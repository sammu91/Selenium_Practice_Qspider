// creating multiple script in testng class
// by default order of scripts are in alphabetically order of their methods name

package o1TestNG_Basic;

import org.testng.annotations.Test;

public class O2_Batchexecution_suitefile {
	
	
  @Test
  public void demo() {
	  System.out.println("demo");
  }
  
  
  @Test
  public void prototype() {
	  System.out.println("prototype");
  }
  
  
  @Test
  public void dummy() {
	  System.out.println("dummy");
  }
  
  
  
  
}
