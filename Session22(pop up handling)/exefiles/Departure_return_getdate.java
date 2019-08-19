package calendarpopup;

import java.time.LocalDate;


public class Departure_return_getdate {

	public static void main(String[] args) {


		LocalDate currentdate = LocalDate.now();
		System.out.println("current date: "+currentdate);
		
		
		LocalDate departuredate = LocalDate.now().plusMonths(3).plusDays(1);
		System.out.println("departure date m3 d1: "+departuredate);
		
		int selectDepDate = departuredate.getDayOfMonth();
		int selectDepMonth = departuredate.getMonthValue();
		String selectDepMonthName = departuredate.getMonth().name();
		
		
		String monthLower = selectDepMonthName.toLowerCase();
		String required = monthLower.substring(0,1).toUpperCase()+monthLower.substring(1);
		
		
		int selectDepYear = departuredate.getYear();
		
		
		System.out.println("selectDepDate: "+selectDepDate);
		System.out.println("selectDepMonth: "+selectDepMonth);
		System.out.println("selectDepMonthName: "+selectDepMonthName);
		System.out.println("monthLower: "+monthLower);
		System.out.println("required: "+required);
		System.out.println("selectDepYear: "+selectDepYear);
		
		
		LocalDate returnDate = LocalDate.now().plusMonths(6).plusDays(26);
		System.out.println("returnDate: "+returnDate);
		
	}

}
