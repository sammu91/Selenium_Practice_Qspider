package zzz_Practice;

public interface IntefaceTest {

	public int sum();
	
	public default int add(){
		int a= 3+2;
		return a;
	}
}
