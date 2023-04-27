package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	    static XSSFWorkbook workbook;
	    static XSSFSheet sheet;
	    
	    
	    public Excelutils( String excelpath, String sheetname) {
	    	try {
	    	 workbook= new XSSFWorkbook( excelpath);
	 		sheet = workbook.getSheet(sheetname);
	    	}catch(Exception e ) {
	    		e.printStackTrace();
	    	}
	    }
	    
	    
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString(1,0);
		getCellDataNumber(1,1);
		
	}
	public static void getRowCount() {
		try {
	   
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("no of row : "+rowcount);
		
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}

}
	public static String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
	    try{
		
		 cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(cellData);
		
		
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
}
		return cellData;
		
		
	}
	public static String getCellDataNumber(int rowNum, int colNum) {
		String cellData=null;
	    try{
		
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(cellData);
		
		
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
}
		return cellData;
		
	}
}
