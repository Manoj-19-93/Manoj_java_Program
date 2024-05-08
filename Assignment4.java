package Assignments;

public class Assignment4 {
     static int a = 10;
     static int b =20;
     static void add()
     {
    	 int sum = a +b ;
    	 System.out.println("Sum of a and b is : "+ sum);
     }
     int c =30;
     int d =40;
     void subtract()
     {
    	 int sub=d-c;
    	 System.out.println("Subtraction of c from d is : " + sub);
     }
	public static void main(String[] args) {
		Assignment4 obj = new Assignment4();
		obj.subtract();
		add();

	}

}
