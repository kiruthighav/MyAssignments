package week2.day1;

public class ReverseOddWords {

	public static void main(String[] args) {

		//input String
		String test = "I am a software tester";
		
		//Split the words and have it in an array
		String[] words = test.split(" ");
		
		//Traverse through each word using loop
		for (int i = 0; i < words.length; i++) {
			
			//Find the odd index within the loop
			if (i%2 != 0) {
				
				//Convert the String array into a character array
				char[] spell = words[i].toCharArray();
				
				//Print the odd position words in reverse order
				for (int j = spell.length-1; j >=0 ; j--) {
					
					System.out.print(spell[j]);
				}
				
			}
			//Print the even position words as such
			else {
				
				System.out.print(words[i]);
			}
			//concatenate space at the end
			System.out.print(" ");	
		}
		
	}
 
}
