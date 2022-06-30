/*Project#4(Zerox Copy)...
 *  Develop a program to find no of vowels & Consonants available in given string.
 * Read string from keyboard
 */
package core.nit.project;

import java.util.Scanner;

public class Vowel_Conso_Checkingg {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scn.next();
		System.out.println(s1);
		String s2=s1.toLowerCase();
		System.out.println(s2);
		
int vcount=0;
int ccount=0;
     for(int i=0;i<s2.length();i++) {
    	 
    	 char ch=s2.charAt(i);
    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    		 vcount++;
    		 System.out.println("Available Vowels are  : "+vcount);
    	 }//if
    	 else {
    		 ccount++;
    		
    	 }//else
    	 System.out.println("Available Consonants are: "+ccount);
    	  
     }//for

	}//main

}//class
