/* Develop a prog to register a user account in web site .In this project you
 * develop code  for validating password criteria
 */

package core.nit.project;

import java.util.Scanner;

public class Password_Pattern_Validator {

	public static void main(String[] args) {
		
Scanner scn=new Scanner(System.in);
    

     boolean upperFound=false;
     boolean digitFound=false;
     boolean spCharFound=false;
     
     while(true) {
     System.out.println("Password:");
     String pwd=scn.next();
     
     int len=pwd.length();
     if(len<8||len>16) {
    	 System.out.println("Password should contain 8-16 char");
    	 
     }//if
     else {
    	 for(int i=0;i<len;i++) {
    		 
    		char ch=pwd.charAt(i); 
    if(Character.isLetter(ch)) {
    	upperFound=true;
    }//if
    else if(Character.isDigit(ch)) {
    	digitFound=true;
    }//else if
    else {
    	spCharFound=true;
    }
    	 }//for		 
    	 
    if(upperFound && digitFound && spCharFound) {
    	System.out.println("Registation Sucess");
    	//break;
    }
    else {
    	System.out.println("Password should Contain");
    	System.out.println("1.One UpperCase Alphabet");
    	System.out.println("2.One digit");
    	System.out.println("3.One Special Character");
    }
     }//else
	}//while
	}//main

}//class
