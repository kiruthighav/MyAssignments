package week2.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {

		//Input String
		String test = "changeme";
		
		//Convert the given String to a character array
		char[] toCharacter = test.toCharArray();
		
		//Implement a loop to iterate through each character of the String
		for (int i = 0; i < toCharacter.length; i++) {
			
			//Find the odd index within the loop
			if (i%2 != 0) {
				 
				//change the character to uppercase only if the index is odd
				toCharacter[i] = Character.toUpperCase(toCharacter[i]);
			}
		}
		
		//Print the characters
		System.out.println("Output: "+ new String (toCharacter));
		
	}

}
