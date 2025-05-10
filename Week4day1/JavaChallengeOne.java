package week4.day1;

public class JavaChallengeOne {

	public static void lengthLastWord(String s) {
		String [] words = s.trim().split(" ");
		int lastWordIndex = (words.length)-1;
		System.out.println("The last word is "+words[lastWordIndex]);
		String lastWord = words[lastWordIndex];
		System.out.println("The length of the last word is "+lastWord.length());
	}
		
	public static void main(String[] args) {

		lengthLastWord("Hello World");
		lengthLastWord("Fly me to the moon");
		lengthLastWord("Luffy is still joyboy");
		
	}

}
