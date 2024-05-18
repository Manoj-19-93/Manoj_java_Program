package Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class List_Set_Difference {

	public static void main(String[] args) {

       ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(null);
		al.add(null);   //List accepts duplicate values
		System.out.println(al);
		
		ListIterator itr =al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

		Set s = new HashSet();
		s.add('a');
		s.add('b');
		s.add('c');
		s.add(null);
		s.add(null);   //set donot accept duplicate values
		System.out.println(s);
		Iterator itrs = s.iterator();
		while(itrs.hasNext())
		{
			System.out.println(itrs.next()); //it can iterate only in forward directon because here we donot have Listiterator and also it donot store value based on index
		}
		
	}

}
