//29trimTest.java
//Page#82

package core.nit.string;

public class TrimTest {

	public static void main(String[] args) {
		
		String s1="  abc bbc   ";
		System.out.println(s1.length());
		System.out.println(s1);
		
s1.trim();
System.out.println(s1.length());

System.out.println("************");
//System.out.println(s1.trim().length());
String s2=s1.trim();
System.out.println(s1.length());
System.out.println(s2.length());
		
	
System.out.println("****************");

String s3=s2.trim();
System.out.println(s2.length());
System.out.println(s3.length());
System.out.println(s2==s3);

System.out.println("****************");
String s4=s1.replace(" ","#");
String s5=s1.replace("  ", "*");
System.out.println(s4.length());
System.out.println(s5.length());
System.out.println(s4);
System.out.println(s5);


System.out.println("************");
String s6=s1.trim();
String s7=s1.trim();
System.out.println(s6+ "...."+s6.length()+s6.hashCode());
System.out.println(s7+  "...." +s7.length()+s7.hashCode());
System.out.println(s6==s7);

System.out.println("************");
String s8=s6.trim();
System.out.println(s8+"...."+s8.length()+s8.hashCode());
System.out.println(s6==s8);
System.out.println(s7==s8);
System.out.println(s6.equals(s8));





		
		
	}//main

}//class
