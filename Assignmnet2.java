package Assignments;

public class Assignmnet2 {
	static int a =10;
	static int b =20;
	static void add()
	{
		int sum = a+b;
		System.out.println("Sum of a and b is : " + sum);
	}	
	static void Subtract()
	{
		int sub =a-b;
		System.out.println("Subtraction of a and b is : " + sub);
	}
	static void Multiply()
	{
		int mul =a*b;
		System.out.println("Multiplication of a and b is : " + mul);
	}
	static void Division()
	{
		int div =a/b;
		System.out.println("Division of a and b is : " + div);
	}
	static void Modulus()
	{
		int mod =a%b;
		System.out.println("Modulus of a and b is : " + mod);
	}
	public static void main(String[] args) {
     add();
     Subtract();
     Multiply();
     Division();
     Modulus();
	}

}
