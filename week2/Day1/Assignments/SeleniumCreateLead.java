package week2.Day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launch Testing URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the chrome page
		driver.manage().window().maximize();
		//Find User name field and Enter User name value
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		//Find Password field and enter password
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		//Find Submit field and Click Submit button
		WebElement elementSubmit = driver.findElement(By.className("decorativeSubmit"));
		elementSubmit.click();
		//Find  and Click CRM/SFA text link
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		//Find and Click Lead Menu
		WebElement elementLead = driver.findElement(By.linkText("Leads"));
		elementLead.click();
		//Find and Click Create lead
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		//Find and Enter company name
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Fss");
		//Find First and last name and Enter value
		WebElement elementFirst = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirst.sendKeys("Baskar");
		WebElement elementLast = driver.findElement(By.id("createLeadForm_lastName"));
		elementLast.sendKeys("A");
		//Find Department field and enter value
		WebElement elementDept = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDept.sendKeys("Test Dept");
		//Find Description field and enter value
		WebElement elementDesc = driver.findElement(By.id("createLeadForm_description"));
		elementDesc.sendKeys("Creating new Lead");
		//Find Email field and enter value
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("test@gmail.com");
		//Select and choose the State/Province value
		WebElement elementStateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statedd = new Select(elementStateDropdown);
		statedd.selectByVisibleText("New York");
		//enter mobile number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		//Select and Submit create lead
		WebElement elementClickCreateLead = driver.findElement(By.className("smallSubmit"));
		elementClickCreateLead.click();
		//Get and print the title of given page
		driver.getTitle();
		System.out.println("Title of result page is : "+driver.getTitle());
		driver.close();
	}
}
