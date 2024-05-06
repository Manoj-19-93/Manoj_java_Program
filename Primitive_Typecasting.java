package Assignments;

public class Primitive_Typecasting {

	public static void main(String[] args) {
     int intvalue =10 ;
      double doublevalue = intvalue;
      System.out.println(doublevalue); // implicit widening
      
      double doublevalue1=(double) intvalue;
      System.out.println(doublevalue1);  // Explicit Widening
      
      short shortvalue = (short) doublevalue1 ;
      System.out.println(shortvalue);
		
	}

}
