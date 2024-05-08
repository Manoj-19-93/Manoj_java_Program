package Assignments;

public class Assignment3 {
	 int a =10;
	 int b =20;
	 void add()
	{
		int sum = a+b;
		System.out.println("Sum of a and b is : " + sum);
	}	
	 void Subtract()
	{
		int sub =a-b;
		System.out.println("Subtraction of a and b is : " + sub);
	}
	 void Multiply()
	{
		int mul =a*b;
		System.out.println("Multiplication of a and b is : " + mul);
	}
	 void Division()
	{
		int div =a/b;
		System.out.println("Division of a and b is : " + div);
	}
	 void modulus()
	{
		int mod =a%b;
		System.out.println("Modulus of a and b is : " + mod);
	}
	public static void main(String[] args) {
		Assignment3 obj = new Assignment3();
		obj.add();
		obj.Subtract();
		obj.Multiply();
		obj.Division();
		obj.modulus();
	}

}
