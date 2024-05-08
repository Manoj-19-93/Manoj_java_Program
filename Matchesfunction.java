package Assignments;

import java.util.Arrays;

public class Matchesfunction {

	public static void main(String[] args) {
          String name ="Manoj";
          System.out.println(name.matches("M(.*)"));
          System.out.println(name.matches("(.*)j"));
          System.out.println(name.matches(".....")); //checking is this word have 5 letter or not by giving that many dots
          int index = name.lastIndexOf('j');
          System.out.println(index);
          String name1 ="Manoj kinha";
          String arr[]=name1.split(" ");
          System.out.println(Arrays.toString(arr));
	}

}