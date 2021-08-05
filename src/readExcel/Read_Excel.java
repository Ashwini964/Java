package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\araghuram\\OneDrive - DXC Production\\Documents\\File1.xlsx");
		
		XSSFWorkbook wkbook;  //Creating the object of workbook
		XSSFSheet sheet;      //Creating the object of sheet
		
		try {
			
			FileInputStream excel=new FileInputStream(file); //Getting the excel sheet into input stream
			wkbook=new XSSFWorkbook(excel); //Using the excel instantiate the workbook object
			sheet=wkbook.getSheet("Sheet1"); //Using workbook object instantiating the sheet
			//System.out.println(sheet.getRow(2).getCell(3).getDateCellValue());
			//System.out.println(sheet.getRow(2).getCell(3).getStringCellValue());
			int start=sheet.getFirstRowNum(); //Row starts
			int end=sheet.getLastRowNum(); //Row ends
			for(int i=start; i<=end;i++) 
			{
				System.out.print(sheet.getRow(i).getCell(0).getStringCellValue()+ "\t");  
				System.out.print(sheet.getRow(i).getCell(1).getNumericCellValue()+ "\t");
				System.out.print(sheet.getRow(i).getCell(2).getBooleanCellValue()+ "\t");
				System.out.print(sheet.getRow(i).getCell(3).getDateCellValue());
			}
		} catch (IOException io)
		{
			System.out.println(io.getMessage());
		}

}}
