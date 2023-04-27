package ccm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Open the URL and click table button
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Add all prices and check if the total is correct
		List<WebElement> element = driver.findElements(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]"));
		for(WebElement li:element)
		{
			System.out.println(li.getText());
		}

		List<WebElement> element1 = driver.findElements(By.xpath("//div[@class='refinement brand']/descendant::a/span[2]"));
		int sum = 0;
		for(WebElement li1:element1)
		{
			System.out.println(li1.getText());
			String s = li1.getText().replace("(", "");
			sum = sum + Integer.parseInt(s.replace(")", ""));
		}


		System.out.println("Total sum is: " + sum);
		int totalAppearingOnPage = Integer.parseInt(driver.findElement(
				By.xpath("//*[@id=\"shopping\"]/tfoot/td[2]/b")).
				getText());
		System.out.println("Total appearing on page: " + totalAppearingOnPage);



	}

}
