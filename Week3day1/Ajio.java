package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		//Launch the URL https://www.ajio.com/
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ajio.com/");
		driver.manage().window().maximize();                                                                              
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		WebElement men = driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
		driver.executeScript("arguments[0].click()",men);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		WebElement count = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println(count.getText());
		
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		System.out.println("Brands of the products displayed");
		for (WebElement webElement : brand) {
			System.out.println(webElement.getText());			
		}
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Bag names dispalyed");
		for (WebElement webElement : bagName) {
			System.out.println(webElement.getText());
		}
		

	}

}
