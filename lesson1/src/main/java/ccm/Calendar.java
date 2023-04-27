package ccm;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Open the URL
		driver.get("https://letcode.in/calendar");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//click on today date
		WebElement dateBox = driver.findElement(By.xpath("//div[@class='datetimepicker is-danger is-active']//button[@type='button'][normalize-space()='Today']"));
		dateBox.click();

		//click on calendar
		WebElement cal = driver.findElement(By.xpath("//input[@class='datetimepicker-dummy-input is-datetimepicker-range']"));
		cal.click();

		//click on start date
		driver.findElement(By.xpath("//div[@class='datepicker is-active']//div[@class='datepicker-date is-current-month']//button[@type='button'][normalize-space()='4']")).click();

		//click on end date
		driver.findElement(By.xpath("//div[@class='datepicker is-active']//button[@type='button'][normalize-space()='17']")).click();

		// Select time after 2 hrs
		Actions act = new Actions(driver);
		WebElement y= driver.findElement(By.xpath("//div[@class='timepicker-hours']//span[@class='timepicker-next'][normalize-space()='+']"));
		act.doubleClick(y).perform();
	}

}
