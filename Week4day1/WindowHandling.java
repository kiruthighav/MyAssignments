package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.irctc.co.in");
		driver.findElement(By.xpath("//span[@class = 'allcircle circleone']")).click();
		
		Set<String> allAddressSet = driver.getWindowHandles();
		List<String> allAddressList = new ArrayList<String>(allAddressSet);
		
		driver.switchTo().window(allAddressList.get(1));
		System.out.println("Tittle of the new page opened: "+driver.getTitle());
		driver.switchTo().window(allAddressList.get(0));
		driver.close();
		System.out.println("Parent window closed");
		
		
	}

}
