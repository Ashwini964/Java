package arraylist;

import java.util.ArrayList;
import java.util.List;



public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Red");
		arr.add("Green");
		arr.add("yellow");
		arr.add("Orange");
		arr.add("Blue");
		arr.add("White");
		arr.add("Black");
		arr.add("Violet");
		
		System.out.println(arr);
		System.out.println(arr.get(6));
		arr.set(5, "White");             //List can have duplicate values.
		System.out.println(arr.get(5));
		//arr.clear();
		//arr.remove(4);
		//arr.remove("Red");
		
		System.out.println(arr.contains("Orange"));
		List<String> arr2=arr.subList(2, 5);
		System.out.println(arr2);
		//System.out.println(arr.subList(2,5));
		
		System.out.println(arr);

	}

}
