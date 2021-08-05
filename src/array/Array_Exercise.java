package array;

public class Array_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1= {10,20,30,40,50};
		int j=arr1.length-1;
		
		for (int i=0;i<=(arr1.length)/2;i++)
		{
		int temp=arr1[i]	;
		arr1[i]=arr1[j];
		arr1[j]=temp;
		j--;
		
		}
		
		for(int n:arr1)
		{
			System.out.println(n);
		}
		

	}

}
