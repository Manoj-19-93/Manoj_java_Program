package Assignments_Practice_Mkt;

import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {

		Date date = new Date();
		
		Date CurrentDate = new Date(date.getTime());
		System.out.println("Current Date :" + CurrentDate );
		
		Date pastDate = new Date(date.getTime()-(60*60*1000*24*3));
		System.out.println("Current Date :" + pastDate );
		
		Date futureDate = new Date(date.getTime()+(60*60*1000*24*3));
		System.out.println("Current Date :" + futureDate );
		
	}

}
