package package1;

import java.util.ArrayList;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arr=new ArrayList(10);
		arr.add("Red");
		arr.add(1);
		arr.add("yellow");
		arr.add(3);
		arr.add("Blue");
		arr.add(4);
		arr.add(5);
		arr.add(6);
		
		System.out.print("Even Numbers:");
		for (int i=0;i<=10;i++)
			
		{
	        if( arr[i] % 2 == 0)
	            System.out.println(arr[i]+"\t");
	      
		}
		


	}

}
