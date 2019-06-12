package A_readFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;

public class Readexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		

		File file = new File ("C://Users//SumitSh//Desktop//Sel//APCHE POI/excel Practice.xlsx");
	
		FileInputStream fis = new FileInputStream(file);     // Throw exception "FileNotFoundException"  and 
		                                                     //IO exception is its parent so no need to handle if handled IUO exception 
		
	
//Q1.   Read string data from excel sheet.  getstringcellvalue().
		
		
		Workbook wb = new WorkbookFactory().create(fis);     // EncryptedDocumentException, IOException
		 Sheet sh = wb.getSheet("Sheet1_string");           //  method in workbook and argument has sheet name
		 Row rw = sh.getRow(1);                            //   enter row index value and it starts with 0
		 Cell cl = rw.getCell(1);                         //    enter cell index value and it starts with 0
		 
		 
		 String cellvalue = cl.getStringCellValue();   // methods of cell interface
		 
		 System.out.println(cellvalue);               // will print value whose row and cell index is 1
		 

		 
		 
//Q2. 	Read numeric value	 from excel sheet.
		 
		Sheet sh1 = wb.getSheet("Numeric");
		System.out.println(sh1.getSheetName());
		
		Row rw0 = sh1.getRow(0);
		Cell cl0 = rw0.getCell(1);
		 
		double number = cl0.getNumericCellValue();    // BY default numeric return type is double
		System.out.println(number);                  // It will display 1234 as 1234.50 we have to downcast in to int for excat value
		
		
		int exactvalue = (int) number;             // downcasting or narrowing to int from double	
		System.out.println(exactvalue);
		      
		      // OR
		int exactvalue2 = (int) cl0.getNumericCellValue();
		 System.out.println(exactvalue2);
		 
		 
		 
    // For price value use double
		 Row rw1 = sh1.getRow(1);
		Cell cl1 = rw1.getCell(1);
		 
		double Price = cl1.getNumericCellValue();
		System.out.println(Price);
		 
		 
		 
   // For phone number 
		 Row rw2 = sh1.getRow(2);
		 Cell cl2 = rw2.getCell(1);
		 
		 long phoneno = (long)cl2.getNumericCellValue();    // downcasting from double to long
		 System.out.println(phoneno);
		 
		 
		 
		 
   // For DATE	 > Getdatecellvalue
		 Row rw3 = sh1.getRow(3);
		 Cell cl3 = rw3.getCell(1);
		 
		 Date date = cl3.getDateCellValue();
		 System.out.println(date);                      // will print date acc. to date class
		 
       // to print acc. to date format use SimpleDateFormat class 
		 
		 SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyy");
		 String Dateformat = SDF.format(date);
		 System.out.println(Dateformat);
		 

		 
//Q3.   getbooleancellvalue() >  Script to read boolean value from excel sheet.
		 
		 Sheet sh3 = wb.getSheet("Boolean");
		 Row rwB = sh3.getRow(0);
		 Cell clB = rwB.getCell(0);
		 
		 boolean flag = clB.getBooleanCellValue();
		 System.out.println(flag);                      // always give true and false value in small letter.
		 
		 
		 
		 
//Q4.   getnumberofsheets() > To find total no. of sheets		 
		 
		 int sheetcount = wb.getNumberOfSheets();
		 System.out.println("Total no. of sheets : " + sheetcount);
		 
		 
		 

//Q5.  getsheetname> Script to print all sheets name and getsheet at method use sheet index no. and get location or info of sheet
		 
		System.out.println(wb.getSheetAt(1));
		
		//Iterate all sheet name
		 
		for (int i=0;i<sheetcount;i++ ) {
			
			String allsheetnames = wb.getSheetAt(i).getSheetName();
			System.out.println(allsheetnames);
		}
		 
		 
//Q6.   getlastrownum() > to find no. of row count present inside sheet		 
		 
		  Sheet sh_rw = wb.getSheet("Sheet1_string");
		 int row_count = sh_rw.getLastRowNum();
		 
		  System.out.println("total row count of sheet sheet1 is: "+ row_count);  // it will always give count one less as it not count header
		 
		 
		 
//Q7.   getlastcellnum() > to find no. of column present inside each row.
		 
		 for (int i = 0; i<= row_count;i++) {                                         // row count give one value less so we put is equal to 
			 
			 Row row = sh_rw.getRow(i);
			  
			 int cellcount = row.getLastCellNum();     // its default is short , we can write int also in widening or upcasting we don't need to cast
			 
			 System.out.println("Row: " + i + "total cells in each row : " + cellcount);
		 }
			 
			 
				 
//Q8.   Print all	data from each row and each column.
		 
		 for (int i=0;i<=row_count;i++) {
			 
			 Row row = sh_rw.getRow(i);
			  
			 long cellcount = row.getLastCellNum(); 
			 System.out.println("Row have:" + i + " ,total cells in row is : " + cellcount);
			 
			 
			 for(int j=0; j<cellcount; j++) {
			 
				 String eachcellvalue = row.getCell(j).getStringCellValue();
				 
				 System.out.println( eachcellvalue);
			 }
			 
		 }
		 
		 
		 
		 
		 
		 
}
}
