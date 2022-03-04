package week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement elementLead = driver.findElement(By.linkText("Leads"));
		elementLead.click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//em[@class='x-tab-left']//span[@class='x-tab-strip-text '])[3]")).click();
		WebElement elementEmail = driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']"));
		elementEmail.sendKeys("test@gmail.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(3000);
		WebElement elementFirstRecord = driver.findElement(By.xpath("(//div[contains(@class,'-col-firstName')]/a[@class='linktext'])[1]"));
		String fname = elementFirstRecord.getText();
		System.out.println("Original First name of record is : "+fname);
		elementFirstRecord.click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println("Page Title is : "+driver.getTitle());
		driver.findElement(By.id("createLeadForm_primaryEmail")).clear();
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testABC@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement elementDupFirstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String dfname = elementDupFirstName.getText();
		System.out.println("Duplicated first name of record is : "+dfname);
		if (fname.equals(dfname)) {
			System.out.println("Duplicated successfully - Duplicated name is same as original name - Test case passed");
		}
		else {
			System.out.println("Not Duplicated - Test case failed");
		}
		driver.close();
	}
}
