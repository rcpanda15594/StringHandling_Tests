package core.nit.project;

import java.util.Scanner;

public class Test_Reverse {

	public static void main(String[] args) {
		Project_For_Reverse_String p=new Project_For_Reverse_String();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=scn.next();
		String result=p.reverseString(str);
		System.out.println("Origrnal String:"+str);
		System.out.println("Reverse String:"+result);

	}

}
