/*Project#2(Zerox Copy)
Read password form keyboard verify it's length is b/w 8 to 16.
if yes display message "Registration Successful" else throw error password
length should be b/w "8-16".*/


package core.nit.project;

import java.util.Scanner;

public class Password_Checking {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	
while(true) {
    System.out.println("Enter Password:");
    String pwd=scn.nextLine();
    
    if(pwd.isEmpty()) {
    	
    	System.out.println("Password should not be empty");
    	continue;
    }
    else {
    	int len=pwd.length();
    	if(len<8||len>16) {	
    
    	System.out.println("Password should be 8 to 16");
    	continue;
    	}
    	else {
    		System.out.println("Registration Completed Sucessfully");
    		break;
    	}//else
    }//else
}//while
		
	}//main

}//class
