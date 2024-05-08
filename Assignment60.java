package Assignments;

import java.util.Date;

public class Assignment60 {

	public static void main(String[] args) {
     Date d =new Date();
     Date d1 =new Date(d.getTime()+(60*60*1000*24*2));
     System.out.println("Time and Date After Two days:-" + d1);
     Date d2 =new Date(d.getTime()-(60*60*1000*24*2));
     System.out.println("Time and Date Before Two days:-" + d2);

	}

}
