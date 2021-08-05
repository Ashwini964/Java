package arraylist;

import java.util.LinkedList;

public class LinkedListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var  list=new LinkedList<Double>();
		
		list.add(2.7);
		list.add(2.8);
		list.add(2.9);
		list.add(2.5);
		list.add(2.2);
		list.add(3.7);
		list.add(4.7);
		
		System.out.println(list.get(2));
		System.out.println(list);
		list.set(2,10.1);
		System.out.println(list.get(2));
		list.add(4, 30.2);
		System.out.println(list.get(4));
		System.out.println(list);

	}

}
