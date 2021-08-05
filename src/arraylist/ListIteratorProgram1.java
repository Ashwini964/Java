package arraylist;

import java.util.ArrayList;

import java.util.ListIterator;

public class ListIteratorProgram1 {

	public static void main(String[] args) {
		
		var list=new ArrayList<Double>();
		list.add(1.7);
		list.add(2.7);
		list.add(2.8);
		list.add(2.9);
		list.add(2.5);
		list.add(2.2);
		list.add(3.7);
		list.add(4.7);
		
		ListIterator itr=list.listIterator(); //to  specify externally from where iteration has to start--ListIterator itr=list.listIterator(1);
		
		while(itr.hasNext()) {
			
		
		System.out.println(itr.next());
		}
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
