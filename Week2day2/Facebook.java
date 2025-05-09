package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Load the URL
		driver.navigate().to("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		//Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name
		driver.findElement(By.name("firstname")).sendKeys("Kanmani");
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("R");
		//Select the date of DOB
		WebElement selectDropDown1 = driver.findElement(By.id("day"));
		Select option1 = new Select(selectDropDown1);
		option1.selectByValue("1");
		Thread.sleep(1000);
		//Select the month of DOB
		WebElement selectDropDown2 = driver.findElement(By.id("month"));
		Select option2 = new Select(selectDropDown2);
		option2.selectByValue("7");
		Thread.sleep(1000);
		//Select the year of DOB
		WebElement selectDropDown3 = driver.findElement(By.id("year"));
		Select option3 = new Select(selectDropDown3);
		option3.selectByValue("1995");
		Thread.sleep(1000);
		//Select the Gender
		driver.findElement(By.xpath("//label[text()='Male']/input")).click();
		//Enter the Mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9834095903");
		//Enter the New password
		driver.findElement(By.name("reg_passwd__")).sendKeys("1Qaz@wsx");
		//Click Submit
		driver.findElement(By.name("websubmit")).click();
		//Get the title of the page and print it
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.close();
		System.out.println("Account Created");
	
	}

}
