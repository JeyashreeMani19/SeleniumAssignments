package week3.week3_day2_assignment;

public class APIClient {
	
	public void sendRequest(String endpoint) 
	{
		System.out.println("Send request contains single parameter :" + endpoint);

	}
	
	public void sendRequest(String endpoint, String requestBody, String requestStatus) {
		System.out.println("Send Request with 3 arguments :" + endpoint +" , " + requestBody +" ," + requestStatus);

	}

	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("Checking with 1 arg");
		api.sendRequest("arg 1", "arg 2", "arg 3");

	}

}
