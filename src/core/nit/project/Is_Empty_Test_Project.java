package core.nit.project;

import java.util.Scanner;

public class Is_Empty_Test_Project {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=scn.next();
		if(name.isEmpty()) {
			System.out.println("Name is Required");
		}//if
		else {
			String resName=name.trim();
			if(resName.isEmpty()) {
				System.out.println("Name is Required");
			}
			System.out.println("Hi.."+name);
			System.out.println("Welcome to NIT");
		}//else
		
	}

}
