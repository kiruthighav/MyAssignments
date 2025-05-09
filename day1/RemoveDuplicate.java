package week2.day1;

public class RemoveDuplicate {

	public static void main(String[] args) {

		//Initialize a variable ‘count’
		int count=0;
		
		//input
		String text = "We learn Java basics as part of Java sessions in java week1";
		
		//Split the text into an array of words using space as the delimiter
		String[] textArray = text.split(" ");
		
		//Create two nested for loops to compare each word with every other word in the String array
		for (int i = 0; i < textArray.length; i++) {
			for (int j = i+1; j < textArray.length; j++) {
				
				if (textArray[i].equalsIgnoreCase(textArray[j]) ) {
					
					textArray[j] = " ";
					count++;
				}
			}
			
		} 
	
		if (count > 0) {
			
			String text1 = String.join(" ", textArray);
			System.out.println(text1);
		}
		else {
			System.out.println("No duplicates found");
		}
		
	}
}
