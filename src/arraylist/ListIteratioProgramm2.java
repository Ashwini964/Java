package arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratioProgramm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(null);
		list.add(null);
		list.add(20);
		list.add(null);
		list.add(37);
		list.add(47);
		
		ListIterator itr=list.listIterator();
		
		while (itr.hasNext())
		{
			if(itr.next()==null)
			{
				//itr.remove();
				itr.set(0);
				System.out.println(list);
			}
		}
	}

}
