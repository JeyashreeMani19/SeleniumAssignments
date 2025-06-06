package week2.day1_assignment;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// Creating object for ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Open facebook page
		driver.get("https://www.facebook.com");
		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		//Close the browser
		driver.quit();

	}

}
