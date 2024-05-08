package Assignments;

import java.util.Arrays;

public class Assignment69 {
           static int Space=0;
           static int Alphabets=0;
           static int Numeric=0;
           static int Totalcharacters=0;
           static int Specialcharacters=0;
	public static void main(String[] args) {
		String name = "Manoj  123###";
		char [] c1= name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i =0; i<c1.length;i++)
		{
			boolean answer =Character.isSpaceChar(c1[i]);
         if(answer==true) 
         {
        	 Space++; 
         }
		}
		System.out.println("The Total Spaces are:-" + Space);
		for(int i =0; i<c1.length;i++)
		{
			boolean answer =Character.isAlphabetic(c1[i]);
         if(answer==true) 
         {
        	 Alphabets++; 
         }
		}
		System.out.println("The Total Alphabets are:-" + Alphabets);
		for(int i =0; i<c1.length;i++)
		{
			boolean answer =Character.isDigit(c1[i]);
         if(answer==true) 
         {
        	 Numeric++; 
         }
		}
		System.out.println("The Total Numeric are:-" + Numeric);
		
		for(int i=0;i<c1.length;i++)
		{
		if(name.charAt(i)!= ' ')
			Totalcharacters++;
		}
		System.out.println("The  Totalcharacters are:-" + Totalcharacters);
		Specialcharacters=Totalcharacters-Numeric-Alphabets;
		System.out.println("Total special Characters are:-" + Specialcharacters);
	}

}
