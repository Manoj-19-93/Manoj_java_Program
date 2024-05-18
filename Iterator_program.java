package Sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_program {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		Iterator itr =al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
