/* when script is dependent on another script then we use depends on methods
*/

package o1TestNG_Basic;

import org.testng.annotations.Test;

public class O4_dependonmethods {
	
	
  @Test              
  public void create_customer() {
	  System.out.println("customer created");
  }
  
  
  @Test(dependsOnMethods="create_customer")    // this method depends on above if above fail this will skip
  
  public void create_project() {
	  System.out.println("project created");
  }
  
 
  
  
  
}
