package Assignments;

import java.util.Arrays;

public class Assignment75 {

	public static void main(String[] args) {
      String input1="bread";
      String input2="manojw";
      if(input1.length() != input2.length())
      {
    	  System.out.println(" They are not anagram as length is not equal");
      }
      char [] c1 =input1.toCharArray();
      char [] c2 =input2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      System.out.println(Arrays.toString(c1));
      System.out.println(Arrays.toString(c2));
      if(Arrays.equals(c1, c2))
      {
    	  System.out.println(" They are anagram");
      }
      else
      {
    	  System.out.println(" They are not anagram");
      }
	}

}
