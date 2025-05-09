package week2.day1;

public class ReverseString {

	public static void main(String[] args) {

		String companyName = ("TestLeaf");
		char[] cArray = companyName.toCharArray();
		
		for (int i = (cArray.length - 1); i>=0; i--) {
			
			System.out.println(cArray[i]);
			
		}
	}

}
