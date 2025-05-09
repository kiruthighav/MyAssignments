package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		
		if (text1.length() == text2.length()) {
			
			char[] t1 = text1.toCharArray();
			char[] t2 = text2.toCharArray();
			
			Arrays.sort(t1);
			Arrays.sort(t2);
			System.out.println(t1);
			System.out.println(t2);
			
			if (Arrays.equals(t1, t2)) {
				
				System.out.println("The given strings are Anagram");
			}
			else {
				System.out.println("The given strings are not an Anagram");
			}
		}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
	}

}
