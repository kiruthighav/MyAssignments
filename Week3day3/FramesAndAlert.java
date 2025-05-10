package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesAndAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		driver.switchTo().defaultContent();
		driver.close();
		
		
	}

}
