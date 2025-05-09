package week2.day4;

public class Safari extends Browser{ 

	public void readerMode() {
		
		System.out.println("Reader Mode");
		
	}
	
	public void fullScreenMode() {
		
		System.out.println("Full Screen Mode");
	}
	
	public static void main(String[] args) {

		Safari safari = new Safari();
		safari.openURL();
		safari.readerMode();
		safari.fullScreenMode();
		safari.closeBrowser();
		safari.navigateBack();
		safari.browsName("Safari");
		safari.browsVersion(5);
		
	}

}
