package week4.Day2.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableTableSort {

	public static void main(String[] args) throws IOException {
		String progress = null;
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement elementTable = driver.findElement(By.id("table_id"));

		List<WebElement> rowCount = elementTable.findElements(By.tagName("tr"));
		WebElement row = rowCount.get(1);
		List<WebElement> colm = row.findElements(By.tagName("td"));

		System.out.println("RowCount : " + rowCount.size());
		System.out.println("ColumnCount : " + colm.size());

		for (int i = 1; i < rowCount.size(); i++) {
			WebElement eachrow = rowCount.get(i);
			WebElement tdeachCol = eachrow.findElements(By.tagName("td")).get(0);

			if (tdeachCol.getText().equalsIgnoreCase("Learn to interact with elements")) {
				progress = eachrow.findElements(By.tagName("td")).get(1).getText();

			}

		}
		String substring = progress.substring(0, progress.length()-1);
	
		System.out.println("Progress of 'Learn to interact with elements' : "+substring);
		
		int arr[] = new int[rowCount.size()-1];
		for (int i = 1; i < rowCount.size(); i++) {
			WebElement eachrow = rowCount.get(i);
			WebElement tdeachCol = eachrow.findElements(By.tagName("td")).get(1);
			String text = tdeachCol.getText();
			System.out.println(text.substring(0, text.length()-1));
			int parseInt = Integer.parseInt(text.substring(0, text.length()-1));
			arr[i-1]=parseInt;

		}
		Arrays.sort(arr);
		System.out.println("Least progresss percentage: "+arr[0]);
		
		String verify=arr[0]+"";
		for (int i = 1; i < rowCount.size(); i++) {
			WebElement eachrow = rowCount.get(i);
			WebElement tdeachCol = eachrow.findElements(By.tagName("td")).get(1);
			if (tdeachCol.getText().contains(verify)) {
				eachrow.findElements(By.xpath("//td/input")).get(2).click();
			}

		}
		
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		File image = new File("./snaps/webtable.jpg");
		// Merging temp screenshot and image file togeather
		FileUtils.copyFile(screenShot, image);
	}
}
