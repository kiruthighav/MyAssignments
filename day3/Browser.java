package week1.day3;

public class Browser {

	public String launchBrowser(String browserName) {
		
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl() {
		
		System.out.println("Application url loaded successfully");
		
	}
	
	public static void main(String[] args) {
		
		Browser b = new Browser();
		System.out.println("Browser Name: "+b.launchBrowser("Chrome"));
		b.loadUrl();
		

	}

}
