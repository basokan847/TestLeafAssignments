package week4.Day1.Assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsandFrames {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		File screenShot = driver.getScreenshotAs(OutputType.FILE);

		File image = new File("./snaps/Alerts.jpg");
		// Merging temp screenshot and image file togeather
		FileUtils.copyFile(screenShot, image);
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if (text.contains("OK")) {
			System.out.println("Execution is successfull and user pressed OK");
		}
		else {
			System.out.println("Execution is successfull and user pressed CANCEL");
		}
	}
}
