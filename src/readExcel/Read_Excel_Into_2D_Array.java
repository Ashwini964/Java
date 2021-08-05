package readExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Into_2D_Array {

	public static void main(String[] args) {
		
		
		Object arr2[][]=ReadExcelData();
		System.out.println(arr2[1][1]);
		System.out.println(arr2[3][1]);
		System.out.println(arr2[4][1]);
		
	}
	
	public static   Object[][] ReadExcelData()
	{
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\araghuram\\OneDrive - DXC Production\\Documents\\File1.xlsx");
		XSSFWorkbook wkbook;
		XSSFSheet sheet;
		Object [][] arr=new  Object[0][0];
		
		try {
			
		
		FileInputStream excel=new FileInputStream(file);
		wkbook =new XSSFWorkbook(excel);
		sheet=wkbook.getSheet("Sheet1");
		int start=sheet.getFirstRowNum();
		int last=sheet.getLastRowNum();
		arr=new Object[last-start+1][4]; //12 rows 4 colums--Reinitialize
		
for (int i=start;i<=last;i++)
{

	arr[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	arr[i][1]=sheet.getRow(i).getCell(1).getNumericCellValue();
	arr[i][2]=sheet.getRow(i).getCell(2).getBooleanCellValue();
	arr[i][3]=sheet.getRow(i).getCell(3).getDateCellValue();
			
}}catch (Exception e)
{
		
		
	System.out.println(e.getMessage());
		
		
		
	}
return arr;
}}
