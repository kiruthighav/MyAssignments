package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriver {

	public static void main(String[] args) throws InterruptedException {

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
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		//Click Create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Enter First Name 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiruthigha");
		//Enter Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		
		WebElement selectDropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option1 = new Select(selectDropDown1);
		option1.selectByIndex(4);
		Thread.sleep(2000);
		
		WebElement selectDropDown2 = driver.findElement(By.name("marketingCampaignId"));
		Select option2 = new Select(selectDropDown2);
		option2.selectByVisibleText("Automobile");
		Thread.sleep(2000);
		
		WebElement selectDropDown3 = driver.findElement(By.name("ownershipEnumId"));
		Select option3 = new Select(selectDropDown3);
		option3.selectByValue("OWN_CCORP");
		Thread.sleep(2000);
		
		//Click Create Leads	
		driver.findElement(By.name("submitButton")).click();
		//Get the title of the page
		String pageTitle =driver.getTitle();
		//Print the title
		System.out.println(pageTitle);
		//Close the browser
		driver.close();
		
	}

}
