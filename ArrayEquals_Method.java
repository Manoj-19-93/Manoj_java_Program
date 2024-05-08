package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals_Method {

	public static void main(String[] args) {
     
		Scanner s1 = new Scanner (System.in);
		System.out.println("Starting of First Array");
	     int rollno[]=new int[3];
	     for(int i=0;i<3;i++)
	     {
	    
	       System.out.println("Enter the Array->");
	       rollno[i]=s1.nextInt();
	       
	     }
	    System.out.println("Starting of Second Array");
	     int rollno1[]=new int[3];
	     for(int i=0;i<3;i++)
	     {
	    
	       System.out.println("Enter the Array->");
	       rollno1[i]=s1.nextInt();
	       
	     }
	     System.out.println(Arrays.toString(rollno));
	     System.out.println(Arrays.toString(rollno1));
	     if(Arrays.equals(rollno, rollno1)==true)
	     {
	    	 System.out.println("Arrays are equal");
	     }
	     else
	     {
	    	 System.out.println("Arrays are not equal");
	     }
	}

}
