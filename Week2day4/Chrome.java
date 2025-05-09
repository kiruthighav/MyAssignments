package week2.day4;

public class Chrome extends Browser {

	public void openIncognito() {
		
		System.out.println("Open Incognito");
		
	}
	
	public void clearCache() {
		
		System.out.println("Clear Cache");
	}
	
	public static void main(String[] args) {
		
		Chrome chrome =new Chrome();
		chrome.openURL();
		chrome.openIncognito();
		chrome.clearCache();
		chrome.closeBrowser();
		chrome.navigateBack();
		chrome.browsName("Chrome");
		chrome.browsVersion(12);
		
}
	

}