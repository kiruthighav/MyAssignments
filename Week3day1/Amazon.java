package week3.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delivery available");
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI payments available");
	}

	@Override
	public void cardPayments() {
		System.out.println("Card payments available");
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet  Banking available");
	}
	
	
	public static void main(String[] args) {

		Amazon obj = new Amazon();
		obj.cashOnDelivery();
		obj.upiPayments();
		obj.cardPayments();
		obj.internetBanking();
		obj.recordPaymentDetails();
	}

}
