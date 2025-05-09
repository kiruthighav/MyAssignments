package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
	
		String userName = "Vimala";
		//Initialize the browser driver
		EdgeDriver driver=new EdgeDriver();		
		//Maximize
		driver.manage().window().maximize();	
		//Load the URL
		driver.navigate().to("http://leaftaps.com/opentaps/");
		//Enter the Username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click Accounts
		driver.findElement(By.linkText("Accounts")).click();
		//Click Create Accounts
		driver.findElement(By.linkText("Create Account")).click();
		//Enter Account Name
		driver.findElement(By.id("accountName")).sendKeys(userName);
		//Enter description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Select Computer software
		WebElement selectDropDown1 = driver.findElement(By.name("industryEnumId"));
		Select option1 = new Select(selectDropDown1);
		option1.selectByValue("IND_SOFTWARE");
		Thread.sleep(2000);
		//Select S-Corporation
		WebElement selectDropDown2 = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(selectDropDown2);
		option2.selectByVisibleText("S-Corporation");
		Thread.sleep(2000);
		//Select Employee
		WebElement selectDropDown3 = driver.findElement(By.id("dataSourceId"));
		Select option3 = new Select(selectDropDown3);
		option3.selectByValue("LEAD_EMPLOYEE");
		Thread.sleep(2000);
		//Select eCommerce Site Internal Campaign
		WebElement selectDropDown4 = driver.findElement(By.name("marketingCampaignId"));
		Select option4 = new Select(selectDropDown4);
		option4.selectByIndex(7);
		Thread.sleep(2000);
		//Select Texas
		WebElement selectDropDown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select option5 = new Select(selectDropDown5);
		option5.selectByValue("TX");
		Thread.sleep(2000);
		//Click Create Account
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the account name is displayed correctly
		WebElement findName =driver.findElement(By.xpath(("(//span[@class= 'tabletext'])[3]")));
		String name = findName.getText();
		String finalName = name.split("\\(")[0].trim();
		System.out.println(finalName);
		if (userName.equalsIgnoreCase(finalName)) {
			System.out.println("Account name is displayed correctly");
		}
		else {
			System.out.println("Incorrect Account Name is displayed");
		}
		//Close the browser window
		driver.close();
		
	
			
		
	}

}
