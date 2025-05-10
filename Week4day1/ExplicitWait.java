package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.navigate().to("https://www.leafground.com/waits.xhtml");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an explicit wait object 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//Click the button
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		//Check if the second button becomes invisible 
		Boolean invisibility = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println(invisibility);
		if (invisibility == true) {
			System.out.println("Working correctly");
		}
		//Click the button 'Click First button'
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='ui-growl ui-widget']")));
		//Check if the second button is clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']"))).click();
		System.out.println("Second button clicked");
		driver.close();
	}
	

}