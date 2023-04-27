package ccm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\QA\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open the URL
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click the workspace
		driver.findElement(By.id("testing")).click();

		//Click drag button
		driver.findElement(By.xpath("//a[@class='card-footer-item' and @href='/draggable']")).click();

		//Element which need to drag.	
		WebElement From = driver.findElement(By.xpath("//*[@id=\"header\"]"));

		//Element which need to drop
		WebElement To = driver.findElement(By.xpath(""));

		//Using Action class for drag and drop.
		Actions act = new Actions(driver);

		//Drag and Drop by Offset.	
		act.dragAndDrop(From, To).build().perform();

		//verify text changed in to 'Drop here' box 
		String textTo = To.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}



	}

}
