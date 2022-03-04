package week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launch Testing URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the chrome page
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Find User name field and Enter User name value
		WebElement elementUsername = driver.findElement(By.xpath("//label[@for = 'username']/following-sibling::input[@id = 'username']"));
		elementUsername.sendKeys("Demosalesmanager");
		//Find Password field and enter password
		WebElement elementPassword = driver.findElement(By.xpath("//label[@for = 'password']/following-sibling::input[@id = 'password']"));
		elementPassword.sendKeys("crmsfa");
		//Find Submit field and Click Submit button
		WebElement elementSubmit = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		elementSubmit.click();
		//Find  and Click CRM/SFA text link
		WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementCRMSFA.click();
		//Find and Click Lead Menu
		WebElement elementLead = driver.findElement(By.linkText("Leads"));
		elementLead.click();
		//Find and click Find leads menu
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Search with first name
		WebElement elementFirstName = driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]"));
		elementFirstName.sendKeys("Test");
		//click find leads button
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(3000);
		//Click on first displayed record //*[@id="ext-gen877"]
		//WebElement elementFirstRecord = driver.findElement(By.xpath("(//div[@class='x-grid3-scroller']//table[@class='x-grid3-row-table']//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class='linktext'])[1]"));
		WebElement elementFirstRecord = driver.findElement(By.xpath("(//div[contains(@class,'-col-partyId')]/a)[1]"));
		elementFirstRecord.click();
		System.out.println("Page Title is : "+driver.getTitle());
		//Click Edit button
		driver.findElement(By.linkText("Edit")).click();
		//find and edit company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		WebElement elementEditCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		elementEditCompany.sendKeys("ASD Company");
		//click update button
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		//check the update value appears
		WebElement elementUpdatedCompName = driver.findElement(By.id("viewLead_companyName_sp"));
		String str = elementUpdatedCompName.getText();
		System.out.println("Updated company name is : "+str);
		String name = str;
		if (name.contains("ABCD")) {
			System.out.println("Update successfully - Test case passed");
		}
		else {
			System.out.println("Not updated - Test case failed");
		}
		driver.close();
	}
}
