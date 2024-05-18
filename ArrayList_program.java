package Sorting;

import java.util.ArrayList;

public class ArrayList_program {

	public static void main(String[] args) {
     ArrayList al = new ArrayList();
     
     ArrayList al2 = new ArrayList();
     
     al.add(100);
     al.add(1, 200);
     al.add("aaa");
     al2.add(300);
     al.addAll(al2);
     al.addAll(0, al2);
     System.out.println(al);
     System.out.println(al2);
     al.remove(0);
     al.removeAll(al2);
     al.remove("aaa");
     al2.clear();
     System.out.println(al2);
     boolean bol=al2.isEmpty();
     System.out.println(al);
     System.out.println(bol);
     int size=al.size();
     System.out.println(size);
     al.clone();
     System.out.println(al);
     boolean bol1=al.contains(100);
     System.out.println(bol1);
     
	}

}
