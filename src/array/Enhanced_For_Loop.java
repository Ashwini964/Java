package array;

import java.util.Scanner;

public class Enhanced_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number");

		int num1=s1.nextInt();
		
		int [] arr1=new int [10];
		
		for (int i=1;i<=10;i++)
		{
			arr1[i-1]=num1+i;
			
		}
		
		System.out.println("-----------------------");
		
		for(int n:arr1)  //for every element :collection of element
		{
			System.out.println(n);
		}
	}

}
