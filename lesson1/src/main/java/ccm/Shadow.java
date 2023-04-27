package ccm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Shadow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		//Open the URL
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		//Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Click the workspace
		driver.findElement(By.id("testing")).click();

		//Click shadow button
		driver.findElement(By.xpath("//a[@href='/shadow' and @class='card-footer-item']")).click();

		//shadow root open
		WebElement shadowHost = driver.findElement(By.id("open-shadow"));
		SearchContext shadowRoot=  shadowHost.getShadowRoot();
		shadowRoot.findElement(By.cssSelector("#fname")).sendKeys("Durka");

		//shadow root closed lastname
		driver.findElement(By.xpath("//div[@class='field']//my-web-component")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Rajakulendiran").perform();

	}

}
