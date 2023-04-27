package ccm ;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table3 {

	public enum TableData {



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
			ArrayList<TableData> list = new ArrayList<TableData>();
			
			for (int a = 2; a<rowSize; a++) {
				WebElement fat = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/tr[" + a + "]/td[2]"));
				WebElement dessert =driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/tr[" + a + "]/td[1]"));

				int fatvalue = Integer.parseInt(fat.getText());
				list.add(new TableData1(fatvalue,dessert.getText()));

				System.out.println(fat.getText());
				System.out.println(dessert.getText());
			}

		}
	}
	
	class TableData1 {
		Integer fat;
		String dessert ;

		public TableData1(Integer fat, String dessert) {
			super();
			this.fat = fat;
			this.dessert = dessert;
		}
		

	}
