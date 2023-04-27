package ccm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Links;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


		//Open the URL and click slider button
		driver.get("https://letcode.in/slider");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Move the slider between 1 to 50
		driver.findElement(By.xpath("//input[@id='generate']")).click();

		//Click on the get countries button
		driver.findElement(By.xpath("//button[@class = 'button is-primary']")).click();

		//Validate that countries are generated based on slider values
		//Print the list of elements
				List<WebElement> selectable=driver.findElements(By.xpath("//p[@class = 'has-text-primary-light']"));
				for (WebElement link : selectable)  {
				System.out.println(link.getText());








	}

}
}