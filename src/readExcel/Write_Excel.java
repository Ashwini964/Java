package readExcel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\araghuram\\OneDrive - DXC Production\\Documents\\File2.xlsx");
		XSSFWorkbook wkbook=new XSSFWorkbook();
		XSSFSheet sheet=wkbook.createSheet("Sheet1") ;
		Row row;
		Cell cell;
		row=sheet.createRow(0);
		cell=row.createCell(0);
		cell.setCellValue("Hello World");
		
		try {
			FileOutputStream excel=new  FileOutputStream(file);
			wkbook.write(excel);
			excel.close();
			wkbook.close();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
