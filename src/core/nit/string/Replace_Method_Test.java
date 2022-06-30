package core.nit.string;

public class Replace_Method_Test {

	public static void main(String[] args) {
		
		String s1="abc abc abc";
		System.out.println(s1);
		
		
		s1.replace('a','b');
		System.out.println(s1);
		System.out.println();
		
		
		String s2=s1.replace('a', 'b');
		System.out.println(s1);
		System.out.println("S2....."+s2);
		System.out.println();
		
		String s3=s1.replaceFirst("a", "b");
		System.out.println(s1);
		System.out.println("Replace First..."+s3);
		System.out.println();
		
		s1=s1.replace('a', 'd');
		System.out.println(s1);
		System.out.println();
		
		String s4=s1.replace("a","e");
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1==s4);
		System.out.println();
		
		
		String s5=s1.replace("D","e");
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s1==s5);
		
		System.out.println("===========================");
		
		String s6="abc.txt";
		String s7=s6.replace(".", "#");
		System.out.println("s6--"+s6);
		System.out.println("s7--"+s7);
		
		String s8=s6.replaceAll(".", "#");
		System.out.println("All Repalcement....s8" +s8);
		
		
		System.out.println();
		String s9=s6.replaceFirst(".", "#");
		System.out.println("s9--"+s9);
		
		
		String s10=s6.replaceAll("\\.", "#");
		System.out.println("s10--"+s10);
	
		String s11=s6.replaceFirst("\\.", "#");
		System.out.println("s11--"+s11);
		
		
		System.out.println(s10==s11);
		
		System.out.println("\n\n\n\n<><><><><><><><><><><><><><><><>");
		String s12="abc$bbc?cbc";
		String s13=s12.replaceAll("\\$", " ");
		String s14=s13.replaceAll("\\?","@" );
		System.out.println("s12--"+s12);
		System.out.println("s13--"+s13);
		System.out.println("s14--"+s14);
		
		System.out.println("\n\n-----------------------------------");
		
		String s15="abc";
		String s16=s15.replace('a', 'b');
		String s17=s15.replace('a', 'b');
		String s18=s17.replace('a','b');
		System.out.println("s15--"+s15);
		System.out.println("s16--"+s16);
		System.out.println("s17--"+s17);
		System.out.println("s18--"+s18);
		
		System.out.println(s16==s17);
		System.out.println(s17==s18);
		System.out.println("equals.."+s16.equals(s17));
		System.out.println("equals.."+s17.equals(18));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
