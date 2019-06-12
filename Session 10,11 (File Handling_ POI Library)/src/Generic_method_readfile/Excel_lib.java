 package Generic_method_readfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class Excel_lib {

	
	String filepath;                                       // variable for file path
	
	
	public Excel_lib (String filepath)                  // Method for filepath  
	 {
		  this.filepath=filepath;
	 }
	
	
	public String readdata (String sheet, int Row, int Cell) 
	
	{
		String value = null;
		Workbook Wb = null;
		
		try {
			File file = new File (filepath);
		    FileInputStream fis = new FileInputStream(file);            // Exception FileNotFoundException (parent io exception)
		    
		    
		    if (filepath.contains(".xlsx"))                            // condition for xlsx or xls file
		    {
		    	Wb = XSSFWorkbookFactory.create(fis);                   // Exceptions EncryptedDocumentException, IOException
		    }
		    
		    else if (filepath.contains(".xls"))
		    {
		    	Wb=HSSFWorkbookFactory.create(fis);                     // HSS for xls and XSS for xlsx
		    }
			
		
		    
		    
		    Sheet sh = Wb.getSheet(sheet);                            // Get sheet name
		    Row rw = sh.getRow(Row);                                  // Get row with using row index
		    Cell cl = rw.getCell(Cell);                               // Get cell value
		  
		    
		    switch (cl.getCellType())
		    {
		    case STRING:                                                   // name or email id
		    	value= cl.getStringCellValue();
		    	break;
		    	
		    	
		    case NUMERIC:                                                   // Phone no. or pincode or date
		    	if (DateUtil.isCellDateFormatted(cl))
		    	{
		    		SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyy");
		    		value=sdf.format(cl.getDateCellValue());
		    	}
		    	else 
		    	{
		    		long numvalue = (long)cl.getNumericCellValue();             // downcast to long from double
		    		value=Long.toString(numvalue);                             // need to convert any numeric value in string using wrapper class
		    	}
		    	break;
		    	
		    	
		    case BOOLEAN:                                                  // for boolean case
		    	
		    	value=Boolean.toString(cl.getBooleanCellValue());
		    	break;
		    	
		    default:
		    	System.out.println("cell Format is not matching");
		    	break;
		    }
		}
	    catch (EncryptedDocumentException e) 
		{
	    	e.printStackTrace();                                         // will print full detail of exception at runtime
	    	System.out.println(e.getClass().getSimpleName());
	    }
	    catch(IOException e)
		{
	    	e.printStackTrace();
	    	System.out.println(e.getClass().getSimpleName());
		}
	
	
		
		return value;
	}                        // here main method ends
	
	
}
