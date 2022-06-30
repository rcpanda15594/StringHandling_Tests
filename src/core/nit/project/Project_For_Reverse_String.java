package core.nit.project;

public class Project_For_Reverse_String {

	public static String reverseString(String s) {
		String[] stringWords=s.split("");
		String resultString ="";
		
		
		for(int i=stringWords.length-1;i>=0;i--) {
			resultString += stringWords[i]+"";
		}
		return resultString;
		
	}
	
	
}
