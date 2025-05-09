package week2.day4;

public class ApiClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("The endpoint is reached");
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint reached");
		System.out.println("Change requested");
		if (requestStatus == true) {
			System.out.println("Request passed");
		}
		else {
			System.out.println("Request failed");
		}
		
	}
	

	public static void main(String[] args) {

		ApiClient api = new ApiClient();
		api.sendRequest("Endpoint recieved");
		api.sendRequest("Endpoint reached", "Request Body", false);
		
		
	}

}
