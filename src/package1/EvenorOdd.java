package package1;

import package1.EvenorOdd.MyObject;

public class EvenorOdd {
	
	public class MyObject{ 
		 
		public MyObject(String string) {
			// TODO Auto-generated constructor stub
		}
		//public String myString; 
		//public Integer myInteger;  
 
		}  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		//To create an Array: 
		int[] arr = new int[8]; //array of size 20 
	//Object[] Obj= {"Ash",9,8,3,1,"Ram"};
		int[] arr1= {9,8,3,1,6};
		
		System.out.println("Even Numbers:");
		for (int i=0;i<=arr1.length-1;i++)
			
		{
	        if(arr1[i] % 2 == 0)
	       
	System.out.println( arr1[i]);
		}
	
		System.out.println("Odd Numbers:");
		for (int i=0;i<=arr1.length-1;i++)
			
		{
	        if(arr1[i] %2 != 0)
	       
	System.out.println( arr1[i]);
		}
	
		
	
			 
	}

}

