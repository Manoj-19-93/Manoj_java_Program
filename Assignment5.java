package Assignments;
public class Assignment5 {
	Assignment5()
	{
		System.out.println("Hello");
	}
	Assignment5(int a)
	{
		System.out.println("one parameter "+ a);
	}
	
	Assignment5(int a, int b, char c,boolean d,int e,long f, double g, float h)
	{
		System.out.println("Multiple parameter "+ a +" "+ b +" "+ c +" " + d + " " +e + " " +f + " " +g +" " + h);
	}
	
	public static void main(String[] args) {
		new Assignment5();
		new Assignment5(5);
		new Assignment5(25 , 2 , 'c' , true , 6 , 2222333 , 2222555 , 6);
	}

}
