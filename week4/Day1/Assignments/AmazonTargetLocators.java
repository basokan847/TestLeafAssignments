package week4.Day1.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTargetLocators {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(price);
		System.out.println(driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText());
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Rating = driver.findElement(By.xpath("(//span[@class='a-size-base'])[2]/a")).getText();
		System.out.println(Rating);
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandlesList =new ArrayList<String>();
		windowHandlesList.addAll(windowHandlesSet);
		
		driver.switchTo().window(windowHandlesList.get(1).toString());
		driver.findElement(By.id("add-to-cart-button")).click();
		String SubTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println();
		File screenShot = driver.getScreenshotAs(OutputType.FILE);

		File image = new File("./snaps/Amazon.jpg");
		// Merging temp screenshot and image file togeather
		FileUtils.copyFile(screenShot, image);
		if(price.contains(SubTotal))
		{
			System.out.println("Proceed to buy");
		}
		else
		{
			System.out.println("Check the selection again");
		}
	}
}
