package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowableExceptionHandling {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		abc();
		
//System.out.println("Hello World");
	}
	
	public static void abc() throws IOException 
	{
		FileInputStream fi=new FileInputStream("Users/ashwini/downloads/abc.txt");
	}

}
