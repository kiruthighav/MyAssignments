package week3.day1;

public class JavaConnection implements DatabaseConnection {


	@Override
	public void connect() {
		System.out.println("Connected to database");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from database");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update not executed");
	}
	
	public static void main(String[] args) {

		JavaConnection java = new JavaConnection();
		java.connect();
		java.disconnect();
		java.executeUpdate();
		
		
	}
}
