package Assignments;
import java.util.*;
public class ArrayAtRunTime {

	public static void main(String[] args) {
     Scanner s1 = new Scanner (System.in);
     int rollno[]=new int[3];
     for(int i=0;i<3;i++)
     {
    
       System.out.println("Enter the Array->");
       rollno[i]=s1.nextInt();
       System.out.println(rollno[i]);
       
     }
     System.out.println(Arrays.toString(rollno)); 
     
	}

}
