package week4.Day1.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elementUsername = driver.findElement(By.xpath("//label[@for = 'username']/following-sibling::input[@id = 'username']"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.xpath("//label[@for = 'password']/following-sibling::input[@id = 'password']"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementSubmit = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		elementSubmit.click();
		WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementCRMSFA.click();
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		//Thread.sleep(3000);
		Set<String> windowHandlesSet1 = driver.getWindowHandles();
		System.out.println(windowHandlesSet1);
		List<String> allWindowHandleList = new ArrayList<String>();
		allWindowHandleList.addAll(windowHandlesSet1);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		driver.switchTo().window(allWindowHandleList.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'-col-partyId')]/a[@class='linktext'])[1]")).click();
		driver.switchTo().window(allWindowHandleList.get(0));
		Thread.sleep(3000);
		//String windowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandlesSet2 = driver.getWindowHandles();
		System.out.println(windowHandlesSet2);
		List<String> allWindowHandleList1 = new ArrayList<String>();
		allWindowHandleList1.addAll(windowHandlesSet2);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		driver.switchTo().window(allWindowHandleList1.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'-col-partyId')]/a[@class='linktext'])[2]")).click();
		driver.switchTo().window(allWindowHandleList.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());
		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);

		File image = new File("./snaps/MergeContact.jpg");
		// Merging temp screenshot and image file togeather
		FileUtils.copyFile(screenShot, image);
		driver.close();
	}
}
