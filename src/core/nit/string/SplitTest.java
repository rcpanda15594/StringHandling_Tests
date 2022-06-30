package core.nit.string;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		String s1="Hari NIT";
		System.out.println(s1);
		System.out.println(s1.length());
		
		
		String[] sa1=s1.split("");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		
		
		String[] sa2=s1.split("a");
		System.out.println(sa2.length);
		System.out.println(Arrays.toString(sa2));


	}

}
