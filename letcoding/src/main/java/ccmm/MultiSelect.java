package ccmm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Open the URL and click selectable button
		driver.get("https://letcode.in/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Print the list of elements
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\"selectable\"]"));

		int listSize = selectable.size();
		System.out.println(listSize);

		//Select selenium, protractor and appium

		Actions act = new Actions(driver);
		List<WebElement>list = driver.findElements(By.xpath("//div[@id='container']/div"));


		Action actions= act.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(1))
				.click(list.get(2)).click(list.get(3)).click(list.get(4)).click(list.get(5))
				.click(list.get(6)).click(list.get(7)).click(list.get(8)).build();

		actions.perform();





		/*Actions actions1 = new Actions(driver);
		actions1.click(selectable.get(0));
		actions1.click(selectable.get(1));
		actions1.click(selectable.get(2));
		actions1.click(selectable.get(3));
		actions1.click(selectable.get(4));
		actions1.click(selectable.get(5));
		actions1.click(selectable.get(6));
		actions1.click(selectable.get(7));
		actions1.click(selectable.get(8));
		actions1.build().perform();*/
	}

}
