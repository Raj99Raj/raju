package Utils;

public class Excelutilsdemo {

	public static void main(String[] args) {
		
		Excelutils excel = new Excelutils("F:\\QSPYDER\\HRMS\\Excel\\data.xlsx", "Sheet1");
		excel.getRowCount();
       String un = excel.getCellDataString(1, 0);
		String pwd = excel.getCellDataNumber(1, 1);
		
	}

}
