package week3.week3_day2_assignment;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Enter the User name");

	}
	public void enterPassword() {
		System.out.println("Enter the Password");

	}
	public static void main(String[] args) {
		TestData testLogin = new TestData();
		LoginTestData login = new LoginTestData();
		testLogin.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		testLogin.navigateToHomePage();	

	}

}
