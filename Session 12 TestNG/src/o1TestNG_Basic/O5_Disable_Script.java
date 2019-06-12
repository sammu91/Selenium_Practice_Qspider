/* There are three ways to set execution order

 1. By using comment statements  (recommended)
 2. By using enabled=false
 3. BY using testing suite file  
 		we can use exclude method name or just write included method name but we don't use both at sam time
*/

package o1TestNG_Basic;

import org.testng.annotations.Test;

public class O5_Disable_Script {
	
	
  @Test  (enabled=false)          // this will not execute         
  public void demo() {
	  System.out.println("demo");
  }
  
  
  @Test
  public void prototype() {              // This will not execute from suite because we use exclude statement
	  System.out.println("prototype");
  }
  
  
  @Test
  public void dummy() {
	  System.out.println("dummy");
	  
	  
	  
  }
  
  
  
  
}
