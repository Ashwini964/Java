package arraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var list=new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(21);
		list.add(78);
		list.add(97);
		list.add(56);
		list.add(31);
		list.add(77);
		list.add(1);
		
		ListIterator itr=list.listIterator();
		
		while (itr.hasNext())
		{
		int i=(int) itr.next();
		
		if(i%2==1)
		{
			i=i+1;
			itr.set(i);
		}
		
		}
		
		System.out.println(list);
		
		

	}

}
