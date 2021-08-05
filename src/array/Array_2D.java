package array;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [][] arr= {{"A","B","C","D"}, {"AB","BA","CA"} ,{"MON","TUE","WED"}};   // A    B   C    D
		                                                                               // AB   BA  CA
	                                                                                  //MON   TUE WED
		System.out.println("Length of the array is "+arr.length);
		System.out.println(arr[1][0]);
		System.out.println(arr[2].length);
		System.out.println(arr[2][1]);
		arr[2][1]="SAT";
		System.out.println("Value is " +arr[2][1]);
	

	for (String[] x : arr)
	{ 
		for (String  y :x)
		{
			System.out.println(y);
		}
		System.out.println("---------------------------------");
	}
	}}
