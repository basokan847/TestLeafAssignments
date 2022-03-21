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

public class AlertsandWindowHandle {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandlesList =new ArrayList<String>();
		windowHandlesList.addAll(windowHandlesSet);
		
		driver.switchTo().window(windowHandlesList.get(1).toString());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(100);
		driver.findElement(By.xpath("//button[text()='Later']")).click();
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		String text = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[3]")).getText();
		System.out.println(text);
		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);

		File image = new File("./snaps/IRCTC.jpg");
		// Merging temp screenshot and image file togeather
		FileUtils.copyFile(screenShot, image);
		
		driver.switchTo().window(windowHandlesList.get(0).toString());
		driver.close();
	}
}
