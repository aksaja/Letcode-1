package ccm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sort {



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

		//Click sort button
		driver.findElement(By.xpath("//a[@href='/sortable']")).click();


		List<WebElement> elements=driver.findElements(By.id("sample-box1"));

		//Drag and drop for element8
		WebElement  fromElement = elements.get(8);
		WebElement toElement= elements.get(0);

		Actions actions = new Actions(driver);
		actions.clickAndHold(fromElement);
		actions.moveToElement(toElement);
		actions.release(toElement);
		actions.build().perform();
		
		
		//Drag and drop for element7

		/*WebElement  fromElement1 = elements.get(7);
		WebElement toElement1= elements.get(1);

		Actions actions1 = new Actions(driver);
		actions1.clickAndHold(fromElement1);
		actions1.moveToElement(toElement1);
		actions1.release(toElement1);
		actions1.build().perform();*/

	}

}
