package ccmm;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\QA\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open the URL and click wait button
		driver.get("https://letcode.in/waits");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.id("accept")).click();

		//Then, Initialize a Wait Object using WebDriverWait Class.
	//	WebDriverWait wait = new WebDriverWait(driver, 50);


		//To wait for an alert
		
		Alert alert =Wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();

		





	}

	
	}





