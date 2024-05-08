package Assignments;

public class Assignment79 {

	public static void main(String[] args) {
     String name ="School123";
    String output= name.replaceAll("[a-z]", " ");  //Replacing all small letters values
     System.out.println(output);
     String output1= name.replaceAll("[A-Z]", " "); //Replacing all Capital letters values
     System.out.println(output1);
     String output2= name.replaceAll("[0-9]", " "); //Replacing all numeric values
     System.out.println(output2);
     
     
	}

}
