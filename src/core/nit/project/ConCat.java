package core.nit.project;

import java.util.Scanner;

public class ConCat {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
System.out.println("Enter first String:");
String s1=scn.next();

System.out.println("Enter seceond String:");
String s2=scn.next();
String s3=s1.concat(s2);
System.out.println(s3);
	}

}
