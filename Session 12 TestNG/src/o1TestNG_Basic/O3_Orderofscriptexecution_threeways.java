/* There are three ways to set execution order
 1. priority
 2. Using testNg suite file
 3. Using depends on method
*/

package o1TestNG_Basic;

import org.testng.annotations.Test;

public class O3_Orderofscriptexecution_threeways {
	
	
  @Test //(priority=3)               // it is commented to check through suite file
  public void demo() {
	  System.out.println("demo");
  }
  
  
  @Test//(priority=1)
  public void prototype() {
	  System.out.println("prototype");
  }
  
  
  @Test//(priority=2)
  public void dummy() {
	  System.out.println("dummy");
	  
	  
	  
  }
  
  
  
  
}
