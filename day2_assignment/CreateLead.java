package week2.day2_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		//Open facebook page
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		// Enter Credentials
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Login by clicking Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter details
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeyashree");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mani");
		String title_input="Learning Selenium";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(title_input);
		// Create Lead
		driver.findElement(By.name("submitButton")).click();
		
		//Verify the Title
		String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		
		if (title.equals(title_input) )
		{
			System.out.println("Title verified, it match with the input");
		}
		else
		{
			System.out.println("Tilte verified, it is NOT matching with the input");
		}
		//close the driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.quit();
	}
}
