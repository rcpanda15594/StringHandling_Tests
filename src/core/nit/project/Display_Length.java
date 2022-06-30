//WAP to display the length of a string....

package core.nit.project;

import java.util.Scanner;

public class Display_Length {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=scn.next();
		System.out.println(str);
		int i=str.length();
		
		/*String s1="Ramesh";
		System.out.println(s1.length());
		int i=s1.length();*/
		
		System.out.println("Length.."+i);
		
		
	}//main

}//class
