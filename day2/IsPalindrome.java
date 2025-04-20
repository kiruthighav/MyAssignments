package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {

		int input = 52525;
		int output = 0;
		
		for (int i=input; i>0; i/=10) {
			
			int rem = i%10;
			output = output*10 + rem;
		}	
			
			if (input == output) {
				
				System.out.println("The number "+ input +" is a Palindrome");
			}
			
			else {
				
				System.out.println("The number "+ input + " is not a Palindrome");
			}
	}

}
