package ccmm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.silentOutput", "true");
		//Open browser
		WebDriver.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Open the URL and click table button
		driver.get("https://letcode.in/advancedtable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int rowSize = 49;
		
		for (int i = 2; i<rowSize; i++) {
			WebElement univerity = driver.findElement(By.xpath("//*[@id=\"advancedtable\"]/tbody/tr[" + i + "]/td[2]"));
			WebElement countryt =driver.findElement(By.xpath("//*[@id=\"advancedtable\"]/tbody/tr[" + i + "]/td[3]"));
		System.out.println(univerity.getText());
		System.out.println(countryt.getText());
		}
		driver.quit();
		}


}
