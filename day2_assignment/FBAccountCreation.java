package week2.day2_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBAccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Open facebook page
		driver.get("https://www.facebook.com");
		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		//Selecting the Create new account
		driver.findElement(By.linkText("Create new account")).click();
		//Enter First name
		driver.findElement(By.name("firstname")).sendKeys("Jeyashree");
		//Enter Surname
		driver.findElement(By.name("lastname")).sendKeys("Mani");
		//Choose Date of Birth
		WebElement day = driver.findElement(By.id("day"));
		Select DOBday=new Select(day);
		DOBday.selectByValue("29");

		WebElement month = driver.findElement(By.id("month"));
		Select DOBmonth=new Select(month);
		DOBmonth.selectByValue("10");

		WebElement year = driver.findElement(By.id("year"));
		Select DOByear=new Select(year);
		DOByear.selectByValue("1987");

		//Select Gender
		driver.findElement(By.className("_58mt")).click();
		
	}

}
