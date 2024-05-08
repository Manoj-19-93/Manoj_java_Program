package Assignments;

public class Assignment74 {

	public static void main(String[] args) {

		int rollno[]= new int[4];
		rollno[0]=90;
		rollno[1]=55;
		rollno[2]=41;
		rollno[3]=33;
		int givenno=41;
		for(int i=0;i<rollno.length;i++)
		{
			if(givenno==rollno[i])
			{
				System.out.println("The Number is present at index" + i);
			}
			else
			{
				System.out.println("The Number not is present");

			}
		}
	}

}
