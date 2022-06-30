/*Zerox Copy#72
 * Develop a program to take string data as argument say "Hari", append 
 * NareshIT character each character individually to the argument stgring data 
 * return result string.
 */

package core.nit.project;

public class String_To_StringBuilder {

	public static void main(String[] args) {
		String s1="Hari";
		String s2=modify(s1);
		System.out.println(s1);
		System.out.println(s2);
		
	}//main
	
	
	//Converting String to StringBuilder
	
static String modify(String s1) {
	
	StringBuilder sb=new StringBuilder(s1);
	
	String s2="NareshIT";
	for(int i=0;i<s2.length();i++) {
		sb.append(s2.charAt(i));
	}//for
	return sb.toString();
}//Modify method

}//class
