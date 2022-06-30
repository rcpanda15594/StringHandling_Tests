//String Handling ##Page80
package core.nit.string;

public class ChangeCaseTest {

	public static void main(String[] args) {
		String s1="aBc";
		System.out.println(s1);
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println("******************");
String s2=s1.toUpperCase();
String s3=s1.toLowerCase();
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
        System.out.println("*************");
        s1=s1.toUpperCase();
        System.out.println(s1);
        s1=s1.toLowerCase();
        System.out.println(s1);
        System.out.println("**************");
String s4=s1.toLowerCase();
System.out.println(s1);
System.out.println(s4);
System.out.println(s1==s4);
        System.out.println("**************");
        String s5=s1.toUpperCase();
        String s6=s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s1==s5);
        System.out.println(s5==s6);
        System.out.println(s1.equals(s5));
        System.out.println(s5.equals(s6));
        System.out.println("*******Special Chars.....No new Object*******");
        
String s7="12@34";
String s8=s7.toLowerCase();
String s9=s7.toUpperCase();
System.out.println(s7);
System.out.println(s8);
System.out.println(s9);
System.out.println(s7==s8);
System.out.println(s7==s9);
System.out.println(s8==s9);
          
          System.out.println("*************");
          String s10="PqR";
          String s11=s10.toLowerCase();
          String s12=s10.toUpperCase();
          System.out.println(s10);
          System.out.println(s11);
          System.out.println(s12);
          
          System.out.println("only..."+s10.toUpperCase());
          System.out.println(s10);
          
          System.out.println(s10=s10.toUpperCase());
          System.out.println("vari.."+s10);
          System.out.println(s12==s10);
          System.out.println("*************");
 
 String str1=null;
 //System.out.println(str1.toUpperCase());
 
 String str2="null";
 System.out.println(str2.toUpperCase());
 
 System.out.println("**********");
 
 String[] sa=new String[5];
 System.out.println(sa[0].toUpperCase());
 
 
 
 
	}//main

}//class
