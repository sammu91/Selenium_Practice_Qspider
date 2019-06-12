package zzz_Practice;

public class ClassTest implements IntefaceTest {

	public static void main(String[] args) {
		ClassTest CT = new ClassTest();
		

		System.out.println(CT.add());
		
		System.out.println(CT.sum());
	}
	
	
	@Override
	public int sum() {
		int s=999999999+2;
		return s;
	}
	
	
 
	

}
