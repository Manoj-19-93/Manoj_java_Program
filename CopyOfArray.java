package Assignments;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
        String name[]=new String[4];
        name[0]="Manoj";
        name[1]="Mohit";
        name[2]="Prakul";
        name[3]="Pankaj";
        String namecopy[]= new String[4];
        for(int i=0;i<name.length;i++)
        {
        	namecopy[i]=name[i];
        }
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(namecopy));
        
	}

}
