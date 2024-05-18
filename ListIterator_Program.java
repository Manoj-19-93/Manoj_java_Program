package Sorting;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Program {

	public static void main(String[] args) {

ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		ListIterator itr =al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
