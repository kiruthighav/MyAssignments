package week2.day4;

public class Edge extends Browser {

	public void takeSnap() {
		
		System.out.println("Take Snap");
	}
	
	public void clearCookies() {
		
		System.out.println("Clear Cookies");
	}
	
	public static void main(String[] args) {
		
		Edge edge = new Edge();
		edge.openURL();
		edge.takeSnap();
		edge.clearCookies();
		edge.closeBrowser();
		edge.browsName("Edge");
		edge.browsVersion(11);
	}

}
