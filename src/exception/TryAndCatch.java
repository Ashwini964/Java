package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 abc();
 System.out.println("Hello World");
	}
	
	public static void abc()  
	{
		try {
			FileInputStream fi=new FileInputStream("Users/ashwini/downloads/abc.txt");
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch(Exception e2)
		{
			System.out.println(e2.getMessage());
		}
	}

}
