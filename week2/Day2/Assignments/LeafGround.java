package week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
		WebElement elementAppend = driver.findElement(By.xpath("//input[@value='Append ']"));
		String app = elementAppend.getAttribute("value");
		elementAppend.clear();
		elementAppend.sendKeys(app+"appended additional text");
		System.out.println(elementAppend.getAttribute("value"));
		//driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
		System.out.println(driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value"));
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		WebElement elementDisabled = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		if(elementDisabled.isEnabled()) {
			System.out.println("The selected field is enabled");
		}
		else {
			System.out.println("The selected field is disabled");
		}
	}
}
