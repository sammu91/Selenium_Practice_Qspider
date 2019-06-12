package Write_Data_excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {

	public static void main(String[] args)  {

		// Creating xlxs file dta
		
	
	try {

		File file = new File ("./Excel/report.xlsx");         // create folder and add path and xlx name also
		
		FileOutputStream fos = new FileOutputStream(file);
		
		Workbook Wb = new XSSFWorkbook();  //  upcasting  not using  create () as not using workbook factory
		
		Sheet sh = Wb.createSheet("Scorecard");
		
		Row rw = sh.createRow(2);
		
		Cell cl = rw.createCell(3, CellType.STRING);
		
		cl.setCellValue("india scored 389-9");
		
		Wb.write(fos);
	}
		catch (IOException e){
			
			e.printStackTrace();
		}
		
	System.out.println("Data written sucessfully");
		
		
		
	}

}
