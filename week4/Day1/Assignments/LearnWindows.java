package week4.Day1.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println(currentWindowHandle);
		driver.findElement(By.id("home")).click();
		
		//Need to get all window references as a set
		Set<String> allWindowHandleSet = driver.getWindowHandles();
		System.out.println(allWindowHandleSet);
		
		// To get the unique value out of the Set, We are converting Set -> List
		List<String> allWindowHandleList = new ArrayList<String>();
		allWindowHandleList.addAll(allWindowHandleSet);
		System.out.println(allWindowHandleList);
		
		// Get the unique reference from the list
		String newWindow = allWindowHandleList.get(1);
		
		// Switching to the new window
		driver.switchTo().window(newWindow);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(allWindowHandleList.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
