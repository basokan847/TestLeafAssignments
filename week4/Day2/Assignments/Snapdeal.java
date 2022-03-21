package week4.Day2.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("(//span[contains(text(),'Fashion')])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String countOfShoes = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println(countOfShoes);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		driver.findElement(By.xpath("//div[contains(@class,'sort-drop')]/i")).click();
		
		WebElement fromValue = driver.findElement(By.name("fromVal"));
		fromValue.clear();
		fromValue.sendKeys("549");
		WebElement toValue = driver.findElement(By.name("toVal"));
		toValue.clear();
		toValue.sendKeys("1200");
		//driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		
		//String color = driver.findElement(By.xpath("(//div[text()='Color: '])[1]/a")).getText();
		//String priceRange = driver.findElement(By.xpath("(//div[text()='Price: '])[1]/a")).getText();
		
		
		Actions builder=new Actions(driver);
		WebElement img = driver.findElement(By.xpath("//p[@class='product-title']"));
		builder.moveToElement(img).perform();
		
		
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]")).click();
		
		String priceTot = driver.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']/span)[1]")).getText();
		String offer = driver.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']/span)[2]")).getText();
		System.out.println(priceTot);
		System.out.println(offer);
		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		File image = new File("./snaps/SnapDeal.jpg");
		// Merging temp screenshot and image file togeather
		FileUtils.copyFile(screenShot, image);
		
		driver.close();
	}
}
