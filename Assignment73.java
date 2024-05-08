package Assignments;

import java.util.Scanner;

public class Assignment73 {

	public static void main(String[] args) {
       Scanner s1 = new Scanner(System.in);
       System.out.println("Enter a String:-");
       String name=s1.nextLine();
       String reverse ="";
       for(int i=name.length()-1;i>=0;i--)
       {
    	   char output = name.charAt(i);
    	   reverse=reverse+output;
       }
       System.out.println(reverse);
       if(name.equals(reverse))
       {
    	   System.out.println("It is a Palindrome");
       }
       else
       {
    	   System.out.println("It is not a Palindrome"); 
       }
	}

}
