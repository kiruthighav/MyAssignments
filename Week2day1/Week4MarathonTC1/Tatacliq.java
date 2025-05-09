package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {

		//Load the url as https://www.tatacliq.com/
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// MouseHover on 'Brands'
		Actions act = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		act.moveToElement(brands).pause(2000).perform();
		//MouseHover on 'Watches & Accessories'
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Watches & Accessories']"))).perform();
		//Choose the first option from the 'Featured brands'
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		// Select sortby: New Arrivals
		WebElement sortBy = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select sort = new Select(sortBy);
		sort.selectByVisibleText("New Arrivals");
		//choose men from catagories filter
		driver.findElement(By.className("CheckBox__base")).click();
		Thread.sleep(2000);
		//print all price of watches
		List<WebElement> priceList = driver.findElements(By.xpath("//div [@class='ProductDescription__priceHolder']"));
		System.out.println("Price list of the watches");
		for (int i = 0; i < priceList.size(); i++) {
			System.out.println(priceList.get(i).getText());
		}
		String priceOnMainPage = priceList.get(0).getText().trim();
		System.out.println("Price of the 1st watch on main page is "+priceOnMainPage);
		//click on the first resulting watch
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allWindowsList = new ArrayList<String>(allWindows);
		driver.switchTo().window(allWindowsList.get(1));
		//compare two price are similar
		String priceOnNextPage = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		String priceOnNextPage1 = priceOnNextPage.replace("MRP:", "").trim();
		System.out.println("Price in next page is "+priceOnNextPage1);
		if (priceOnMainPage.equals(priceOnNextPage1)) {
			System.out.println("Prices are equal");
		}
		else {
			System.out.println("Prices are not equal");
		}
		//click Add to cart
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		//get count from the cart icon
		WebElement cartCount = driver.findElement(By.className("DesktopHeader__cartCount"));
		System.out.println("Cart Count: "+ cartCount.getText());
		//Click on the cart
		driver.findElement(By.className("DesktopHeader__myBagShow")).click();
		Thread.sleep(2000);
		//Take a snap of the resulting page
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/Cart.png");
		FileUtils.copyFile(source, target);
		System.out.println("Snapshot taken");
		//Close All the opened windows one by one
		driver.close();
		System.out.println("Cloased the child window");
		Thread.sleep(2000);
		driver.switchTo().window(allWindowsList.get(0));
		driver.close();		
		System.out.println("Closed the parent window");
		
		}

}
