package week1.day3;

public class Library {

	public String addBook (String bookTitle) {
		System.out.println("Book "+bookTitle+" added successfully");
		return bookTitle;
		
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
		
	public static void main(String[] args) {
 
		Library l = new Library();
		l.addBook("Harry Potter");
		l.issueBook();
			
	}

}
