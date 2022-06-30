/*Project#3(Zerox Copy)
 * WAP to validate mobile number's length.If 10 digits not existed then throw 
 * error message .In this project we must implements 4 validation 
 * 1.Empty or not
 * 2.All are digits or not
 * 3.Ten digits exits or not
 * 4.Is it really mobile no or not/send OTP sms.
 * 
 */
package core.nit.project;

import java.util.Scanner;

public class MobileNo_Vaildator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(true) {
		System.out.println("Enter Your Mobile No:");
		String mobile=scn.next();
		if(mobile.isEmpty()) {
			System.out.println("Mobile no is Mandatory");
		}//if
		else {
			try {
		//		System.out.println("try executed");
			long mn=Long.parseLong(mobile);	
		
			if(mobile.length()!=10) {
				System.out.println("Mobile no should be 10 digits");
			}//if
			else {
				System.out.println("Activation key has send to your no");
				
				System.out.println("Enter Activation Key:");
				String act=scn.next();
				System.out.println("Your Activation no is:"+act);
				System.out.println("Yes...Your Mobile No is Valid no ");
			   }//else
			}//try
			catch(NumberFormatException nfe) {
	
				System.out.println("Mobile no should contain only digits");
			}//catch
	
			
		}//else
		}//while
	}//main

}//class
