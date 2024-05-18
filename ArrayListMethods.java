package Sorting;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
	     	     
	     al.add(100);
	     al.add(1, 200);
	     al.add("aaa");
         System.out.println(al);
         System.out.println(al.get(0));
         String i = (String) al.set(2,"bbb");
         System.out.println(al);
         System.out.println(al.indexOf("bbb"));
	}

}
