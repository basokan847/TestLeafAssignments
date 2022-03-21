package week4.Day2.Assignments;

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
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		
		driver.findElement(By.xpath("(//li[@class='brand-logo menu-links'])[5]/a")).click();
		
		driver.findElement(By.xpath("//button[@class=' css-n0ptfk']/span")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		String filter1 = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
		String filter2 = driver.findElement(By.xpath("(//span[@class='filter-value'])[2]")).getText();
		
		if(filter1.equalsIgnoreCase("Shampoo") && filter2.equalsIgnoreCase("Color Protection"))
		{
			System.out.println("Selection is correct, proceed with product selection");
		}
		
		driver.findElement(By.xpath("((//div[@class='css-1rd7vky'])[1]/div)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>();
		windowHandlesList.addAll(windowHandles);
		
		driver.switchTo().window(windowHandlesList.get(1).toString());
		String price = driver.findElement(By.xpath("((//div[@class='css-1d0jf8e'])[1]/span)[2]")).getText();
		System.out.println(price.substring(1));
		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		File image = new File("./snaps/Nykaa.jpg");
		// Merging temp screenshot and image file togeather
		FileUtils.copyFile(screenShot, image);
		
		driver.findElement(By.xpath("(//span[text()='ADD TO BAG'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.switchTo().frame(0);
		String grandTotal = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
		System.out.println(grandTotal.substring(1));
		driver.findElement(By.xpath("//span[text()='PROCEED']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		
		
		
		String grandTotalV = driver.findElement(By.xpath("(//div[@class='value'])[2]/span")).getText();
		if(grandTotal.contains(grandTotalV)) {
			System.out.println("Execution is successful");
			driver.quit();
		}
	}
}
