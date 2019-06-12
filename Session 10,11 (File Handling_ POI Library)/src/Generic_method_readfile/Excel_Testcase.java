package Generic_method_readfile;

public class Excel_Testcase {

	public static void main(String[] args) {

		// 	adding excel file giveing value to filepath
		Excel_lib elib= new Excel_lib("C://Users//SumitSh//Desktop//Sel//APCHE POI/excel Practice.xlsx");
		
		
		
		String string = elib.readdata("Sheet1_string", 2, 1);
		System.out.println(string);
		
		String numeric = elib.readdata("Numeric", 2, 1);
		System.out.println(numeric);
		
		String Boolean=elib.readdata("Boolean", 0, 0);
		System.out.println(Boolean);
	}

}
