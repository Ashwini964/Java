package readExcel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Table_values {

	public static void main(String[] args) {
	
		File file=new File("C:\\Users\\araghuram\\OneDrive - DXC Production\\Documents\\File4.xlsx");
		
		XSSFWorkbook wkbook=new XSSFWorkbook();
		XSSFSheet sheet=wkbook.createSheet("Sheet1");
		
		Row row;
		Cell cell;
		
		for(int i=0;i<=10;i++)
		{
		row=sheet.createRow(i);
		
		for(int j=0;j<=10;j++)
		{
			
		
		cell=row.createCell(j);
		cell.setCellValue((i+1)*(j+1));
		
	}}
		
		try {
			FileOutputStream excel1=new FileOutputStream(file);
			wkbook.write(excel1);
			//excel1.close();
			//wkbook.close();
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		

	}

}
