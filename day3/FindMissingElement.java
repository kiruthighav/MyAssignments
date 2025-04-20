package week1.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int input[]= { 1,4,3,2,8,6,7 };
		Arrays.sort (input);
		
		//{1,2,3,4,6,7,8}
		
		for (int i = 0; i < input.length; i++) {
			
			if (input[i]+1!=input[i+1]) {
				
				System.out.println("The missing element is " + (input[i]+1));
				 break;
				
			}
			
		}
	}

}
