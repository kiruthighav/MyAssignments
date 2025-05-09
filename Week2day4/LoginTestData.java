package week2.day4;

public class LoginTestData extends TestData {

	public void enterUsername(String username) {
		System.out.println("Username: "+ username);
	}
	
	public void enterPassword(String password) {
		System.out.println("Password: "+ password);
	}
	public static void main(String[] args) {

		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.enterUsername("Athirai");
		login.enterPassword("Home@123");
		login.navigateToHomePage();
	}

}
