package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHomework {

	public static void main(String[] args) throws InterruptedException {

		//Initialize ChromeDriver
		EdgeDriver driver = new EdgeDriver();
		//Load the URL
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter the Username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on the Contacts button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Click on Merge Contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on the widget of the "From Contact"
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		//Get all the address of the windows 
		Set<String> allWindowSet = driver.getWindowHandles();
		//Convert the Set into List
		List<String> allwindowList = new ArrayList<String>(allWindowSet);
		//Switch the driver focus to the child window
		driver.switchTo().window(allwindowList.get(1));
		Thread.sleep(2000);
		//Click on the first resulting contact
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		//Switch the driver focus back to the parent window
		driver.switchTo().window(allwindowList.get(0));
		//Click on the widget of the "To Contact"
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		//Get all the address of the windows
		Set<String> allWindowSet1 = driver.getWindowHandles();
		////Convert the Set into List
		List<String> allWindowList1 = new ArrayList<String>(allWindowSet1);
		//Switch the driver focus to the child window
		driver.switchTo().window(allWindowList1.get(1));
		Thread.sleep(2000);
		//Click on the second resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		//Switch the driver focus back to the parent window
		driver.switchTo().window(allWindowList1.get(0));
		//Click on the Merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(2000);
		System.out.println("Merge clicked");
		//Accept the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//Verify the title of the page
		System.out.println("Tittle of the page is: "+driver.getTitle());
		driver.close();
		
	}

}