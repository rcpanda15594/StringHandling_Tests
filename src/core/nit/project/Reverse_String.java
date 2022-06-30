package core.nit.project;

import java.util.Scanner;

public class Reverse_String {

	public String reverse(String x) {
		
		String rev="";
		for(int i=x.length()-1;i>=0;i--) {
			rev=rev+x.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Reverse_String r=new Reverse_String();
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String:  ");
		String s1=scn.next();
		String s2=r.reverse(s1);
		System.out.println("Reverse=" +s2);
		

	}//main

}//class
