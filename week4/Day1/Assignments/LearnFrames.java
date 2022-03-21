package week4.Day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriver frame1 = driver.switchTo().frame(0);
		System.out.println(frame1.getTitle());
		WebElement frameButton = driver.findElement(By.xpath("//button[@id='Click']"));
		frameButton.click();
		System.out.println(frameButton.getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
