/*WAP to read String from the keyboard .If this String contains substring "Hari"
 * then display substring "Hari" available else display ,substring "hari" is not
 *  available
 */

package core.nit.project;

import java.util.Scanner;

public class Searching_String {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1=scn.next();
		String s2="hari";
		for(int i=0;i<s1.length();i++) {
			
			char ch=s1.charAt(i);
			System.out.println(ch);
		public int indexof(String s2) {
			System.out.println("SubString Hari Available");
		}
		}//for
		else {
			System.out.println("SubString Hari not Available");
			
		}
		

	}//main

}//class
