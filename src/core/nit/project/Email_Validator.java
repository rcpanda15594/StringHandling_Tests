package core.nit.project;

import java.util.Scanner;

public class Email_Validator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(true) {
		System.out.println("Email :");
		String email=scn.next();
		int atIndex;
		if(((atIndex=email.indexOf('@'))!=-1)&&
		(email.indexOf('.',atIndex)!=-1)){
			System.out.println("Registered");
			
		}else {
			System.out.println("Invalid email");
		}
		}
		
	}//main

}//class
