/*Class Notes# By ....HariKrishna Sir
 * 
 * Read a String from Keyboard , check is it Even or Odd, if it is even ,break in to two parts
 * by equal characters,if it is Odd add middle character to both side in your String & remove 
 * it form middle.
 */

package com.string.interview;

import java.util.Scanner;

public class EvenOdd_And_Modification {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String :");
		String s1=scn.next();
		
		int i=s1.length();
		System.out.println("Finding no of String:"+i);
		
		if(i%2==0) {
			System.out.println("No is Even");
			
			String s2=s1.substring(0,i/2);
			System.out.println(s2);
			
			String s3=s1.substring(i/2);
			System.out.println(s3);
		}
		
		
	}//main

}//class
