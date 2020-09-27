package example.array;

import java.util.Arrays;

public class IsUnique {
	
	public static void main(String[] args) {
		
		//String value="absjabdksmsdlsldkls";
		
		
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			//System.out.println(word);
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}
	
	public static Boolean isUniqueChars(String str) {
	
		if(str.length() > 128) {
			return false;
		}
	//	System.out.println(str);
		Boolean[] charSetss = new Boolean[128];
		Arrays.fill(charSetss, Boolean.FALSE);
		for(int i=0 ;i<str.length();i++) {
	//		System.out.println(str);
			int value= str.charAt(i);
	//		System.out.println(charSetss[i]);
			if(charSetss[value]) return false;
			charSetss[value]=true;
			
		}
		return true;
		
	}

}
