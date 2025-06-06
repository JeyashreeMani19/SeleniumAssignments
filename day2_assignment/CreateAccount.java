package week2.day2_assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		//Create Account
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		String accountName = "Jeyashree";
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Choose industry
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select accountindustry=new Select(industry);
		accountindustry.selectByValue("IND_SOFTWARE");
		
		//Choose ownership
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select accountownership=new Select(ownership);
		accountownership.selectByVisibleText("S-Corporation");
		
		//Choose source
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select accountsource=new Select(source);
		accountsource.selectByValue("LEAD_EMPLOYEE");
				
		//Choose marketingCampaignId
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select accountmarketing=new Select(marketing);
		accountmarketing.selectByIndex(6);
	
		//Choose State
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select accountstate=new Select(state);
		accountstate.selectByValue("TX");
		
		// Create account
		driver.findElement(By.className("smallSubmit")).click();
		
		//Checking for duplication
		boolean isAccountDuplicate = driver.findElement(By.className("errorMessage")).isDisplayed();
		
		if (isAccountDuplicate)
		{
			String accountduplication = driver.findElement(By.className("errorMessage")).getText();
			if (accountduplication.contains("name already exists"))
			{
				driver.findElement(By.className("buttonDangerous")).click();
				driver.switchTo().alert().accept();
			}
		}
		
		String accountNameVerify = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(accountNameVerify);
			
		if (accountNameVerify.contains(accountName) )
		{
			System.out.println("Account name verified, it match with the input");
		}
		else
		{
			System.out.println("Account name verified, it is NOT matching with the input");
		}
		//close the driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.quit(); 
	
	}

}
