package ccmm ;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.silentOutput", "true");
		//Open browser

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


		//Open the URL and click table button
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();

		//Check if the sorting is working properly
		int rowSize = 7;
		ArrayList<TableData> list = new ArrayList<>();
		for (int a = 2; a<rowSize; a++) {
			WebElement fat = driver.findElement(By.xpath("//div[@class='card-conetnt']//tr[" + a + "]//td[2]"));
			WebElement carbs =driver.findElement(By.xpath("//div[@class='card-conetnt']//tr[" + a + "]//td[2]"));
			int fatvalue = Integer.parseInt(fat.getText());

			List.add(new TableData(fatvalue,dessert.getText());

			System.out.println(fat.getText());
			System.out.println(carbs.getText());
		}
		driver.quit();
	}
	class TableData {
		Integer fat;
		String dessert;

		public TableData(Integer fat, String dessert) {
			this.fat = fat;
			this.dessert = dessert;
		}
	}


}
