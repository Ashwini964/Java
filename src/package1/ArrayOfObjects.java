package package1;

public class ArrayOfObjects {
	
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
		MyObject[] obj = new MyObject[8]; //array of size 20 
	//Object[] Obj= {"Ash",9,8,3,1,"Ram"};
		int[] obj1= {9,8,3,1,11,7,4};
		Object[] obj2= {"Ash","Ram","Raj"};
		System.out.print("Even Numbers:");
		for (int i=0;i<=obj1.length-1;i++)
			
		{
	        if( obj1[i] % 2 == 0)
	            System.out.println(obj1[i]+"\t");
	      
		}
	
		System.out.print("Odd Numbers:");
		for (int i=0;i<=obj1.length-1;i++)
			
		{
	        if( obj1[i] % 2!= 0)
	            System.out.println(obj1[i]+"\t");
	      
		}
	

		System.out.print("String:");
		for (int i=0;i<=obj1.length-1;i++)
			
		{
	            System.out.println(obj2[i]);
	      
		}
	
			 
	}

}

